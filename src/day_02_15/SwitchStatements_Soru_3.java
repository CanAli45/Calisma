package day_02_15;

import java.util.Scanner;

public class SwitchStatements_Soru_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki basamakli bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int birler = sayi % 10;
        int onlar = sayi / 10 ;
        if (sayi < 10 || sayi > 99) {
            System.out.println("Yanlis giris, iki basamakli sayi giriniz");
        } else {
            switch (onlar) {
                case 1 :
                    System.out.print(sayi + " : On");
                    break;
                case 2 :
                    System.out.print(sayi + " : Yirmi");
                    break;
                case 3 :
                    System.out.print(sayi + " : Otuz");
                    break;
                case 4 :
                    System.out.print(sayi + " : Kirk");
                    break;
                case 5 :
                    System.out.print(sayi + " : Elli");
                    break;
                case 6 :
                    System.out.print(sayi + " : Altmis");
                    break;
                case 7 :
                    System.out.print(sayi + " : Yetmis");
                    break;
                case 8 :
                    System.out.print(sayi + " : Seksen");
                    break;
                case 9 :
                    System.out.print(sayi + " : Doksan");
                    break;
            }
            switch (birler) {
                case 1 :
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }
        }
    }
}
