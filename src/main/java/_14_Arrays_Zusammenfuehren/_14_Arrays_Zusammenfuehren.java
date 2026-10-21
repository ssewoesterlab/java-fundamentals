
package _14_Arrays_Zusammenfuehren;

import java.util.Scanner;
import java.util.TreeSet;

public class _14_Arrays_Zusammenfuehren {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Array 1 eingeben: ");
        String eingabe1 = scanner.nextLine();

        System.out.print("Array 2 eingeben: ");
        String eingabe2 = scanner.nextLine();

        String[] array1;
        String[] array2;


        if (eingabe1.trim().isEmpty()) {
            array1 = new String[0];
        } else {
            array1 = eingabe1.split(",", -1);
        }

        if (eingabe2.trim().isEmpty()) {
            array2 = new String[0];
        } else {
            array2 = eingabe2.split(",", -1);
        }

        TreeSet<Integer> zahlen = new TreeSet<>();

        try {

            for (int i = 0; i < array1.length; i++) {
                zahlen.add(Integer.parseInt(array1[i].trim()));
            }

            for (int i = 0; i < array2.length; i++) {
                zahlen.add(Integer.parseInt(array2[i].trim()));
            }

            System.out.println("Ergebnis: " + zahlen);

        } catch (NumberFormatException e) {
            System.out.println(
                    "Fehler: Bitte nur ganze Zahlen eingeben! " +
                            "Leere Felder sind nicht erlaubt."
            );
        }
    }
}
