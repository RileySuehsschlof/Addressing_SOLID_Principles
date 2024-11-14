package org.example.Solved.ISP;

public class NPC implements Attack {
    @Override
    public void attack(){
        System.out.println("NPC attacks");
        //NPC only has to implement functions that it needs unlike in the violated example.
    }
}
