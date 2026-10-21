
package _05_Aggregatzustand_Wasser;

import java.util.Scanner;

public class _05_Aggregatzustand_Wasser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte die Wassertemperatur eingeben: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Ungültige Eingabe! Bitte eine Zahl eingeben.");
            scanner.close();
            return;
        }

        double temperatur = scanner.nextDouble();

        if (temperatur < 0) {
            System.out.println("Wasser ist fest.");

        } else if (temperatur == 0) {
            System.out.println("Wasser befindet sich am Schmelz-/Gefrierpunkt.");

        } else if (temperatur > 0 && temperatur < 100) {
            System.out.println("Wasser ist flüssig.");

        } else if (temperatur == 100) {
            System.out.println("Wasser befindet sich am Siedepunkt.");

        } else {
            System.out.println("Wasser ist gasförmig.");
        }


    }
}
