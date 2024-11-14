package org.example.Solved.SRP;

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

    //Fix: Move this function to its own class to follow SRP

//    public double calculateDiscount(){
//        if (amount > 10){
//            return cost*.30;
//        }
//            return cost;
//    }

    //Add this function to
    public void applyDiscount(double discountAmount) {this.cost -= discountAmount;}

}
