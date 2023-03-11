package day_02_15;

import java.util.Scanner;

public class SwitchStatements_Soru_2 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan 2 basamakli bir sayi alip,
        //        girilen sayiyi yazi ile yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 2 basamakli bir sayi giriniz");

        int sayi = scan.nextInt();

        int birler = sayi % 10;

        int onlar = sayi / 10;


        if (sayi < 0 || sayi>99) {
            System.out.println("Yanlis giris");}
        else {

            switch (onlar) {
                case 1:
                    System.out.print("On ");
                    break;
                case 2:
                    System.out.print("Yirmi ");
                    break;
                case 3:
                    System.out.print("Otuz ");
                    break;
                case 4:
                    System.out.print("Kırk ");
                    break;
                case 5:
                    System.out.print("Elli ");
                    break;
                case 6:
                    System.out.print("Altmıs ");
                    break;
                case 7:
                    System.out.print("Yetmis ");
                    break;
                case 8:
                    System.out.print("Seksen ");
                    break;
                case 9:
                    System.out.print("Doksan ");
                    break;

            }
            switch (birler) {
                case 1:
                    System.out.print("Bir");
                    break;
                case 2:
                    System.out.print("İki");
                    break;
                case 3:
                    System.out.print("Uc");
                    break;
                case 4:
                    System.out.print("Dort");
                    break;
                case 5:
                    System.out.print("Bes");
                    break;
                case 6:
                    System.out.print("Alti");
                    break;
                case 7:
                    System.out.print("Yedi");
                    break;
                case 8:
                    System.out.print("Sekiz");
                    break;
                case 9:
                    System.out.print("Dokuz");
                    break;


            }



        }
    }
}