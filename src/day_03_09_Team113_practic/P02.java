package day_03_09_Team113_practic;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        //// Soru 1- Kullanicidan aldıginiz pozitif bir tamsayinin
        ////         tam bolenlerini ve tam bolenlerinin toplamini bulun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int toplam = 0;
        int tamBolenler = 1;
        while (tamBolenler <= sayi) {
            if (sayi%tamBolenler==0){
                System.out.println(sayi+" sayisi "+tamBolenler+ " sayisina tam bolunur");
                toplam+=tamBolenler;
            }
            tamBolenler++;
        }
        System.out.println(sayi+" sayisinin tam bolenlerinin toplami :"+toplam);
    }
}
