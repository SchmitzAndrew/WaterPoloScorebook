//extension of player that stores data for the entire team

public class Team extends Player{

    public Team(String number, String name, boolean homeTeam, int goals, int ejections) {
        super(number, name, homeTeam, goals, ejections);
    }
}
