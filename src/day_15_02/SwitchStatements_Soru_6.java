package day_15_02;

import java.util.Scanner;

public class SwitchStatements_Soru_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin
        System.out.println("Lutfen ay numarasini giriniz");

        int ayNo = scan.nextInt();

        switch (ayNo){
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Kıs");
                break;
            case 3 :
            case 4 :

            case 5 :
                System.out.println("İlkbahar");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Yanlis giris");
        }









    }
}
