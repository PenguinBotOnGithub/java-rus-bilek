package pplg.reka;
import java.util.Scanner;

public class bjirAmat {
    static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
                # # # # # # # # # # # # # # # # # # # # # # # # # #
                # L         O O O O O   G G G G G   I   N N     N #
                # L         O       O   G           I   N  N    N #
                # L         O       O   G   G G G   I   N   N   N #
                # L         O       O   G       G   I   N    N  N #
                # L L L L   O O O O O   G G G G G   I   N     N N #
                # # # # # # # # # # # # # # # # # # # # # # # # # #""");
        System.out.print("Username: ");
        String uName = inputScanner.nextLine();
        System.out.print("Password: ");
        String pWord = inputScanner.next();

        if (checkCredentials(uName, pWord)) {
            System.out.println("Successfully logged in!\n");
            bdMenu();
        } else {
            System.out.println("Incorrect username or password");
            System.exit(1);
        }
    }

    static boolean checkCredentials(String name, String pass) {
        boolean returnval;
        returnval = name.equalsIgnoreCase("admin") && pass.equals("admin");
        return returnval;
    }

   static void bdMenu() {
       System.out.println("Program menghitung luas dan keliling bangun datar");
       System.out.println("""
                1. Persegi
                2. Persegi Panjang
                3. Segitiga Siku-siku
                4. Lingkaran""");
       System.out.print("\nMasukkan pilihan anda: ");
       int pilihan = inputScanner.nextInt();

       switch (pilihan) {
           case 1 -> {
               System.out.println("Anda telah memilih persegi");
               persegi();
           }
           case 2 -> {
               System.out.println("Anda telah memilih persegi panjang");
               persegiPanjang();
           }
           case 3 -> {
               System.out.println("Anda telah memilih segitiga");
               segitiga();
           }
           case 4 -> {
               System.out.println("Anda telah memilih lingkaran");
               lingkaran();
           }
           default -> {
               System.out.println("Bukan pilihan yang valid");
               System.exit(1);
           }
       }
   }

    static void persegi() {
        System.out.print("Silahkan masukkan sisi persegi (cm): ");
        float sisi = inputScanner.nextFloat();
        float luas = sisi * sisi;
        float keliling = sisi + sisi + sisi + sisi;
        System.out.println("Luas persegi dengan sisi " + sisi + " cm adalah " + luas + " cm kuadrat dan kelilingnya adalah " + keliling + " cm");
    }

    static void persegiPanjang() {
        System.out.print("Silahkan masukkan panjang persegi panjang (cm): ");
        float panjang = inputScanner.nextFloat();
        System.out.print("Silahkan masukkan lebar persegi panjang (cm): ");
        float lebar = inputScanner.nextFloat();
        float luas = panjang * lebar;
        float keliling = (panjang + lebar) * 2;
        System.out.println("Luas persegi panjang dengan panjang " + panjang + " cm dan lebar " + lebar + " cm adalah " + luas + " cm kuadrat dan kelilingnya adalah " + keliling + " cm");
    }

    static void segitiga() {
        System.out.print("Silahkan masukkan alas segitiga (cm): ");
        float alas = inputScanner.nextFloat();
        System.out.print("Silahkan masukkan tinggi segitiga (cm): ");
        float tinggi = inputScanner.nextFloat();
        float miring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        float luas = (alas * tinggi) / 2;
        float keliling = alas + tinggi + miring;
        System.out.println("Luas segitiga siku-siku dengan alas " + alas + " cm dan tinggi " + tinggi + " cm adalah " + String.format("%.2f", luas) + " cm kuadrat dan kelilingnya adalah " + String.format("%.2f", keliling) + " cm");
    }

    static void lingkaran() {
        System.out.print("Silahkan masukkan jari-jari lingkaran (cm): ");
        float jari = inputScanner.nextFloat();
        float diameter = jari * 2;
        float luas;
        float keliling;

        if (jari % 7 == 0) {
            luas = 22 * (jari / 7) * jari;
            keliling = 22 * (diameter / 7);
        } else {
            luas = 3.14f * jari * jari;
            keliling = 3.14f * diameter;
        }

        System.out.println("Luas lingkaran dengan jari-jari " + jari + " cm adalah " + String.format("%.2f", luas) + " cm kuadrat dan kelilingnya adalah " + String.format("%.2f", keliling) + " cm");
    }
}
