package main.java.org.hillcrest.chapter4.shopping;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var myShoppingCart = new ShoppingCartCalculator();

        System.out.println("\nWelcome to your Shopping Cart!");

        System.out.print("\nEnter the first item's name: ");
        String name1 = in.next();
        System.out.print("Enter the first item's price: ");
        double price1 = in.nextFloat();
        System.out.print("Enter the first item's quantity: ");
        int quantity1 = in.nextInt();

        System.out.print("\nEnter the second item's name: ");
        String name2 = in.next();
        System.out.print("Enter the second item's price: ");
        double price2 = in.nextFloat();
        System.out.print("Enter the second item's quantity: ");
        int quantity2 = in.nextInt();

        Item item1 = new Item(name1, price1, quantity1);
        Item item2 = new Item();
        item2.setName(name2);
        item2.setPrice(price2);
        item2.setQuantity(quantity2);

        System.out.printf("\nItem 1: %s\n", item1.getName());
        double item1Subtotal = myShoppingCart.calculateSubtotal(item1);
        System.out.printf("Subotatal: $%.2f\n", item1Subtotal);

        System.out.printf("\nItem 2: %s\n", item2.getName());
        double item2Subtotal = myShoppingCart.calculateSubtotal(item2);
        System.out.printf("Subotatal: $%.2f\n", item2Subtotal);

        double cartSubtotal = item1Subtotal + item2Subtotal;
        System.out.printf("\nCart Subtotal: $%.2f", cartSubtotal);

        double cartSalesTax = myShoppingCart.calculateSalesTax(cartSubtotal);
        System.out.printf("\nSales Tax (8%%): $%.2f\n", cartSalesTax);

        double cartShipping = myShoppingCart.calculateShipping(cartSubtotal);
        System.out.printf("Shipping Cost: $%.2f\n", cartShipping);

        double cartTotal = myShoppingCart.calculateTotal(cartSubtotal, cartSalesTax, cartShipping);
        System.out.printf("\nTotal: $%.2f\n", cartTotal);
    }
}
