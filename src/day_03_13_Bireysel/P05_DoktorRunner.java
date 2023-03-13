package day_03_13_Bireysel;

public class P05_DoktorRunner {
    public static void main(String[] args) {

        P04_Doktor doktor1 = new P04_Doktor();

        doktor1.isim = "Kemal";

        doktor1.yas = 40;
        System.out.println(doktor1.soyIsim);
        System.out.println(doktor1.yas);

        P04_Doktor doktor2 = new P04_Doktor();

        P04_Doktor doktor3;
        // System.out.println(doktor3.yas);
        // Constructor calismadan bir obje olusturulup deger atanmasi mumkun degildir

        System.out.println("Veriable'a atanmayan obje icin yas "+new P04_Doktor().yas);
    }
}
