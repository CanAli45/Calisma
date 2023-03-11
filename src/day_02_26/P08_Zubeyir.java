package day_02_26;

import java.util.Scanner;

public class P08_Zubeyir {
    public static void main(String[] args) {
        /*
            Cinsiyet "Erkek" ise "Erkek" yazdırınız.
             Cinsiyet "Kadın" ise "Kız" yazdırınız.
             Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
             Not : Bu seçenekler dışındakilerini yoksayınız.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cins=scan.next();

        if (cins.equalsIgnoreCase("erkek")){
            System.out.println("Erkek");
        } else if (cins.equalsIgnoreCase("Kadin")) {
            System.out.println("Kiz");

        }else {
            System.out.println("Digerleri");
        }
    }
}
