package day_02_03;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        /*
            Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        int rakamlarToplami=scan.nextInt();

        while (girilenSayi>0){

            rakamlarToplami+=girilenSayi%10;
            girilenSayi/=10;
        }
        System.out.println("Sayinin rakamlar toplami :"+rakamlarToplami);
    }
}
