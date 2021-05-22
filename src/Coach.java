//stores information about the coaches of each team

public class Coach{
    private String myName;
    private int myTimeouts;
    private int myThirtyTimeout;
    private int myCards; //yellow: 1, red: 2

    public Coach( String name, int timeouts, int thirtyTimeout, int cards){
        myName = name;
        myTimeouts = timeouts;
        myThirtyTimeout = thirtyTimeout;
        myCards = cards;

    }


}
