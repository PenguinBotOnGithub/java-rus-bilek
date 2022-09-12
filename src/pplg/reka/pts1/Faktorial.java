package pplg.reka.pts1;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan input angka untuk difaktor: ");
        int intInput = inputScanner.nextInt();
        long hasil;

        int i = intInput;
        hasil = i;
        while (i > 1) {
            hasil = hasil * (i - 1);
//            System.out.println(hasil + " " + i);
            i--;
        }
        System.out.println("Hasil dari faktorial " + intInput + " adalah " + hasil);
    }
}