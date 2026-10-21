
package _12_Palindrom;

import java.util.Scanner;

public class _12_Palindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte einen Text eingeben: ");
        String eingabe = scanner.nextLine().trim().toLowerCase();

        if (isPalindrome(eingabe)) {
            System.out.println("Der Text ist ein Palindrom!");
        } else {
            System.out.println("Der Text ist kein Palindrom!");
        }


    }

    public static boolean isPalindrome(String text) {

        String bereinigt = "";

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (Character.isLetterOrDigit(character)) {
                bereinigt += Character.toLowerCase(character);
            }
        }

        if (bereinigt.isEmpty()) {
            return false;
        }

        String umgekehrt = "";

        for (int i = bereinigt.length() - 1; i >= 0; i--) {
            umgekehrt += bereinigt.charAt(i);
        }

        return bereinigt.equals(umgekehrt);
    }
}
