package task3;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        Scanner readInt =new Scanner(System.in);

        String whichCoffee ="";
        do {
            System.out.print("Which coffee would you like?\nTurkish Coffee\nFilter Coffee\nEspresso\nSelection = ");
            whichCoffee = read.nextLine().trim().toLowerCase();
            switch (whichCoffee) {
                case "turkish coffee": System.out.println("Preparing Turkish coffee..."); break;
                case "filter coffee": System.out.println("Preparing filter coffee..."); break;
                case "espresso": System.out.println("Preparing espresso..."); break;
                default: System.out.println("Wrong keystroke. Please try again.");
            }
        }while (!whichCoffee.equals("turkish coffee") && !whichCoffee.equals("filter coffee") && !whichCoffee.equals("espresso"));

        String milk ="";
        do {
        System.out.print("Would you like us to add milk? (Answer Yes or No): ");
        milk = read.nextLine().trim().toLowerCase();
        switch (milk){
            case "yes" : System.out.println("Adding milk..."); break;
            case "no": System.out.println("No milk added."); break;
            default: System.out.println("An incorrect entry.");

        }
        } while (!milk.equals("yes") && !milk.equals("no") );

        String sugar ="";
        do {
            System.out.print("Would you like some sugar? (Answer Yes or No): ");
            sugar = read.nextLine().trim().toLowerCase();
            switch (sugar){
                case "yes" : System.out.print("How many sugar cubes would you like?: ");
                int howManySugars= readInt.nextInt(); System.out.println("Adding " + howManySugars + " cubes of sugar.");break;
                case "no": System.out.println("No sugar is added."); break;
                default: System.out.println("An incorrect entry.");
            }
        } while (!sugar.equals("yes") && !sugar.equals("no") );

        String size ="";
        do {
            System.out.print("What size would you like? (Enter Large - Medium - Small) : ");
            size = read.nextLine().trim().toLowerCase();
            switch (size){
                case "large", "medium", "small" : System.out.println("Your " + size + " sized coffee is being prepared."); break;
                default: System.out.println("An incorrect entry.");
            }
        } while (!size.equals("large") && !size.equals("medium") && !size.equals("small"));

        System.out.println("Conclusion = " + whichCoffee + " " + size + " size is ready. Enjoy your coffee!");

    }
}
