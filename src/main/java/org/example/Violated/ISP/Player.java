package org.example.Violated.ISP;


public class Player implements Character {
    @Override
    public void attack() {
        System.out.println("Player attacks!");
    }
    @Override
    public void loot(){
        System.out.println("Player loots");
    }
}