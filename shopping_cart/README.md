# Shopping Cart
You have to implement a shopping cart for a grocery store.

## Add item(s) to your cart
An item is defined by the following:

* Name
* Price
We should be able to specify the quantity to be added

_Example:_

> Apple: 0.75

## Checkout
For each item in our cart, print the detailed bill.

_Example:_

> - 3 apples : 2.25
> - 1 soap : 2.30
> 
>   Total : 4.55 sgd

Price should be displayed with 2 decimals.

## Remove item(s) from your cart
Remove a specific item from the cart. We should be able to specify quantity to be removed

## Promotions
Time to time, the shop has promotions. A promotions consists of:

* Item id/name
* Number of item for promotion
* Discount applied 

_Example:_

> Buy 3 apples and pay only for 2

## Print promotions
If a promotion is applied, reflect it in the bill.

_Example:_

> -  3 apples (promotion 3 for 2): 1.50 
> -  1 soap : 2.30
> Total : 4.55 sgd

## Suggest promotions
If an item in the cart has potential promotions, suggest it when you checkout (print the bill).

_Example:_

> -  2 apples: 1.50 
> -  1 soap : 2.30
> - Total : 4.55 sgd
> - You can get an extra apple for free.


