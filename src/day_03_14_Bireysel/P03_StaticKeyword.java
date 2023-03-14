package day_03_14_Bireysel;

public class P03_StaticKeyword {
    static String hastaneIsmi = "Yildiz hastanesi";
    static String hastaneTelefonu = "312568596 ";
    static String bashekimIsmi = "Kemal Aydin";
    String persIsmi;
    String perAdresi;
    String perTelefonu;

    public static void main(String[] args) {

        P03_StaticKeyword personel1 = new P03_StaticKeyword();

        System.out.println(personel1.persIsmi);

        System.out.println(hastaneIsmi);
        System.out.println(personel1.bashekimIsmi);
        P03_StaticKeyword personel2 = new P03_StaticKeyword();
        personel2.persIsmi = "Dogan";
        System.out.println(personel2.persIsmi);
        System.out.println(personel1.persIsmi);
        personel2.bashekimIsmi = "Ali CAN";
        System.out.println(personel1.bashekimIsmi);
    }
}
