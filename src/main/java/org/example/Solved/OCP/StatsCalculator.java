package org.example.Solved.OCP;

public class StatsCalculator {
    public int calculateStats(Player player){
        return player.calculateStats();
    }
    //OC allows for new things to be added without modifying the previous code.
    //This way you dont have to add more else if statements for every new type of player.


    public class BaseballPlayer implements Player{
        //This allows new types of players to be created and get their scores.
        //The player depends on the interface that defines the methods it has to implement
        @Override
        public int calculateStats() {
            return getRuns();
        }
        //Implementing it this way allows for the details not to matter.
        public int getRuns(){
            return 5;
        }
    }
}
