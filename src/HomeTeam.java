//extension of player that stores data for the entire team
import java.util.ArrayList;

public class HomeTeam extends Player{
    ArrayList<Player> myHomeTeam = new ArrayList<Player>();
    Coach myHomeCoach = new Coach("",0,0,0);

    public HomeTeam(String number, String name, int goals, int ejections, ArrayList team, Coach coach) {
        super(number, name, goals, ejections);
    }
}
