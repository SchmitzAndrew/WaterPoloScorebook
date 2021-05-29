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
        AwayTeam awayTeam = new AwayTeam("Wolverines", 0, 0, awayPlayers, awayCoach);
        awayTeam.displayAwayTeam();

        //Simulate a Game
        System.out.println("Quarter 1 Start");
        homeTeam.myHomeTeam.get(3).goalScored();
        homeTeam.myHomeTeam.get(4).ejectionEarned();
        awayTeam.myAwayTeam.get(0).goalScored();
        homeTeam.myHomeTeam.get(5).goalScored();


        game.updateTeams(homeTeam, awayTeam);
        game.displayTeams(homeTeam, awayTeam);

        System.out.println("Quarter 2 Start");
        homeTeam.myHomeTeam.get(5).goalScored();
        homeTeam.myHomeTeam.get(4).goalScored();
        homeTeam.myHomeTeam.get(3).ejectionEarned();
        awayTeam.myAwayTeam.get(6).goalScored();
        awayTeam.myAwayTeam.get(2).goalScored();

        game.updateTeams(homeTeam, awayTeam);
        game.displayTeams(homeTeam, awayTeam);

        System.out.println("Quarter 3 Start");
        homeTeam.myHomeTeam.get(3).goalScored();
        homeTeam.myHomeTeam.get(5).goalScored();
        homeTeam.myHomeTeam.get(3).ejectionEarned();

        game.updateTeams(homeTeam, awayTeam);
        game.displayTeams(homeTeam, awayTeam);

        System.out.println("Quarter 4 Start");
        awayTeam.myAwayTeam.get(3).goalScored();
        awayTeam.myAwayTeam.get(3).goalScored();
        homeTeam.myHomeTeam.get(4).ejectionEarned();
        awayTeam.myAwayTeam.get(1).ejectionEarned();


        game.updateTeams(homeTeam, awayTeam);
        game.displayTeams(homeTeam, awayTeam);

        String winner = game.determineWinner(homeTeam, awayTeam);
        System.out.println(winner + " won the game!");
    }
}
