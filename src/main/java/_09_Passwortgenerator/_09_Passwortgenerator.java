
package _09_Passwortgenerator;

import java.util.Random;

public class _09_Passwortgenerator {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {

            String password = passwordGenerieren();

            if (password.length() < 8 || password.length() > 10) {
                System.out.println("Fehler: Ungültige Passwortlänge!");
            }
            for (int j = 0; j < password.length(); j++) {
                char zeichen = password.charAt(j);
                if (zeichen < 33 || zeichen > 126) {
                    System.out.println("Fehler: Ungültiges ASCII-Zeichen!");
                }
            }
        }
        System.out.println("Test abgeschlossen!");
        }




    public static String passwordGenerieren() {

        Random random = new Random();

        int laenge = random.nextInt(3) + 8;

        String password = "";

        for (int i = 0; i < laenge; i++) {

            int ascii = random.nextInt(94) + 33;

            char zeichen = (char) ascii;

            password += zeichen;
        }

        return password;
    }
}
