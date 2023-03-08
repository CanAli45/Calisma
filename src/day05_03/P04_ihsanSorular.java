package day05_03;

import java.util.Scanner;

public class P04_ihsanSorular {
    public static void main(String[] args) {
        /*
            Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program yazdırın.
            Or:Sanayagı yagı Mutluluk uluk
         */
        yarisiniDondur();

    }
    public static String yarisiniDondur (){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ortadan tam bolunebilen bir kelime giriniz" );
        String mtn=scan.next();
        mtn=mtn.substring(mtn.length()/2,mtn.length());
        System.out.println(mtn);

        return mtn;
    }

}
