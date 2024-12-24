package task1;

import java.util.Scanner;

public class PasswordDetermination {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.print("User Name = ");
        String UserName = read.nextLine().trim();
        String password ="";
        String passwordRepeat ="";

        do {

            System.out.print("Set Password = ");
            password = read.nextLine();
            System.out.print("Reenter password = ");
            passwordRepeat = read.nextLine();
            if (!password.equals(passwordRepeat))System.out.println("Password and repeat password do not match.");

        }while (!password.equals(passwordRepeat));

        String enteredUserName ="";
        String EnteredPassword ="";
        int counter=2;

        do {
            System.out.print("User Name = ");
            enteredUserName = read.nextLine().trim();
            System.out.print("Password = ");
            EnteredPassword = read.nextLine().trim();
            if (!UserName.equals(enteredUserName) || !password.equals(EnteredPassword)){
                System.out.println("Incorrect entry. Your remaining rights = " + counter);
                counter--;
                if (counter<0){
                    System.out.println("Sorry, you have entered the wrong entry 3 times.");
                    break;
                }
            } else System.out.println("You have logged in successfully. Welcome to the system as a/an " + UserName + " user!");

        } while (!UserName.equals(enteredUserName) || !password.equals(EnteredPassword));
    }
}
