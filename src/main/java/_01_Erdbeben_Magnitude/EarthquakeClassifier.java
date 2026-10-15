package _01_Erdbeben_Magnitude;


import java.util.Scanner;

public class EarthquakeClassifier {

    public static void main(String[] args) {
        Scanner readDouble = new Scanner(System.in);
        System.out.print("Bitte Erdbebenmagnitüde eingeben : ");
        double magnitude = readDouble.nextDouble();

        if (magnitude < 2.0) {
            System.out.println("Magnitude "+magnitude+ ": Mikroerdbeben");
        } else if (magnitude < 3.0) {
            System.out.println("Magnitude "+magnitude+ ": Sehr kleines Erdbeben");
        } else if (magnitude < 4.0) {
            System.out.println("Magnitude "+magnitude+ ": Kleines Erdbeben");
        } else if (magnitude < 5.0) {
            System.out.println("Magnitude "+magnitude+ ": Leichtes Erdbeben");
        } else if (magnitude < 6.0) {
            System.out.println("Magnitude "+magnitude+ ": Moderates Erdbeben");
        } else if (magnitude < 7.0) {
            System.out.println("Magnitude "+magnitude+ ": Starkes Erdbeben");
        } else if (magnitude < 8.0) {
            System.out.println("Magnitude "+magnitude+ ": Großes Erdbeben");
        } else {
            System.out.println("Magnitude "+magnitude+ ": Sehr großes Erdbeben");
        }

    }
}
