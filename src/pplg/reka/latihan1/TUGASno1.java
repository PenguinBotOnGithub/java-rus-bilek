package pplg.reka.latihan1;
import java.util.Scanner;

public class TUGASno1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkkan input angka pertama: ");
        int bil1 = inputScanner.nextInt();
        System.out.print("Masukkan input angka kedua: ");
        int bil2 = inputScanner.nextInt();

        //bil1 has to be smaller than bil2
        if (bil1 >= bil2) {
            System.out.println("ERROR: Angka pertama harus lebih kecil dari angka kedua");
            System.exit(1);
        }

        for (int i = bil1; i <= bil2; i++) {
            System.out.println(i);
        }
    }
}
