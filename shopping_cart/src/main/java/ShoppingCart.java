import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
	
	public static List<CartItem> cartItems = new ArrayList<CartItem>();
	
	public void addItem(CartItem item){
		if(!cartItems.isEmpty()){
			//Get the existing item
			List<CartItem> existItems = new ArrayList<CartItem>();
			cartItems.stream().filter(ci -> ci.getItem().getName().equals(item.getItem().getName()))
								.collect(Collectors.toCollection(() -> existItems));
			if(existItems != null && !existItems.isEmpty()){
				CartItem existItem = existItems.get(0);
				//Remove this object from the list
				cartItems.remove(existItem);
				//Add the quantity
				int existItemQuantity = existItem.getQuantity();
				existItem.setQuantity(item.getQuantity()+existItemQuantity);
				//Add again the item to the cart
				cartItems.add(existItem);
				return;
			} 
		} 
		cartItems.add(item);
	}
	
	public void checkout(){
		
		if(!cartItems.isEmpty()){
			cartItems.stream().forEach(ci ->  System.out.println("- "+ci.getQuantity()+" "+ci.getItem().getName()+" : "+(ci.getItem().getPrice() * ci.getQuantity())));
			//Get the total bill
			System.out.println("Total : "+cartItems.stream().map(ci2 -> ci2.getItem().getPrice() * ci2.getQuantity()).mapToDouble(total -> total).sum());
		}
		
	}
}
