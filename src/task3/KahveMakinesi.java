package task3;

import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        String hangiKahve="";
        do {
            System.out.print("Hangi kahveyi istersiniz?\nTürk Kahvesi\nFiltre Kahve\nEspresso\nSeçim = ");
            hangiKahve = oku.nextLine().trim().toLowerCase();
            switch (hangiKahve) {
                case "türk kahvesi": System.out.println("Türk kahvesi hazırlanıyor..."); break;
                case "filtre kahve": System.out.println("Filtre kahve hazırlanıyor..."); break;
                case "espresso": System.out.println("Espresso hazırlanıyor..."); break;
                default: System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.");
            }
        }while (!hangiKahve.equals("türk kahvesi") && !hangiKahve.equals("filtre kahve") && !hangiKahve.equals("espresso"));

        String sut="";
        do {
        System.out.print("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
        sut= oku.nextLine().trim().toLowerCase();
        switch (sut){
            case "evet" : System.out.println("Süt ekleniyor..."); break;
            case "hayır": System.out.println("Süt eklenmiyor."); break;
            default: System.out.println("Yanlış bir giriş");

        }
        } while (!sut.equals("evet") && !sut.equals("hayır") );

        String seker="";
        do {
            System.out.print("Şeker ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
            seker= oku.nextLine().trim().toLowerCase();
            switch (seker){
                case "evet" : System.out.print("Kaç şeker istersiniz?: ");
                int kacSeker= okuInt.nextInt(); System.out.println(kacSeker + " şeker ekleniyor");break;
                case "hayır": System.out.println("Şeker eklenmiyor."); break;
                default: System.out.println("Yanlış bir giriş");
            }
        } while (!seker.equals("evet") && !seker.equals("hayır") );

        String boyut="";
        do {
            System.out.print("Hangi boyutta istersiniz? (Büyük - Orta - Küçük olarak giriniz.) : ");
            boyut= oku.nextLine().trim().toLowerCase();
            switch (boyut){
                case "büyük", "orta", "küçük" : System.out.println(boyut + " boy kahveniz hazırlanıyor."); break;
                default: System.out.println("Yanlış bir giriş");
            }
        } while (!boyut.equals("büyük") && !boyut.equals("orta") && !boyut.equals("küçük"));

        System.out.println("Sonuç = " + hangiKahve + " " + boyut + " boy hazır. Afiyet Olsun!");

    }
}
