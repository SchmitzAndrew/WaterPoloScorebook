//extension of player that stores data for the entire team
import java.util.ArrayList;

public class AwayTeam extends Player{
    ArrayList<Player> myAwayTeam = new ArrayList<Player>();
    Coach myAwayCoach = new Coach("",0,0,0);
    public AwayTeam(String number, String name, int goals, int ejections, ArrayList team, Coach coach) {
        super(number, name, goals, ejections);
    }
}
