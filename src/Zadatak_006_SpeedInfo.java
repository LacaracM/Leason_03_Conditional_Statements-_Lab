import java.util.Scanner;

public class Zadatak_006_SpeedInfo {

    //Write a program that reads the speed (floating-point number) entered by the user and prints speed information.
    //•	At speed up to 10 (inclusive) print "slow"
    //•	At speed between 10 and 50 (inclusive) print "average"
    //•	At speed between 50 and 150 (inclusive) print "fast"
    //•	At speed between 150 and 1000 (inclusive) print "ultra fast"
    //•	At a higher speed print "extremely fast"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double brzina;

        brzina = Double.parseDouble(scanner.nextLine());
        if (brzina <= 10) {
            System.out.println("slow");
        } else if ( brzina <= 50) {
            System.out.println("average");
        } else if ( brzina <= 150) {
            System.out.println("fast");
        } else if ( brzina <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}

