package day_28_02;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi>0?"Girilen sayi: "+sayi:"Girilen sayi: "+sayi*-1);
    }
}
