package day_03_13_Bireysel;

public class P04_Doktor {

   P04_Doktor(){
       System.out.println("Parametresiz constructor calisti");
   }
    String isim = "Isim atanmamis";
    String soyIsim = "Soyisim atanmamis";
    String telNo;
    String adres;
    int yas;

    boolean izindeMi;

    char evliMi;

    int ekMesaiUcreti = 30;

    public int mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;
    }



}