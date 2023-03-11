package day_02_28;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan 2 basamakli bir sayi alip,
                girilen sayiyi yazi ile yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 basamakli  birsayi giriniz");
        int sayi= scan.nextInt();
        int birlerBasmagi=sayi%10;
        int onlarbasamagi=sayi/10;
        if (sayi>99 ||sayi<10){
            System.out.println("Gecersiz sayi girisi");
        }else {

            switch (onlarbasamagi) {
                case 1:
                    System.out.print("on ");
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
                    System.out.print("Altmis ");
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
                default:
                    System.out.println("Gecersiz giris yaptiniz");


            }


            switch (birlerBasmagi) {
                case 1:
                    System.out.print("Bir");
                    break;
                case 2:
                    System.out.print("Iki");
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
                default:


            }
        }


    }
}
