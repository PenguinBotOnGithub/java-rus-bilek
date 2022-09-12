package pplg.reka;
import java.util.Scanner;

public class arrayTest {
    static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Java-style array declaration
        String[] keluargaUtuh = {"Bapak", "Ibu", "Kakak", "Adik"};
        //C-style array declaration
        String keluargaSakit[] = {"Ibu", "Adik"};
        System.out.println(keluargaSakit.length);

        //Ukuran/panjang/length dari sebuah array ditentukan sejak pertama kali declaration

        //Multidimensional array
        String credentials[][] = {{"Reka", "akeR", "admin"}, {"Pengu", "ugneP", "admin"}};

        int j;
        for (j = 0; j < credentials[0].length; j++) {
            if (credentials[0][j].equalsIgnoreCase("admin")) {
                break;
            }
        }

        if (credentials[1][j].equalsIgnoreCase("admin")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Incorrect name or password");
        }

        String makananFavorit[] = new String[5];
        for (int i = 0; i < makananFavorit.length; i++) {
            System.out.print("Makanan favorit ke-" + (i + 1) + ": ");
            makananFavorit[i] = inputScanner.nextLine();
        }

        for (String s : makananFavorit) {
            System.out.println(s);
        }
    }
}
