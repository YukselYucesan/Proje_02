package task1;

import java.util.Scanner;

public class SifreBelirleme {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("Kullanıcı Adı = ");
        String kullaniciAdi = oku.nextLine().trim();
        String sifre="";
        String sifreTekrar="";

        do {

            System.out.print("Şifre Belirleyin = ");
            sifre= oku.nextLine();
            System.out.print("Şifrenizi tekrar girin = ");
            sifreTekrar= oku.nextLine();
            if (!sifre.equals(sifreTekrar))System.out.println("Şifre ve şifre tekrarı eşleşmedi");

        }while (!sifre.equals(sifreTekrar));

        String girilenKullaniciAdi="";
        String girilenSifre="";
        int counter=2;

        do {
            System.out.print("Kullanıcı Adı = ");
            girilenKullaniciAdi = oku.nextLine().trim();
            System.out.print("Şifre Belirleyin = ");
            girilenSifre= oku.nextLine().trim();
            if (!kullaniciAdi.equals(girilenKullaniciAdi) || !sifre.equals(girilenSifre)){
                System.out.println("Hatalı giriş. Kalan hakkınız = " + counter);
                counter--;
                if (counter<0){
                    System.out.println("Üzgünüz 3 kez hatalı giriş yaptınız");
                    break;
                }
            } else System.out.println("Başarılı bir şekilde giriş yaptınız. " + kullaniciAdi + " kullanıcısı olarak sisteme hoş geldiniz!");

        } while (!kullaniciAdi.equals(girilenKullaniciAdi) || !sifre.equals(girilenSifre));
    }
}
