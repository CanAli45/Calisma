package day_03_09_Team113_practic;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

       /* Soru 3- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
                   kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
                   olusturun
        */
        sayininUstunuAlma();

    }

    public static void sayininUstunuAlma(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println("Lutfen sayinin hesaplamak istediginiz us degerini giriniz");
        int us=scan.nextInt();
        long toplam=1;

        while (us!=0){
            toplam*=sayi;
            us--;
        }
        System.out.println("Girdiginiz sayinin us degerinin sonucu :"+toplam);
    }
}
