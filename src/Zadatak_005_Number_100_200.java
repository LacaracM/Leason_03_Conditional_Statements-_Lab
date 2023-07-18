import java.util.Scanner;

public class Zadatak_005_Number_100_200 {

    //Write a program that reads an integer entered by the user and checks if it is below 100,
    // between 100 and 200 or above 200. If the number is:
    //•	below 100 print: "Less than 100"
    //•	between 100 and 200 print: "Between 100 and 200"
    //•	above 200 print: "Greater than 200"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj;
        broj = Integer.parseInt(scanner.nextLine());

        if ( broj < 100) {
            System.out.println("Less than 100");
        }else if ( broj > 200) {
            System.out.println("Greater than 200");
        }else {
            System.out.println("Between 100 and 200");
        }
    }
}
