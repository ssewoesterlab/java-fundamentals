package _03_Dreiecke;

import java.util.Scanner;

public class Dreiecke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Seite a: ");
        double a = scanner.nextDouble();

        System.out.print("Seite b: ");
        double b = scanner.nextDouble();

        System.out.print("Seite c: ");
        double c = scanner.nextDouble();


        if (a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a) {


            if (a == b && b == c) {
                System.out.println("Gültiges gleichseitiges Dreieck");

            } else if (a == b || a == c || b == c) {
                System.out.println("Gültiges gleichschenkliges Dreieck");

            } else {
                System.out.println("Gültiges ungleichseitiges Dreieck");
            }

        } else {
            System.out.println("Kein gültiges Dreieck");
        }
    }
}
