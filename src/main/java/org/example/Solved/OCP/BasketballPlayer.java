package org.example.Solved.OCP;

public class BasketballPlayer implements Player{
    @Override
    public int calculateStats() {
        return getPoints();
    }
    public int getPoints(){
        return 10;
    }
}
