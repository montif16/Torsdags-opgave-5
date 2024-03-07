package Task3;

import java.util.ArrayList;

public class Building {
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    private ArrayList<Room> rooms;
    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding, ArrayList<Room> rooms){
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        this.rooms = rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public boolean getIsOfficeBuilding() {
        return isOfficeBuilding;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setOfficeBuilding(boolean officeBuilding) {
        isOfficeBuilding = officeBuilding;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
