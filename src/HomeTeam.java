//extension of player that stores data for the entire team
import java.util.ArrayList;

public class HomeTeam{
    private String myAwayName;
    private int myAwayGoals;
    private int myAwayEjections;
    ArrayList<Player> myHomeTeam = new ArrayList<Player>();
    Coach myHomeCoach = new Coach("",0,0,0);

    public HomeTeam(String name, int goals, int ejections, ArrayList team, Coach coach) {

        myHomeTeam = team;
        myHomeCoach = coach;
    }
}
