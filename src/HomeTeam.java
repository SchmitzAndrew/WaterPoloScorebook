//extension of player that stores data for the entire team
import java.util.ArrayList;

public class HomeTeam {
    private final String myHomeName;
    private int myHomeGoals;
    private int myHomeEjections;
    ArrayList<Player> myHomeTeam;
    Coach myHomeCoach;

    public HomeTeam(String name, int goals, int ejections, ArrayList team, Coach coach) {
        myHomeName = name;
        myHomeGoals = goals;
        myHomeEjections = ejections;
        myHomeTeam = team;
        myHomeCoach = coach;
    }

    public String getMyHomeName() {
        return myHomeName;
    }

    public int getMyHomeGoals() {
        return myHomeGoals;
    }

    public void setMyHomeGoals(int myHomeGoals) {
        this.myHomeGoals = myHomeGoals;
    }

    public int getMyHomeEjections() {
        return myHomeEjections;
    }

    public void setMyHomeEjections(int myHomeEjections) {
        this.myHomeEjections = myHomeEjections;
    }

}
