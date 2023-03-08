package day_26_02;

import java.util.Scanner;

public class P04_Zubeyir {
    public static void main(String[] args) {
        // 4-Kullanıcının girdiği bir karakterin, harf olup olmadığını kontrol eden bir program yazın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk= scan.next().charAt(0);

        krk=Character.toUpperCase(krk);

        if (krk>='A'&& krk<='Z'){
            System.out.println("Girilen karakter harftir");
        }else {
            System.out.println("Girlien karakter harf degildir");
        }
    }
}
