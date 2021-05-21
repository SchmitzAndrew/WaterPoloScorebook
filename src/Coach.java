//stores information about the coaches of each team

public class Coach{
    private String myName;
    private boolean myHomeTeam;
    private int myTimeouts;
    private int myThirtyTimeout;
    private int myCards; //yellow: 1, red: 2

    public Coach( String name, boolean homeTeam, int timeouts, int thirtyTimeout, int cards){
        myName = name;
        myHomeTeam = homeTeam;
        myTimeouts = timeouts;
        myThirtyTimeout = thirtyTimeout;
        myCards = cards;

    }


}
