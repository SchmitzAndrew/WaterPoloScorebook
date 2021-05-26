import java.util.ArrayList;

public class Book {
    public static void main(String[] args) {
        Game game = new Game();


        //Create Home Team
        ArrayList homePlayers = game.createHomePlayers();
        Coach homeCoach = game.createHomeCoach();
        HomeTeam homeTeam = new HomeTeam("Broncos", 0, 0, homePlayers, homeCoach);
        homeTeam.displayHomeTeam();

        //Create Away Team
        ArrayList awayPlayers = game.createAwayPlayers();
        Coach awayCoach = game.createAwayCoach();
        AwayTeam awayTeam = new AwayTeam("Broncos", 0, 0, awayPlayers, awayCoach);
        awayTeam.displayAwayTeam();

        //Simulate a Game
        System.out.println("Quarter 1 Start");
        homeTeam.myHomeTeam.get(3).goalScored();
        homeTeam.myHomeTeam.get(4).ejectionEarned();
        awayTeam.myAwayTeam.get(0).goalScored();
        homeTeam.myHomeTeam.get(5).goalScored();

        game.updateTeams(homeTeam, awayTeam);


    }
}
