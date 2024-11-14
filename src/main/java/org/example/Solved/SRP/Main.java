package org.example.Solved.SRP;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream("Bubblegum", 8.99, 100);
        Discount discount = new Discount();

        double dis = discount.calculateDiscount(iceCream.getCost(), iceCream.getAmount());
        iceCream.applyDiscount(dis);
        //This way, the IceCream class isnt responsible for handling the details of figuring out the
        //discount, only updating the cost of itself which falls into SRP.

        System.out.println("Final cost after discount: " + iceCream.getCost());
    }
}
