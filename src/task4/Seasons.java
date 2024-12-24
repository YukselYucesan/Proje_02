package task4;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Day (0-31) = ");
        int day = read.nextInt();
        System.out.print("Month (0-12) = ");
        int month = read.nextInt();
        seasonCalculate(day, month);
    }
    public static void seasonCalculate(int day, int month){
        switch (month) {
            case 1: if (day <32){System.out.println("Winter");} else {System.out.println("Incorrect day entry.");} break;
            case 2: if (day <29){System.out.println("Winter");} else {System.out.println("Incorrect day entry.");} break;
            case 3: if (day <32){if (day < 20) {System.out.println("Winter");} else {System.out.println("Spring");}} else {System.out.println("Incorrect day entry.");} break;
            case 4: if (day <31){System.out.println("Spring");} else {System.out.println("Incorrect day entry.");} break;
            case 5: if (day <32){System.out.println("Spring");} else {System.out.println("Incorrect day entry.");} break;
            case 6: if (day <31){if (day < 21) {System.out.println("Spring");} else {System.out.println("Summer");}} else {System.out.println("Incorrect day entry.");} break;
            case 7:
            case 8: if (day <32){System.out.println("Summer");} else {System.out.println("Incorrect day entry.");} break;
            case 9: if (day <31){if (day < 21) {System.out.println("Summer");} else {System.out.println("Autumn");}} else {System.out.println("Incorrect day entry.");} break;
            case 10: if (day <32){System.out.println("Autumn");} else {System.out.println("Incorrect day entry.");} break;
            case 11: if (day <31){System.out.println("Autumn");} else {System.out.println("Incorrect day entry.");} break;
            case 12: if (day <32){if (day < 20) {System.out.println("Autumn");} else {System.out.println("Winter");}} else {System.out.println("Incorrect day entry.");} break;
            default: System.out.println("You entered an incorrect month....");
        }
    }
}
