//extension of player that stores data for the entire team
import java.util.ArrayList;

public class AwayTeam{
    private final String myAwayName;
    private int myAwayGoals;
    private int myAwayEjections;
    ArrayList<Player> myAwayTeam;
    Coach myAwayCoach;

    public AwayTeam( String name, int goals, int ejections, ArrayList team, Coach coach) {
        myAwayName = name;
        myAwayGoals = goals;
        myAwayEjections = ejections;
        myAwayTeam = team;
        myAwayCoach = coach;
    }

    public String getMyAwayName() {
        return myAwayName;
    }

    public int getMyAwayGoals() {
        return myAwayGoals;
    }

    public void setMyAwayGoals(int myAwayGoals) {
        this.myAwayGoals = myAwayGoals;
    }

    public int getMyAwayEjections() {
        return myAwayEjections;
    }

    public void setMyAwayEjections(int myAwayEjections) {
        this.myAwayEjections = myAwayEjections;
    }
}
