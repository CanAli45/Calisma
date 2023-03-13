package day_03_13_Bireysel;

public class P03_HemsireRunner {
    public static void main(String[] args) {

        P02_Hemsire hemsire1=new P02_Hemsire();

        System.out.println(hemsire1.isim);
        System.out.println(hemsire1.evliMi);
        System.out.println(hemsire1.yas);
        System.out.println(hemsire1.izindeMi);

        hemsire1.isim="Tuba";
        hemsire1.yas=29;

        System.out.println(hemsire1.isim);
        System.out.println(hemsire1.yas);
    }
}
