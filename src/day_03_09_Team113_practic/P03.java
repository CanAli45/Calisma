package day_03_09_Team113_practic;

public class P03 {
    public static void main(String[] args) {
        /*   Soru 2 - While loop kullanarak verilen bir String'i terse cevirip, bu halini bize
                      donduren bir method olusturun.

         */


        System.out.println(tersineCevirme("merhaba team 113"));

    }
    public static String tersineCevirme(String metin){
        String tersMetin="";
        int i=metin.length()-1;
        while (i>=0){
            tersMetin+=metin.charAt(i);
            i--;
        }
     return tersMetin;
    }
}
