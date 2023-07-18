import java.util.Scanner;

public class Zadatak_007_AreaOfFigures {
    //Write a program in which the user enters the type and dimensions of a geometric figure and calculates its area. The figures are of four types: square, square, rectangle, circle, and triangle. The first line of the input reads the type of figure (string with the following options: square, rectangle, circle, or triangle).
    //•	If the figure is a square: on the next line read a floating-point number - the length of its side
    //•	If the figure is a rectangle: on the next two lines read two floating-point numbers - the lengths of its sides
    //•	If the figure is a circle: on the next line read a floating-point number - the radius of the circle
    //•	If the figure is a triangle: on the next two lines read two floating-point numbers - the length of its side and the length of the height to it
    //Round the result up to 3 digits after the decimal point.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nazivFigure = scanner.nextLine();

        if ( nazivFigure.equals("square")) {
            double stranicaKvadrata = Double.parseDouble(scanner.nextLine());
            double povrsinaKvadrata = stranicaKvadrata * stranicaKvadrata;
            System.out.printf("%.3f", povrsinaKvadrata);
        }else if (nazivFigure.equals("rectangle")) {
            double sirina = Double.parseDouble(scanner.nextLine());
            double visina = Double.parseDouble(scanner.nextLine());
            double povrsinaPravougaonika = sirina * visina;
            System.out.printf("%.3f", povrsinaPravougaonika);
        } else if (nazivFigure.equals("circle")) {
            double poluprecnik = Double.parseDouble(scanner.nextLine());
            double povrsinaKruga = poluprecnik * poluprecnik * Math.PI;
            System.out.printf("%.3f", povrsinaKruga);
        } else if (nazivFigure.equals("triangle")) {
            double stranica = Double.parseDouble(scanner.nextLine());
            double visinaNadStranicom = Double.parseDouble(scanner.nextLine());
            double povrsinaTrougla = stranica * visinaNadStranicom / 2;
            System.out.printf("%.3f",povrsinaTrougla);

        }
    }
}
