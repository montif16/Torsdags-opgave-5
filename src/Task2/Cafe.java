package Task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Cafe {

    public ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData(){

        // Try to run code.
        try {
            //puts filepath into a variable instead of hard code.
            String filePath = "coffees.txt";

            //Slightly redundant. Could simply change refractor "coffeeFile" with "filepath"
            File coffeeFile = new File(filePath);
            Scanner fileReader = new Scanner(coffeeFile);

            //Reads through lines of "coffees.txt" and adds to ArrayList "coffeeMenu"
            while (fileReader.hasNextLine()){
                coffeeMenu.add(fileReader.nextLine());
                //Outdated.
                //String fileOutput = fileReader.nextLine();
                //System.out.println(fileOutput);
            }
        // Will throw exception if any error found.
        } catch (Exception e){
            //Prints the error message for troubleshooting purpose
            e.printStackTrace();
            //Prints the working directory. Helpful to locate coffees.txt file
            // to make sure it's in the correct working directory.
            System.out.println(System.getProperty("user.dir"));
            //redundant, can be deleted. Old error handling code.
            System.out.println("Error loading file");
        }
    }
}
