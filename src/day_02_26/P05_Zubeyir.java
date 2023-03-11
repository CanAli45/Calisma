package day_02_26;

import java.util.Scanner;

public class P05_Zubeyir {
    public static void main(String[] args) {
        // 5-Kullanıcının girdiği bir sayının çift veya tek olduğunu kontrol eden bir program yazın.

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cift sayidir");
        }else {
            System.out.println("Girilen sayi tek sayidir");
        }
    }
}
