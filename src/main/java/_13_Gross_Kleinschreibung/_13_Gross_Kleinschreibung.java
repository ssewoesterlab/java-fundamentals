package _13_Gross_Kleinschreibung;

import java.util.Locale;
import java.util.Scanner;

public class _13_Gross_Kleinschreibung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte einen Text eingeben: ");
        String eingabe = scanner.nextLine();

        String grossbuchstaben = toUpperCase(eingabe);
        String kleinbuchstaben = toLowerCase(eingabe);

        System.out.println("\n--- Ergebnis ---");
        System.out.println("Originaltext: " + eingabe);
        System.out.println("Großbuchstaben: " + grossbuchstaben);
        System.out.println("Kleinbuchstaben: " + kleinbuchstaben);


    }

    public static String toUpperCase(String text) {

        return text.toUpperCase();
    }

    public static String toLowerCase(String text) {

        return text.toLowerCase();
    }
}
