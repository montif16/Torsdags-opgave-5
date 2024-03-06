package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    public Customer(String firstName, String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter += 1;
        this.id = counter;
    }

    @Override
    public String toString(){
        return "First name is: "+this.firstName+"\nLast name is: "+this.lastName+"\nUsename is: "+username+"\n";
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUsername() {
        return username;
    }
    public int getId() {
        return id;
    }
}
