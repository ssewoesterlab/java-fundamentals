
package _10_Passwortstaerke;

import java.util.Scanner;

public class _10_Passwortstaerke {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Passwort eingeben: ");
        String password = scanner.nextLine();

        boolean ergebnis = isStrongPassword(password);

        if (ergebnis) {
            System.out.println("Passwort ist gültig und stark!");
        } else {
            System.out.println("Passwort ist ungültig oder zu schwach!");
        }


    }

    public static boolean isStrongPassword(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }

        String sonderzeichen = "!@#$%^&*()_+-={}[];:',<.>/\\?";

        boolean hatGrossbuchstabe = false;
        boolean hatKleinbuchstabe = false;
        boolean hatZahl = false;
        boolean hatSonderzeichen = false;

        for (int i = 0; i < password.length(); i++) {

            char zeichen = password.charAt(i);

            if (zeichen >= 'A' && zeichen <= 'Z') {
                hatGrossbuchstabe = true;

            } else if (zeichen >= 'a' && zeichen <= 'z') {
                hatKleinbuchstabe = true;

            } else if (zeichen >= '0' && zeichen <= '9') {
                hatZahl = true;

            } else if (sonderzeichen.indexOf(zeichen) >= 0) {
                hatSonderzeichen = true;

            } else {
                return false;
            }
        }

        return hatGrossbuchstabe
                && hatKleinbuchstabe
                && hatZahl
                && hatSonderzeichen;
    }
}
