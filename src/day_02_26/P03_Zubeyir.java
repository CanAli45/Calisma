package day_02_26;

import java.util.Scanner;

public class P03_Zubeyir {
    public static void main(String[] args) {
        // 3-Kullanıcının girdiği üç sayı arasındaki en küçük sayıyı bulan bir program yazın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();

        if (sayi1<sayi2&& sayi1<sayi3){
            System.out.println("En kucuk sayi :"+sayi1);
        } else if (sayi2<sayi1&&sayi2<sayi3) {
            System.out.println("En kucuk sayi :"+sayi2);

        }else {
            System.out.println("En kucuk sayi :"+sayi3);
        }


    }
}
