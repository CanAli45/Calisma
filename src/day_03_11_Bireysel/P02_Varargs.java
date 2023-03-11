package day_03_11_Bireysel;

import java.util.Arrays;

public class P02_Varargs {
    // verilen sayilardan ilki haric digerlerini toplasin
    // sonra toplam ile ilk sayiyi carpip yazdirsin

    public static void main(String[] args) {
        topla(3,4);
        topla(3,4,5);
        topla(3,4,5,6);


    }

    public static void topla(int c, int... a){
        System.out.println(Arrays.toString(a));

        int toplam=0;

        for (int each:a
        ) {
            toplam+=each;
        }
        System.out.println("ıstenen islem sonucu: "+toplam*c);
    }

}
