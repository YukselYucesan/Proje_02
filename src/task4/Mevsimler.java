package task4;

import java.util.Scanner;

public class Mevsimler {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("Gün (0-31) = ");
        int gun= oku.nextInt();
        System.out.print("Ay (0-12) = ");
        int ay= oku.nextInt();
        mevsimHesapla(gun,ay);
    }
    public static void mevsimHesapla(int gun,int ay){
        switch (ay) {
            case 1: if (gun<32){System.out.println("Kış");} else {System.out.println("Hatalı gün girişi");} break;
            case 2: if (gun<29){System.out.println("Kış");} else {System.out.println("Hatalı gün girişi");} break;
            case 3: if (gun<32){if (gun < 20) {System.out.println("Kış");} else {System.out.println("İlkbahar");}} else {System.out.println("Hatalı gün girişi");} break;
            case 4: if (gun<31){System.out.println("İlkbahar");} else {System.out.println("Hatalı gün girişi");} break;
            case 5: if (gun<32){System.out.println("İlkbahar");} else {System.out.println("Hatalı gün girişi");} break;
            case 6: if (gun<31){if (gun < 21) {System.out.println("İlkbahar");} else {System.out.println("Yaz");}} else {System.out.println("Hatalı gün girişi");} break;
            case 7:
            case 8: if (gun<32){System.out.println("Yaz");} else {System.out.println("Hatalı gün girişi");} break;
            case 9: if (gun<31){if (gun < 21) {System.out.println("Yaz");} else {System.out.println("Sonbahar");}} else {System.out.println("Hatalı gün girişi");} break;
            case 10: if (gun<32){System.out.println("Sonbahar");} else {System.out.println("Hatalı gün girişi");} break;
            case 11: if (gun<31){System.out.println("Sonbahar");} else {System.out.println("Hatalı gün girişi");} break;
            case 12: if (gun<32){if (gun < 20) {System.out.println("Sonbahar");} else {System.out.println("Kış");}} else {System.out.println("Hatalı gün girişi");} break;
            default: System.out.println("Hatalı ay girdiniz...");
        }
    }
}
