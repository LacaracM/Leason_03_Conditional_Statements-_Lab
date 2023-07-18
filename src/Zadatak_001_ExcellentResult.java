import java.util.Scanner;

public class Zadatak_001_ExcellentResult {
    //1.	Excellent Result
    //Write a console program that reads a rating (integer) entered by the user
    // and prints "Excellent!" if the score is 5 or higher.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ocena;
        ocena = Integer.parseInt(scanner.nextLine());
        if ( ocena >=5 ) {
            System.out.println("Excellent!");
        }
        //  System.out.println("Komanda posle if-a");
    }
}