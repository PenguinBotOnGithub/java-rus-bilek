package pplg.reka;

import java.util.Scanner;

class Glob {
    static Scanner inputScanner = new Scanner(System.in);
}

public class LoopyLoop {
    public static void main(String[] args) {
        System.out.print("Input string: ");
        String inputString = Glob.inputScanner.nextLine();

        //Ask for printing method
        System.out.print("Printing method (choose 'plus' or 'enter'): ");
        String printMethod = Glob.inputScanner.nextLine().toLowerCase();
        //Check for method with switch case
        switch (printMethod) {
            case "plus" -> Looping.PlusLoop(inputString);
            case "enter" -> Looping.EnterLoop(inputString);
            default -> {
                System.out.println("ERROR: Please enter a valid printing method");
                System.exit(1);
            }
        }

        System.out.print("\n");
    }
}

class Looping {
    public static void PlusLoop(String is) {
        for (int i = 0; i < is.length(); i++) {
            System.out.print("'" + is.charAt(i) + "'");
            if (i < (is.length() - 1)) {
                System.out.print(" + ");
            }
        }
    }

    public static void EnterLoop(String is) {
        int count = 0;
        while (count < is.length()) {
            System.out.println("'" + is.charAt(count) + "'");
            count++;
        }
    }
}