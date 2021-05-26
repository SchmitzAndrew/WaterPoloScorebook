public class Player {
    private final String myNumber; //needs to account for 1A
    private final String myName;
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


    public void goalScored(){
        this.myGoals ++;
    }

    public void ejectionEarned(){
        this.myEjections ++;
    }
    public int getMyGoals() {
        return myGoals;
    }

    public void setMyGoals(int myGoals) {
        this.myGoals = myGoals;
    }

    public int getMyEjections() {
        return myEjections;
    }

    public void setMyEjections(int myEjections) {
        this.myEjections = myEjections;
    }



}
