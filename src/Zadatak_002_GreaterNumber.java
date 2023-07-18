import java.util.Scanner;

public class Zadatak_002_GreaterNumber {
    //Write a program that reads two integers entered by the user and prints the larger of the two.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prviBroj;
        int drugiBroj;
        prviBroj = Integer.parseInt(scanner.nextLine());
        drugiBroj = Integer.parseInt(scanner.nextLine());

        if ( prviBroj > drugiBroj) {
            System.out.println(prviBroj);

        }
        else  {
            System.out.println(drugiBroj);

        }
    }
}
