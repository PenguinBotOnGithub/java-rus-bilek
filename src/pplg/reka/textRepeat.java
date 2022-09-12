package pplg.reka;
import java.util.Scanner;

public class textRepeat {
    public static void main(String[] args) {
        //Setup the scanner first
        Scanner inputScanner = new Scanner(System.in);
        //Print a line, and make a new string from user's input
        System.out.print("Please enter a text you want print: ");
        String textToRepeat = inputScanner.nextLine();
        //Also print a line, but make a new int instead
        System.out.print("Print the text for: ");
        int timeToRepeat = inputScanner.nextInt();
        //Prints the string repeated with a for loop
        for (int i = 1; i < timeToRepeat; i++) {
            System.out.println(textToRepeat);
        }
    }
}
