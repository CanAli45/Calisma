package day_03_13_Bireysel;

public class P06_Araba {
    @Override
    public String toString() {
        return "Araba ozellikleri{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    public P06_Araba(String mrk, String mdl, boolean hmi, int yl, int fyt){

        yil = yl;
        marka=mrk;
        model=mdl;
        hasarliMi=hmi;
        fiyat=fyt;
    }
    public P06_Araba(){

    }

   int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmeimis";
    boolean hasarliMi;
    int fiyat;
    public void yakitTuketimi(String yakitTuru){
        switch (yakitTuru){
            case "Benzin":
                System.out.println("Benzinli araclar icin yakit tuketimi: 6l/100 km");
                break;
            case "Dizel":
                System.out.println("Dİzel araclar icin yakit tukeitmi:5l/100km");
                break;
            case "Elektrik":
                System.out.println("Elektrikli araclar icin yakit tuketimi:5kW/100km");
                break;
            default:
                System.out.println("Gecersiz yakit turu");
        }
    }
}
