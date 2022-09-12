package pplg.reka;

import java.util.Scanner;

public class operatorTest {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please enter a number for x: ");
        int x = inputScanner.nextInt();
        System.out.print("Please enter another number for y: ");
        int y = inputScanner.nextInt();

        System.out.println("x == y = " + (x == y));
        System.out.println("x != y = " + (x != y));
        System.out.println("x > y = " + (x > y));
        System.out.println("x < y = " + (x < y));
        System.out.println("x >= y = " + (x >= y));
        System.out.println("x <= y = " + (x <= y));
    }
}
