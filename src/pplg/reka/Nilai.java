package pplg.reka;
import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
       Scanner inputScanner = new Scanner(System.in);
       System.out.print("Masukkan nilai anda: ");
       int nilai = inputScanner.nextInt();

       if (nilai <= 54) {
           System.out.println("Nilai kamu adalah D");
       } else if (nilai <= 69) {
           System.out.println("Nilai kamu adalah C");
       } else if (nilai <= 85) {
           System.out.println("Nilai kamu adalah B");
       } else if (nilai <= 100) {
           System.out.println("Nilai kamu adalah A");
       } else {
           System.out.println("Input nilai terlalu tinggi");
       }

       System.out.print("Masukkan rating anda: ");
       char rating = inputScanner.next().charAt(0);
       switch (Character.toLowerCase(rating)) {
           case 'a' -> System.out.println("Nilai kamu adalah 86 - 100");
           case 'b' -> System.out.println("Nilai kamu adalah 70 - 85");
           case 'c' -> System.out.println("Nilai kamu adalah 55 - 69");
           case 'd' -> System.out.println("Nilai kamu adalah 0 - 54");
           default -> System.out.println("Huruf rating salah");
       }
    }
}
