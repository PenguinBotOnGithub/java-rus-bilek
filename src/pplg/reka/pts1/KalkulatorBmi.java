package pplg.reka.pts1;
import java.util.Scanner;

public class KalkulatorBmi {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi badan anda (cm): ");
        float tinggiBadan = inputScanner.nextFloat();
        float tinggiBadanMeter = tinggiBadan / 100;
        System.out.print("Masukkan berat badan anda (kg): ");
        float beratBadan = inputScanner.nextFloat();

        float BMI = beratBadan / (tinggiBadanMeter * tinggiBadanMeter);
        float BMIShort = Float.parseFloat(String.format("%.2f", BMI));

//        if (BMI < 18.5) {
//            System.out.println("Tinggi badan anda " + tinggiBadan + " cm, berat badan anda " + beratBadan + " kg.");
//            System.out.println("\nBMI anda " + BMIShort + ", berat badan kurang.");
//        } else if (BMI < 22.9) {
//            System.out.println("Tinggi badan anda " + tinggiBadan + " cm, berat badan anda " + beratBadan + " kg.");
//            System.out.println("\nBMI anda " + BMIShort + ", berat badan normal.");
//        } else if (BMI < 24.9) {
//            System.out.println("Tinggi badan anda " + tinggiBadan + " cm, berat badan anda " + beratBadan + " kg.");
//            System.out.println("\nBMI anda " + BMIShort + ", berat badan berlebih (kecenderungan obesitas).");
//        } else {
//            System.out.println("Tinggi badan anda " + tinggiBadan + " cm, berat badan anda " + beratBadan + " kg.");
//            System.out.println("\nBMI anda " + BMIShort + ", berat badan obesitas.");
//        }

        if (BMI > 25) {
            System.out.println("Tinggi badan anda " + tinggiBadan + " cm, berat badan anda " + beratBadan + " kg.");
            System.out.println("\nBMI anda " + BMIShort + ", berat badan obesitas.");
        } else if (BMI > 23) {
            System.out.println("Tinggi badan anda " + tinggiBadan + " cm, berat badan anda " + beratBadan + " kg.");
            System.out.println("\nBMI anda " + BMIShort + ", berat badan berlebih (kecenderungan obesitas).");
        } else if (BMI > 18.5) {
            System.out.println("Tinggi badan anda " + tinggiBadan + " cm, berat badan anda " + beratBadan + " kg.");
            System.out.println("\nBMI anda " + BMIShort + ", berat badan normal.");
        } else {
            System.out.println("Tinggi badan anda " + tinggiBadan + " cm, berat badan anda " + beratBadan + " kg.");
            System.out.println("\nBMI anda " + BMIShort + ", berat badan kurang.");
        }
    }
}
