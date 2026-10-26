
package _16_Kaffeeautomat;

import java.util.Locale;
import java.util.Scanner;

public class Methoden {

    Scanner scanner = new Scanner(System.in);

    private String kaffee;
    private String groesse;
    private boolean zucker;
    private int zuckerAnzahl;
    private boolean milch;
    private String milchText;
    private String zuckerText;

    public Methoden() {

    }


    private String eingabeNormalisieren(String eingabe) {
        return eingabe.trim()
                .toLowerCase()
                .replace('ı', 'i')
                .replace('ü', 'u')
                .replace('ç', 'c')
                .replace('ş', 's')
                .replace('ğ', 'g')
                .replace('ö', 'o');
    }

    public void kaffeeAuswahl() {

        while (true) {

            System.out.println(
                    "Welchen Kaffee möchten Sie?\n" +
                            " Türkischer Kaffee\n" +
                            " Filterkaffee\n" +
                            " Espresso"
            );

            setKaffee(eingabeNormalisieren(scanner.nextLine()));

            if (getKaffee().equals("turk kahvesi")
                    || getKaffee().equals("turkischer kaffee")) {

                setKaffee("Türkischer Kaffee");

                System.out.println(
                        getKaffee() + " – Gute Wahl!"
                );
                break;

            } else if (getKaffee().equals("filtre kahve")
                    || getKaffee().equals("filtrekahve")
                    || getKaffee().equals("filterkaffee")
                    || getKaffee().equals("filter kaffee")) {

                setKaffee("Filterkaffee");

                System.out.println(
                        getKaffee() + " – Gute Wahl!"
                );
                break;

            } else if (getKaffee().equals("espresso")
                    || getKaffee().equals("expresso")) {

                setKaffee("Espresso");

                System.out.println(
                        getKaffee() + " – Gute Wahl!"
                );
                break;

            } else {

                System.out.println(
                        "Ungültige Eingabe! Bitte versuchen Sie es erneut!"
                );
            }
        }
    }

    public void milchAuswahl() {

        while (true) {

            System.out.println(
                    "Möchten Sie Milch zu Ihrem Kaffee hinzufügen? " +
                            "(Bitte mit Ja oder Nein antworten):"
            );

            String antwort = eingabeNormalisieren(scanner.nextLine());

            if (antwort.equals("evet")
                    || antwort.equals("yes")
                    || antwort.equals("ja")) {

                setMilch(true);
                setMilchText("Mit Milch");

                System.out.println(
                        getKaffee() + ", " + getMilchText()
                );
                break;

            } else if (antwort.equals("hayir")
                    || antwort.equals("no")
                    || antwort.equals("nein")) {

                setMilch(false);
                setMilchText("Ohne Milch");

                System.out.println(
                        getKaffee() + ", " + getMilchText()
                );
                break;

            } else {

                System.out.println(
                        "Ungültige Eingabe! Bitte versuchen Sie es erneut!"
                );
            }
        }
    }

    public void zuckerAuswahl() {

        while (true) {

            System.out.println(
                    "Möchten Sie Zucker? " +
                            "(Bitte mit Ja oder Nein antworten):"
            );

            String antwort = eingabeNormalisieren(scanner.nextLine());

            if (antwort.equals("evet")
                    || antwort.equals("yes")
                    || antwort.equals("ja")) {

                setZucker(true);
                zuckerMenge();
                setZuckerText("Mit Zucker");
                break;

            } else if (antwort.equals("hayir")
                    || antwort.equals("no")
                    || antwort.equals("nein")) {

                setZucker(false);
                setZuckerText("Ohne Zucker");
                break;

            } else {

                System.out.println(
                        "Ungültige Eingabe! Bitte versuchen Sie es erneut!"
                );
            }
        }
    }

    public void zuckerMenge() {

        while (true) {

            System.out.println(
                    "Wie viele Stück Zucker möchten Sie?: "
            );

            if (scanner.hasNextInt()) {

                int anzahl = scanner.nextInt();

                // Verbleibenden Zeilenumbruch entfernen
                scanner.nextLine();

                if (anzahl > 0) {

                    setZuckerAnzahl(anzahl);

                    System.out.println(
                            getZuckerAnzahl() +
                                    " Stück Zucker werden hinzugefügt."
                    );
                    break;
                }

                System.out.println(
                        "Bitte geben Sie eine Zahl größer als 0 ein!"
                );

            } else {

                scanner.nextLine();

                System.out.println(
                        "Ungültige Eingabe! Bitte geben Sie eine Zahl ein."
                );
            }
        }
    }

    public void groessenAuswahl() {

        while (true) {

            System.out.println(
                    "Welche Größe möchten Sie?: klein/mittel/groß"
            );

            String groesse = eingabeNormalisieren(scanner.nextLine());

            if (groesse.equals("kucuk")
                    || groesse.equals("small")
                    || groesse.equals("smal")
                    || groesse.equals("klein")) {

                setGroesse("Klein");
                break;

            } else if (groesse.equals("orta")
                    || groesse.equals("medium")
                    || groesse.equals("mittel")) {

                setGroesse("Mittel");
                break;

            } else if (groesse.equals("buyuk")
                    || groesse.equals("large")
                    || groesse.equals("groß")
                    || groesse.equals("gros")
                    || groesse.equals("gross")) {

                setGroesse("Groß");
                break;

            } else {

                System.out.println(
                        "Ungültige Eingabe! Bitte versuchen Sie es erneut!"
                );
            }
        }
    }

    public void bestellUebersicht() {

        System.out.println(
                "\n------ BESTELLÜBERSICHT ------"
        );

        System.out.println(
                "Kaffee: " + getKaffee()
        );

        System.out.println(
                "Größe: " + getGroesse()
        );

        System.out.println(
                "Milch: " + getMilchText()
        );

        if (isZucker()) {

            System.out.println(
                    "Zucker: " + getZuckerText() +
                            " (" + getZuckerAnzahl() + " Stück)"
            );

        } else {

            System.out.println(
                    "Zucker: " + getZuckerText()
            );
        }

        System.out.println(
                "--------------------------"
        );

        System.out.println(
                getKaffee() +
                        " in Größe " + getGroesse() +
                        " ist fertig. Guten Appetit!"
        );
    }

    public void runner() {

        kaffeeAuswahl();
        milchAuswahl();
        zuckerAuswahl();
        groessenAuswahl();
        bestellUebersicht();

    }



    public String getKaffee() {
        return kaffee;
    }

    public void setKaffee(String kaffee) {
        this.kaffee = kaffee;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public boolean isZucker() {
        return zucker;
    }

    public void setZucker(boolean zucker) {
        this.zucker = zucker;
    }

    public int getZuckerAnzahl() {
        return zuckerAnzahl;
    }

    public void setZuckerAnzahl(int zuckerAnzahl) {
        this.zuckerAnzahl = zuckerAnzahl;
    }

    public void setMilch(boolean milch) {
        this.milch = milch;
    }

    public String getMilchText() {
        return milchText;
    }

    public void setMilchText(String milchText) {
        this.milchText = milchText;
    }

    public String getZuckerText() {
        return zuckerText;
    }

    public void setZuckerText(String zuckerText) {
        this.zuckerText = zuckerText;
    }
}
