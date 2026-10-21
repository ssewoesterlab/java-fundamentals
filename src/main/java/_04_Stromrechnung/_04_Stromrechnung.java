
package _04_Stromrechnung;

import java.util.Scanner;
import java.util.Locale;

public class _04_Stromrechnung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte vorherigen Zaehlerstand eingeben: ");
        int vorherigerZaehlerstand = scanner.nextInt();

        System.out.print("Bitte aktuellen Zaehlerstand eingeben: ");
        int aktuellerZaehlerstand = scanner.nextInt();


        if (vorherigerZaehlerstand < 0
                || aktuellerZaehlerstand < 0
                || aktuellerZaehlerstand < vorherigerZaehlerstand) {

            System.out.println("Ungueltige Eingabe!");
            scanner.close();
            return;
        }


        int verbrauch = aktuellerZaehlerstand - vorherigerZaehlerstand;

        double preis;


        if (verbrauch <= 100) {
            preis = 1.10;
        } else if (verbrauch <= 200) {
            preis = 1.30;
        } else if (verbrauch <= 300) {
            preis = 1.50;
        } else if (verbrauch <= 400) {
            preis = 1.70;
        } else if (verbrauch <= 500) {
            preis = 1.90;
        } else {
            preis = 2.30;
        }


        double rechnung = verbrauch * preis;

        System.out.println("Verbrauch: " + verbrauch + " kWh");
        System.out.printf("Rechnung: ", rechnung);


    }
}
