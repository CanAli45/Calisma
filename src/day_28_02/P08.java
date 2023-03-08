package day_28_02;

import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        String output = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(output);
    }
}
