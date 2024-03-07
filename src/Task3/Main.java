package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating 3 room objects with the type Class
        Room room1 = new Room(2,2,3);
        Room room2 = new Room(3,3,4);
        Room room3 = new Room(4,4,5);
        //Creating a collection of Room objects called "collectionOfRooms".
        //Using shortform way of adding objects directly to the ArrayList
        //By using List.of() which is a method build in java "collection" package.
        ArrayList<Room> collectionOfRooms = new ArrayList<>(List.of(room1, room2, room3));
        //Using Building's constructor to create a building object
        //Takes (int,int,boolean,object)
        Building building1 = new Building(2,2,true,collectionOfRooms);
        //Simple sout for testing.
        System.out.println(countLampsInBuilding(building1));
        //Use function on our object "building1"
        System.out.println(isNormal(building1));

    }
    //A function that returns an int. Takes a Building object as argument.
    public static int countLampsInBuilding(Building building){
        //Total is used as a variable to store the result of our for-each loop
        int total = 0;
        //First part of for-each loop indicates that we want to iterate "room" with the type "Room"
        //"Room" type is the class we made ourselves.
        //buiding.getRooms() "building." is our ArrayList.
        // We use our getter getRooms() to get the ArrayList of our object "building" object.
        for(Room room: building.getRooms()) {
            //adds each value from getNumberofLamps() and adds it to total.
            //The function getNumberofLamps() is used on all room ojects as it loops through the ArrayList.
            total += room.getNumberofLamps();
        }
        return total;

    }
    public static boolean isNormal(Building building){
        //Checks if there is more "Room" objects in our object "Building" than floors.
        if(building.getNumberOfFloors() > building.getRooms().size()){
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }

}
