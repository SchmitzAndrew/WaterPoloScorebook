//in game actions and timer


import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    public HomeTeam homeTeam;
    public AwayTeam awayTeam;

    //Update teams variables
    public int homeTeamGoals;
    public int awayTeamGoals;
    public int homeTeamEjections;
    public int awayTeamEjections;


    public Game() {

    }

    public ArrayList createHomePlayers() {
        //Team Array List Creation
        //Home Team
        String[] teamOneNames = {"Kenneth B ", "Lemoine C", "Austin C", "John C", "Harold D", "Phillip B", "Dixon Fiske", "Samuel G"}; //Water Polo Hall of Fame 1970

        ArrayList<Player> homePlayers = new ArrayList<Player>();
        for (int i = 0; i < 7; i++) {
            Player homePlayer = new Player(Integer.toString(i + 1), teamOneNames[i], 0, 0);
            homePlayers.add(homePlayer);
        }
        Player homeAlternateGoalie = new Player("1A", "Matty B", 0, 0); //Alternate goalie
        homePlayers.add(1, homeAlternateGoalie);

        return homePlayers;
    }

    public Coach createHomeCoach() {
        //Home Coach
        Coach homeCoach = new Coach("Fred Gleason", 3, 1, 0);
        return homeCoach;
    }
    //Create Home Team Object

    public ArrayList createAwayPlayers() {
        //Away Team
        String[] teamTwoNames = {"Gavin A", "Gary R", "Kelly R", "Bruce W", "Elise W", "Adam W", "Lauren W", "John T"}; //Water Polo Hall of Fame 2019/20
        ArrayList<Player> awayPlayers = new ArrayList<Player>();
        for (int i = 0; i < 7; i++) {
            Player awayPlayer = new Player(Integer.toString(i + 1), teamTwoNames[i], 0, 0);
            awayPlayers.add(awayPlayer);
        }
        Player awayAlternateGoalie = new Player("1A", "Matthew B", 0, 0); //Alternate goalie
        awayPlayers.add(1, awayAlternateGoalie);

        return awayPlayers;
    }

    public Coach createAwayCoach() {
        //Away Coach
        Coach awayCoach = new Coach("Simone Orny", 3, 1, 0);
        return awayCoach;
    }

    public void displayTeams(HomeTeam homeTeam, AwayTeam awayTeam){
        homeTeam.displayHomeTeam();
        System.out.print("\n");
        awayTeam.displayAwayTeam();

    }
    //Adds goals and ejections from each player to the teams
    public void updateTeams(HomeTeam homeTeam, AwayTeam awayTeam){
        homeTeamGoals = 0;
        awayTeamGoals = 0;
        homeTeamEjections = 0;
        awayTeamEjections = 0;

        for (Player p : homeTeam.myHomeTeam){
            homeTeamGoals += p.getMyGoals();
            homeTeamEjections += p.getMyEjections();
        }

        for (Player p : awayTeam.myAwayTeam){
            awayTeamGoals += p.getMyGoals();
            awayTeamEjections += p.getMyEjections();
        }

        homeTeam.setMyHomeGoals(homeTeamGoals);
        homeTeam.setMyHomeEjections(homeTeamEjections);

        awayTeam.setMyAwayGoals(awayTeamGoals);
        awayTeam.setMyAwayEjections(awayTeamEjections);
    }

    public String determineWinner(HomeTeam homeTeam, AwayTeam awayTeam){
        if (homeTeam.getMyHomeGoals() > awayTeam.getMyAwayGoals()){
            return homeTeam.getMyHomeName();
        }else if(homeTeam.getMyHomeGoals() == awayTeam.getMyAwayGoals()){
            return "Neither team";
        }else {
            return awayTeam.getMyAwayName();
        }
    }
}






