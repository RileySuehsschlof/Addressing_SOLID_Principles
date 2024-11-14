package org.example.Violated.SRP;

public class Main {
    public static void main(String[] args) {
        // Create an IceCream object with a specific flavor, cost, and amount
        IceCream iceCream = new IceCream("Chocolate", 10.0, 25);

        // Calculate the discount
        double discount = iceCream.calculateDiscount(iceCream);

        System.out.println("Final Cost after Discount: $" + (iceCream.getCost() - discount));
    }
}
