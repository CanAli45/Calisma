package day_26_02;

import java.util.Scanner;

public class P02_Zubeyir_2 {
    public static void main(String[] args) {
        /*
             2-Kullanıcının girdiği iki sayı arasındaki en büyük sayıyı bulan bir program yazın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi2 > sayi1) {
            System.out.println("Buyuk sayi :" + sayi2);
        } else {
            System.out.println("Buyuk sayi :" + sayi1);
        }


    }
}
