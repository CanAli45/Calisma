package day_03_14_Bireysel;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        System.out.println(araba1);
        araba1.fiyat = 15000;
        araba1.marka = "Volvo";
        System.out.println(araba1);
        Araba araba2 = new Araba(10000, "BMMW");
        System.out.println(araba2);

    }
}
