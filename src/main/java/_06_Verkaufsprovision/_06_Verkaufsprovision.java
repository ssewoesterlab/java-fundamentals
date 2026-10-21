
package _06_Verkaufsprovision;

import java.util.Scanner;
import java.util.Locale;

public class _06_Verkaufsprovision {

    static Scanner scanner = new Scanner(System.in);

    static double fixgehalt;
    static double verkaufsumsatz;
    static double zielumsatz;
    static double provision;
    static double gesamtgehalt;

    public static void main(String[] args) {

        fixgehaltLesen();
        verkaufsumsatzLesen();
        zielumsatzLesen();

        provisionRechnen();
        gesamtgehaltRechnen();

        System.out.println("Fixgehalt: " + fixgehalt);
        System.out.println("Provision:" + provision);
        System.out.println("Gesamtgehalt: " + gesamtgehalt);

        scanner.close();
    }

    public static void fixgehaltLesen() {

        while (true) {
            System.out.print("Bitte Fixgehalt eingeben: ");

            if (scanner.hasNextDouble()) {
                fixgehalt = scanner.nextDouble();

                if (fixgehalt >= 0) {
                    break;
                }
            } else {
                scanner.next();
            }

            System.out.println("Falsche Eingabe! Bitte nochmal versuchen!");
        }
    }

    public static void verkaufsumsatzLesen() {

        while (true) {
            System.out.print("Bitte Verkaufsumsatz eingeben: ");

            if (scanner.hasNextDouble()) {
                verkaufsumsatz = scanner.nextDouble();

                if (verkaufsumsatz >= 0) {
                    break;
                }
            } else {
                scanner.next();
            }

            System.out.println("Falsche Eingabe! Bitte nochmal versuchen!");
        }
    }

    public static void zielumsatzLesen() {

        while (true) {
            System.out.print("Bitte Zielumsatz eingeben: ");

            if (scanner.hasNextDouble()) {
                zielumsatz = scanner.nextDouble();

                if (zielumsatz >= 0) {
                    break;
                }
            } else {
                scanner.next();
            }

            System.out.println("Falsche Eingabe! Bitte nochmal versuchen!");
        }
    }

    public static void provisionRechnen() {

        if (verkaufsumsatz > zielumsatz) {
            provision = verkaufsumsatz * 0.10;
        } else {
            provision = verkaufsumsatz * 0.05;
        }
    }

    public static void gesamtgehaltRechnen() {
        gesamtgehalt = fixgehalt + provision;
    }
}
