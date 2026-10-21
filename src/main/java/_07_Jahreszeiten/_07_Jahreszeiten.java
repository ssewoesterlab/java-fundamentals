
package _07_Jahreszeiten;

import java.util.Scanner;

public class _07_Jahreszeiten {

    static int monat;
    static int tag;
    static String jahreszeit;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        monatLesen();
        tagLesen();

        jahresZeit();

        System.out.println("Monat: " + monat);
        System.out.println("Tag: " + tag);
        System.out.println("Jahreszeit: " + jahreszeit);

        scanner.close();
    }

    public static void monatLesen() {

        while (true) {

            System.out.print("Bitte den Monat eingeben: ");

            if (scanner.hasNextInt()) {

                int eingabe = scanner.nextInt();

                if (eingabe >= 1 && eingabe <= 12) {
                    monat = eingabe;
                    break;
                }

            } else {
                scanner.next();
            }

            System.out.println("Ungültige Eingabe! Bitte nochmal versuchen!");
        }
    }

    public static void tagLesen() {

        while (true) {

            System.out.print("Bitte den Tag eingeben: ");

            if (scanner.hasNextInt()) {

                int eingabe = scanner.nextInt();

                if (eingabe >= 1 && eingabe <= 31) {
                    tag = eingabe;
                    break;
                }

            } else {
                scanner.next();
            }

            System.out.println("Ungültige Eingabe! Bitte nochmal versuchen!");
        }
    }


    public static void jahresZeit() {

        if ((monat == 3 && tag >= 20)
                || (monat > 3 && monat < 6)
                || (monat == 6 && tag <= 20)) {

            jahreszeit = "Frühling";

        } else if ((monat == 6 && tag >= 21)
                || (monat > 6 && monat < 9)
                || (monat == 9 && tag <= 21)) {

            jahreszeit = "Sommer";

        } else if ((monat == 9 && tag >= 22)
                || (monat > 9 && monat < 12)
                || (monat == 12 && tag <= 20)) {

            jahreszeit = "Herbst";

        } else if ((monat == 12 && tag >= 21)
                || (monat == 1 || monat == 2)
                || (monat == 3 && tag <= 19)) {

            jahreszeit = "Winter";
        }
    }

}
