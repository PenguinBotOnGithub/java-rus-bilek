package pplg.reka;
import java.util.Scanner;

class globalstuff {
    static String[] username = {"reka", "nando", "haidar"};
    static Scanner inputScanner = new Scanner(System.in);
    static String[] password = {"pengubot", "jatoh", "lagihaji"};
    static String CurrentLoggedIn;
}

class reka {
    static String namaLengkap = "Eureka Ahadyan Ilhamy";
    static String namaPanggilan = "Reka";
    static int umur = 15;
    static float beratBadan = 41.0f;
}

class nando {
    static String namaLengkap = "Acaryanandana Alif Fajar";
    static String namaPanggilan = "Nando";
    static int umur = 15;
    static float beratBadan = 51.0f;
}

class haidar {
    static String namaLengkap = "Haidar Bahzi";
    static String namaPanggilan = "Haidar";
    static int umur = 15;
    static float beratBadan = 50.0f;
}

public class loginTest {
    public static void main(String[] args) {
        //Variables
        String inputUsername;
        String inputPassword;

        //Ask for username
        System.out.print("Username: ");
        inputUsername = globalstuff.inputScanner.nextLine();

        //Ask for password
        System.out.print("Password: ");
        inputPassword = globalstuff.inputScanner.nextLine();

        //Checks login credentials
        if (!(checkLoginOne(inputUsername, inputPassword))) {
            System.out.println("\n");
            System.out.println("Wrong username or password");
            System.exit(1);
        }

        //Update the CurrentLoggedIn var
        globalstuff.CurrentLoggedIn = inputUsername.toLowerCase();

        //Inform the user
        System.out.print("\n");
        System.out.println("You are now logged in!");

        commandStage();
    }

    public static boolean checkLoginOne(String uname, String pword) {
        boolean returnval;
        int i;
        for (i = 0; i < globalstuff.username.length; i++) {
            if (uname.equalsIgnoreCase(globalstuff.username[i])) {
                break;
            }
        }
        if (i >= globalstuff.username.length) {
            returnval = false;
        } else {
            returnval = checkLoginTwo(pword, i);
        }

        return returnval;
    }

    public static boolean checkLoginTwo(String input, int i) {
        boolean returnval;
        returnval = globalstuff.password[i].equals(input);
        return returnval;
    }

    public static void commandStage() {
        System.out.print("\n");
        System.out.print("Command: ");
        String command = globalstuff.inputScanner.nextLine();

        switch (command.toLowerCase()) {
            case "exit" -> ExitProgram();
            case "bio" -> PrintBio();
            case "help" -> PrintHelp();
            case "textrepeat" -> TextRepeatFront();
            default -> {
                System.out.println("Not a valid command" +
                        "\nSee the 'help' command for help");
                //System.out.println(command);
                commandStage();
            }
        }
    }

    public static void PrintBio() {
        System.out.print("\n");
        switch (globalstuff.CurrentLoggedIn) {
            case "reka"-> {
                System.out.println("Nama Lengkap: " + reka.namaLengkap);
                System.out.println("Nama Panggilan: " + reka.namaPanggilan);
                System.out.println("Umur: " + reka.umur);
                System.out.println("Berat Badan: " + reka.beratBadan);
                commandStage();
            }
            case "nando" -> {
                System.out.println("Nama Lengkap: " + nando.namaLengkap);
                System.out.println("Nama Panggilan: " + nando.namaPanggilan);
                System.out.println("Umur: " + nando.umur);
                System.out.println("Berat Badan: " + nando.beratBadan);
                commandStage();
            }
            case "haidar" -> {
                System.out.println("Nama Lengkap: " + haidar.namaLengkap);
                System.out.println("Nama Panggilan: " + haidar.namaPanggilan);
                System.out.println("Umur: " + haidar.umur);
                System.out.println("Berat Badan: " + haidar.beratBadan);
                commandStage();
            }
            default -> commandStage();
        }
    }

    public static void PrintHelp() {
        System.out.println("""

                List of commands:
                help: Print this help message
                bio: Print this user's biodata
                textrepeat: Print a text for a specific number of time
                exit: Exit the program
                """);
        commandStage();
    }

    public static void TextRepeatFront() {
        System.out.print("\nText to print: ");
        String TextToRepeat = globalstuff.inputScanner.nextLine();
        System.out.print("How many times the text should be printed: ");
        int HowMuch = globalstuff.inputScanner.nextInt();
        System.out.print("\n");

        //Start printing
        TextRepeatMain(TextToRepeat, HowMuch);
//        commandStage();
    }

    public static void TextRepeatMain(String Text, int HW) {
        for (int i = 1; i <= HW; i++) {
            System.out.println(Text);
        }
        System.out.print("\n");
        commandStage();
    }

    public static void ExitProgram() {
        System.exit(0);
    }

}