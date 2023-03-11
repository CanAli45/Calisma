package day_03_11_Bireysel;

import java.time.LocalDate;
import java.util.Scanner;

public class P01_DateTime {
    public static void main(String[] args) {

        // kullanicidan 2 farkli kisinin, isim ve dogum tarihinin gun , ay, yilini alip
        // hangi tarihte dogan kisinin daha buyuk oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk kisinin ismini giirniz");
        String isim1 = scan.nextLine();
        System.out.println("ikinci kisinin ismini giirniz");
        String isim2 = scan.nextLine();

        System.out.println("Ilk kisini dogum tairihini gun, ay, yil olarak girin");
        int gun = scan.nextInt();
        int ay = scan.nextInt();
        int yil = scan.nextInt();
        LocalDate tarih1 = LocalDate.of(yil, ay, gun);

        System.out.println("Ikinci kisini dogum tairihini gun, ay, yil olarak girin");
        int gun1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int yil1 = scan.nextInt();
        LocalDate tarih2 = LocalDate.of(yil1, ay1, gun1);


        // 1.yol
        if (gun1 > gun && ay1 > ay && yil1 > yil) {
            System.out.println(isim2 + " buyuktur " + isim1);
        } else {
            System.out.println(isim1 + " buyuktur " + isim2);
        }

        // 2.yol
        System.out.println(tarih2.isAfter(tarih1) ? isim1+" buyuktur "+isim2+"'den"
                                                  :isim2+" buyuktur "+isim1+"'den");


    }
}
