public class Player {
    private String myNumber; //needs to account for 1A
    private String myName;
    private boolean myHomeTeam;
    private int myGoals;
    private int myEjections;

    public Player(String number, String name, boolean homeTeam, int goals, int ejections){
        myNumber = number;
        myName = name;
        myHomeTeam = homeTeam;
        myGoals = goals;
        myEjections = ejections;
    }


}
