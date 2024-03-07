package Task2;

public class Main {
    public static void main(String[] args) {
        Cafe user = new Cafe();
        user.loadMenuData();
        for(String i: user.coffeeMenu){
            System.out.println(i);
        }
    }
}
