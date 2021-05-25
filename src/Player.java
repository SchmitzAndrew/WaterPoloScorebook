public class Player {
    private String myNumber; //needs to account for 1A
    private String myName;
    private int myGoals;
    private int myEjections;

    public Player(String number, String name,  int goals, int ejections){
        myNumber = number;
        myName = name;
        myGoals = goals;
        myEjections = ejections;
    }

    public String printPlayer(){
        return ("Number: " + this.myNumber + " Name: " + this.myName + " Goals: " + this.myGoals + " Ejections: " + this.myEjections);
    }


}
