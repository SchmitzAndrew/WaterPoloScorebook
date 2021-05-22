//extension of player that stores data for the entire team
import java.util.ArrayList;

public class AwayTeam{
    private String myAwayName;
    private int myTeamGoals;
    private int myTeamEjections;
    ArrayList<Player> myAwayTeam = new ArrayList<Player>();
    Coach myAwayCoach = new Coach("",0,0,0);
    public AwayTeam( String name, int goals, int ejections, ArrayList team, Coach coach) {

        myAwayTeam = team;
        myAwayCoach = coach;
    }
}
