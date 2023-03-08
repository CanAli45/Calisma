package day05_03;

import java.util.Scanner;

public class P02_ihsanSorular {
    public static void main(String[] args) {
        /*
            Soru - Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan ,
                   3 kelimeden az ise inputu döndüren bir metot yazınız.
                   Merhaba Mer
                     Ali Ali
         */
        System.out.println("Lutfen bir metin giriniz");
        ilkUcHarfiYazma();


    }

    public static String ilkUcHarfiYazma(){
        Scanner scan=new Scanner(System.in);
        String mtn=scan.nextLine();

       System.out.println("Girilen metnin ilk uc harfi :"+mtn.substring(0,3));
        if (mtn.indexOf(" ")==mtn.lastIndexOf(" ")){
            System.out.println(mtn);
        }else {

            System.out.println("Girilen metin 3 yada daha fazla kelimeden olusur");
        }






        return mtn;
    }


}
