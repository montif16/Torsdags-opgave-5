package Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creates new ArrayList object called "customers"
        ArrayList<Customer> customers = new ArrayList<>();

        //Creating object "john" and using contructor to set: First name, Last name and username.
        customers.add(new Customer("John","Hansen","80085"));
        customers.add(new Customer("Peter","Mattisen","SausageOligarch"));

        //Below is to test if counter goes up when a Customer object is created.
        //System.out.println(Customer.counter);

        //Prints to result of using our custom toString() method on our object "john"
        //Outdated.
        //System.out.println(john.toString());

        //Using our printCustomers method. It takes an ArrayList of type Customer.
        //Prints out all customers in our ArrayList
        printCustomers(customers);
    }
    public static void printCustomers(ArrayList<Customer> customers){

        //For each customer in our Customer class, print out each customer using .toString.
        for (Customer customer: customers){
            System.out.println(customer.toString());

        }
    }
}