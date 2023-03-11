package day_03_09_Team113_practic;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz ");
        int sayi= scan.nextInt();
        int toplam=0;
        int i=0;
        do {
            if (i%2==0){
                toplam+=i;
            }
            i++;
        }while (i<=sayi);
        System.out.println("Girilen "+sayi+" sayisina kadar olan cift sayilarin toplami :"+toplam);
    }
}
