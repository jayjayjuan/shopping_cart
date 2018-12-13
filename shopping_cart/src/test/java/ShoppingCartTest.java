import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void testCart(){
		Item apple = new Item("apple", 0.75);
		Item soap = new Item("soap", 2.30);
		CartItem ci = new CartItem(apple, 1);
		CartItem ci2 = new CartItem(apple, 1);
		CartItem ci3 = new CartItem(apple, 1);
		CartItem soapItem = new CartItem(soap, 1);
		int supposedNumOfItems = 1;
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(ci);
		cart.addItem(ci2);
		cart.addItem(ci3);
		cart.addItem(soapItem);
		cart.checkout();
//		assertEquals(supposedNumOfItems, ShoppingCart.cartItems.size());
	}
}