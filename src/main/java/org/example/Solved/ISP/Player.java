package org.example.Solved.ISP;

public class Player implements Attack, Loot {
    public void attack(){
        System.out.println("Player attacks");
    }
    public void loot(){System.out.println("Player loots");}
    //Player still has both actions from the old character interface in violated example
}
