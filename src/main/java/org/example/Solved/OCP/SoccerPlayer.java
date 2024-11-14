package org.example.Solved.OCP;

public class SoccerPlayer implements Player{
    @Override
    public int calculateStats() {
        return getGoals();
    }
    public int getGoals(){
        return 40;
    }
}
