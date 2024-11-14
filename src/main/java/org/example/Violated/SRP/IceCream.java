package org.example.Violated.SRP;

public class IceCream {
    public String flavor;
    public double cost;
    public int amount;

    public IceCream(String flavor, double cost, int amount) {
        this.flavor = flavor;
        this.cost = cost;
        this.amount = amount;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    //Violates SRP because discount isnt the responsibility of the icecream class
    public double calculateDiscount(IceCream icecream){
        int amount = icecream.getAmount();
        double cost = icecream.getCost();
        if (amount > 10){
            return cost*.30;
        }
        else {
            return cost;
        }
    }
}
