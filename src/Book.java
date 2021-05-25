import java.util.ArrayList;

public class Book {
    public static void main(String[] args) {
        Game play = new Game();


        //Create Home Team
        ArrayList homePlayers = play.createHomePlayers();
        Coach homeCoach = play.createHomeCoach();
        HomeTeam homeTeam = new HomeTeam("Broncos", 0, 0, homePlayers, homeCoach);

        //Create Away Team
        ArrayList awayPlayers = play.createAwayPlayers();
        Coach awayCoach = play.createAwayCoach();
        AwayTeam awayTeam = new AwayTeam("Broncos", 0, 0, awayPlayers, awayCoach);


    }
}
