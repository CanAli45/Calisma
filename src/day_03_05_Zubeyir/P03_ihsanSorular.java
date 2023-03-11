package day_03_05_Zubeyir;

import java.util.Scanner;

public class P03_ihsanSorular {
    public static void main(String[] args) {
        /*
                Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
                Merhaba dünya ==Merhaba%dünya
         */


        boslukDoldurma();

    }


    public static void boslukDoldurma(){

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz");

        String metin=scan.nextLine();
        metin=metin.replaceAll(" ","%");
        System.out.println(metin);

    }
}
