package pplg.reka;

import java.util.Scanner;

public class testTos {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int angka = inputScanner.nextInt();
        for (int i = 1; i < angka; i++) {
            System.out.print(angka + " x ");
        }
        System.out.print("= ");
        int hasil = perkalian(angka);
        System.out.println(hasil);
    }
    public static int perkalian(int numberint) {
        int hasil = numberint;
        for (int i = 1; i < numberint; i++) {
            hasil = hasil * numberint;
        }
        return hasil;
    }
}
