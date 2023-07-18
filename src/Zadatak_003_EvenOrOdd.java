import java.util.Scanner;

public class Zadatak_003_EvenOrOdd {
    //Write a program that reads an integer entered by the user and prints whether it is even or odd.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj;
        broj = Integer.parseInt(scanner.nextLine());
        int ostatakSa2 = broj % 2;
// lakse je if(broj % 2 == 0 ){}
        if (ostatakSa2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        System.out.println("");
    }
}

