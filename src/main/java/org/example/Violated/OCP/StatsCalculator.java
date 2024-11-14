package org.example.Violated.OCP;

public class StatsCalculator {
    public class StatCalculator{
        public int calculate(Object player) throws Exception {
            if (player instanceof SoccerPlayer){
                return ((SoccerPlayer) player).getGoals();
            }
            else if (player instanceof BasketballPlayer){
                return ((BasketballPlayer) player).getPoints();
            }
            else {
                throw new Exception();
            }
            //This violates OCP because if there was to be a new
//          // type of player, the code here would have to be modified
        }
    }
}
