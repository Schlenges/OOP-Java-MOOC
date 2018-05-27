
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        // Print the top ten players based on goals
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");
        // Print the top 25 players based on penalty amounts
        System.out.println("Top ten by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
        // Print the statistics for Sidney Crosby
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
                System.out.println("");
        // Print the statistics for Philadelphia Flyers
        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("");
        // Print the players in Anaheim Ducks ordered by points
        System.out.println("Statistics for Anaheim Ducks by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
