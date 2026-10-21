package _11_Internetrechnung;

import java.util.Scanner;

public class _11_Internetrechnung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double gesamtsumme = 0;
        int kundenAnzahl = 0;
        String antwort;

        do {
            System.out.println("\n--- Kunde " + (kundenAnzahl + 1) + " ---");


            double grundgebuehr;

            do {
                System.out.print("Grundgebühr: ");
                grundgebuehr = scanner.nextDouble();

                if (grundgebuehr < 0) {
                    System.out.println("Grundgebühr darf nicht negativ sein!");
                }

            } while (grundgebuehr < 0);


            int kategorie;

            do {
                System.out.print("Kategorie (1, 2 oder 3): ");
                kategorie = scanner.nextInt();

                if (kategorie < 1 || kategorie > 3) {
                    System.out.println("Ungültige Kategorie!");
                }

            } while (kategorie < 1 || kategorie > 3);


            int zusaetzlicheGB;

            do {
                System.out.print("Zusätzliche GB: ");
                zusaetzlicheGB = scanner.nextInt();

                if (zusaetzlicheGB < 0) {
                    System.out.println("GB dürfen nicht negativ sein!");
                }

            } while (zusaetzlicheGB < 0);


            double monatsbetrag = calculateInvoice(
                    grundgebuehr, kategorie, zusaetzlicheGB
            );

            System.out.println("Monatsbetrag: " +monatsbetrag);


            gesamtsumme += monatsbetrag;
            kundenAnzahl++;

            scanner.nextLine();


            do {
                System.out.print("Weiteren Kunden berechnen? (ja/nein): ");
                antwort = scanner.nextLine().trim();

                if (!antwort.equalsIgnoreCase("ja")
                        && !antwort.equalsIgnoreCase("nein")) {
                    System.out.println("Bitte ja oder nein eingeben!");
                }

            } while (!antwort.equalsIgnoreCase("ja")
                    && !antwort.equalsIgnoreCase("nein"));

        } while (antwort.equalsIgnoreCase("ja"));


        System.out.println("\n--- Gesamtergebnis ---");
        System.out.println("Kundenanzahl: " + kundenAnzahl);
        System.out.println("Gesamtsumme:"+ gesamtsumme);

        scanner.close();
    }

    public static double calculateInvoice(
            double grundgebuehr, int kategorie, int zusaetzlicheGB) {

        double preisProGB;

        switch (kategorie) {
            case 1:
                preisProGB = 0.10;
                break;

            case 2:
                preisProGB = 0.20;
                break;

            case 3:
                preisProGB = 0.30;
                break;

            default:
                throw new IllegalArgumentException("Ungültige Kategorie!");
        }

        double zusatzkosten = zusaetzlicheGB * preisProGB;
        double monatsbetrag = grundgebuehr + zusatzkosten;

        return monatsbetrag;
    }
}
