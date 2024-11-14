package org.example.Violated.ISP;

public class NPC implements Character {

    @Override
    public void attack() {
        System.out.println("NPC attacks");
    }

    @Override
    public void loot() {
    //Violates ISP because NPC doesn't need the loot method, but still has to implement it.
    }
}
