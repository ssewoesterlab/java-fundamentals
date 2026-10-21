package _15_Run_Length_Encoding;

import java.util.Scanner;

public class _15_Run_Length_Encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Text eingabe: ");
        String eingabe = scanner.nextLine();
        int count = 1;
        String zipEingabe = "";

        for (int i = 1; i < eingabe.length(); i++) {
            if (eingabe.charAt(i) == eingabe.charAt(i - 1)) {
                count++;
            } else {
                zipEingabe +=count+""+eingabe.charAt(i-1);
                count=1;
            }

        }

        zipEingabe += count + "" + eingabe.charAt(eingabe.length() - 1);
        System.out.println(zipEingabe);


    }
}
