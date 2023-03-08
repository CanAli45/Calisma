package day_26_02;

import java.util.Scanner;

public class P06_Zubeyir {
    public static void main(String[] args) {
        // 7-Soru: Kullanıcıdan pozitif bir tam sayı girmesini isteyin
        // ve ardından sayının asal bir sayı olup olmadığını kontrol edin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int flag=0;

        for (int i = 2; i <sayi ; i++) {
            if(sayi%i==0){
                flag++;
                break;
            }


        }
        if (sayi==2){
            System.out.println("Girilen 2 sayisi asaldir");
        } else if (flag==0) {
            System.out.println("Girilen sayi : "+sayi+" asal sayidir");

        }else {
            System.out.println("Girilen sayi :"+sayi+" asal sayi degildir");
        }
    }
}
