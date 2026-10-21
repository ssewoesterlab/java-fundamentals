
package _08_Login_Simulation;

import java.util.Scanner;

public class _08_Login_Simulation {

    static Scanner scanner = new Scanner(System.in);
    static String benutzername;
    static String password;
    static String passwortWiederholen;

    public static void main(String[] args) {

        registrierung();
        login();


    }

    public static void registrierung() {


        while (true) {

            System.out.print("Bitte Benutzername eingeben: ");
            benutzername = scanner.nextLine().trim();

            if (!benutzername.isEmpty()) {
                break;
            } else {
                System.out.println("Ungültige Eingabe! Bitte nochmal versuchen!");
            }
        }


        while (true) {

            System.out.print("Bitte Passwort eingeben: ");
            password = scanner.nextLine();

            System.out.print("Bitte Passwort wiederholen: ");
            passwortWiederholen = scanner.nextLine();

            if (!password.trim().isEmpty()
                    && password.equals(passwortWiederholen)) {

                System.out.println("Registrierung erfolgreich!");
                break;

            } else {
                System.out.println("Passwort leer oder Passwörter stimmen nicht überein!");
            }
        }
    }

    public static void login() {


        for (int i = 0; i < 3; i++) {

            System.out.print("Bitte Benutzername eingeben: ");
            String benutzernameEingabe = scanner.nextLine();

            System.out.print("Bitte Passwort eingeben: ");
            String passwordEingabe = scanner.nextLine();

            if (benutzernameEingabe.equals(benutzername)
                    && passwordEingabe.equals(password)) {

                System.out.println("Willkommen, " + benutzername
                        + "! Anmeldung erfolgreich!");
                break;

            } else {

                int verbleibendeVersuche = 2 - i;

                System.out.println("Anmeldung fehlgeschlagen!");
                System.out.println("Verbleibende Versuche: "
                        + verbleibendeVersuche);
            }

            if (i == 2) {
                System.out.println("Keine Versuche mehr! Programm beendet.");
            }
        }
    }
}
