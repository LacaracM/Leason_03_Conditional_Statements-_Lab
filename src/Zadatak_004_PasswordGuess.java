import java.util.Scanner;

public class Zadatak_004_PasswordGuess {

    //Write a program that reads a password (string) entered by the user
    // and checks if the entered password matches the phrase "s3cr3t!P@ssw0rd".
    // In case of coincidence, display "Welcome". In case of discrepancy, display "Wrong password!".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paswword;
        paswword = scanner.nextLine();

        if(paswword.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}

