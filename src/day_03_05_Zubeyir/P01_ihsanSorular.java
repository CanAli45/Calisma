package day_03_05_Zubeyir;

import java.util.Arrays;

public class P01_ihsanSorular {
    public static void main(String[] args) {
        // verilen str' da sira numarasina dikkat ederek
        // result cıktısındaki hale getirin.

        String str = "gol!d3 bl%ue1 bla&ck4 gre1e*n5 whi4te6 or3ange2";

        // result: "blue orange gold black green white"
        renkSiralama(str);


    }

    public static String renkSiralama(String str) {

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i].charAt(arr[i].length()-1)+arr[i];
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        for (int i = 0; i < arr.length ; i++) {

            arr[i]=arr[i].replaceAll("[^a-z]","");

        }
        System.out.println(Arrays.toString(arr));




        return "";
    }

}
