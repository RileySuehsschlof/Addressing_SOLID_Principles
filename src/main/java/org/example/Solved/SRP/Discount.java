package org.example.Solved.SRP;

public class Discount {
    public double calculateDiscount(double cost, int amount) {
        if (amount > 10) {
            return cost * 0.3;
        }
        return cost;
    }
}
