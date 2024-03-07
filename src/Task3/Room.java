package Task3;

public class Room {
    private int numberOfDoors;
    private int numberOfWindows;
    private int numberofLamps;

    public Room(int numberOfDoors, int numberOfWindows, int numberofLamps){
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberofLamps = numberofLamps;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberofLamps() {
        return numberofLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberofLamps(int numberofLamps) {
        this.numberofLamps = numberofLamps;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
