package day_02_28;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
                50’den kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not= scan.nextInt();
        System.out.println((not >= 50 ? "Sinifi gectin" : "Malesef kaldin"));


    }
}
