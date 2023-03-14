package day_03_14_Bireysel;

public class P01_ConstructorCall {
    int sayi;
    String str;

    public P01_ConstructorCall() {
        System.out.println("Parametresiz constructor calisti");
    }

    public P01_ConstructorCall(int sayi) {
        System.out.println("Intiger Parametreli constructor calisti");
        this.sayi = sayi;
    }

    public P01_ConstructorCall(String str) {
        this(5);
        System.out.println("String Parametreli constructor calisti");
        this.str = str;
    }

    public P01_ConstructorCall(int sayi, String str) {
        this();
        this.sayi = sayi;
        this.str = "Java";
        System.out.println("Iki Parametreli constructor calisti");
    }

    public static void main(String[] args) {
        P01_ConstructorCall obj3 = new P01_ConstructorCall(7, "Selcuk");
        System.out.println(obj3.sayi);
        System.out.println(obj3.str);
        P01_ConstructorCall obj2 = new P01_ConstructorCall("Java");
        System.out.println(obj2.sayi);
        System.out.println(obj2.str);
        P01_ConstructorCall obj1 = new P01_ConstructorCall();
    }
}
