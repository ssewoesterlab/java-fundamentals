package _02_Banknoten_Zuordnung;

import java.util.Scanner;

public class BanknoteMotifFinder {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        int nennwert;

        System.out.print("Bitte die Region eingeben : ");
        String region = scannerString.next().toUpperCase();


        switch (region){
            case "USA":
                System.out.print("Bitte den Nennwert eingeben \n1,2,5,10,20,50,100: ");
                nennwert =scannerInt.nextInt();
                switch (nennwert){
                    case 1 : System.out.println("1 Dollar - George Washington");break;
                    case 2 : System.out.println("2 Dollar - Thomas Jefferson");break;
                    case 5 : System.out.println("5 Dollar - Abraham Lincoln");break;
                    case 10 : System.out.println("10 Dollar - Alexander Hamilton");break;
                    case 20 : System.out.println("20 Dollar - Andrew Jackson");break;
                    case 50 : System.out.println("50 Dollar - Ulysses S. Grant");break;
                    case 100: System.out.println("100 Dollar - Benjamin Franklin");break;
                    default: System.out.println("Falsche Eingabe!");
                }break;
            case "EUR":
                System.out.print("Bitte den Nennwert eingeben \n5,10,20,50,100,200: ");
                nennwert =scannerInt.nextInt();
                switch (nennwert){
                    case  5: System.out.println("5 Euro - Klassik");break;
                    case  10: System.out.println("10 Euro - Romanik");break;
                    case  20: System.out.println("20 Euro - Gotik");break;
                    case  50: System.out.println("50 Euro - Renaissance");break;
                    case  100: System.out.println("100 Euro - Barock und Rokoko");break;
                    case  200: System.out.println("200 Euro - Eisen- und Glasarchitektur des 19. Jahrhunderts");break;
                    default: System.out.println("Falsche Eingabe!");
                }break;
            case "TR":
                System.out.print("Bitte den Nennwert eingeben \n5,10,20,50,100,200: ");
                nennwert =scannerInt.nextInt();
                switch (nennwert){
                    case  5: System.out.println("5 TR - Mustafa Kemal Atatürk / Aydın Sayılı");break;
                    case  10: System.out.println("10 TR - Mustafa Kemal Atatürk / Cahit Arf");break;
                    case  20: System.out.println("20 TR - Mustafa Kemal Atatürk / Mimar Kemaleddin");break;
                    case  50: System.out.println("50 TR - Mustafa Kemal Atatürk / Fatma Aliye Topuz");break;
                    case  100: System.out.println("100 TR - Mustafa Kemal Atatürk / Buhurizade Mustafa Itrî");break;
                    case  200: System.out.println("200 TR - Mustafa Kemal Atatürk / Yunus Emre");break;
                    default: System.out.println("Falsche Eingabe!");
        }break;
            default: System.out.println("Falsche Eingabe!");
        }
    }
}
