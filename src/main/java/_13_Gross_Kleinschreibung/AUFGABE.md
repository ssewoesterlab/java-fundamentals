# Aufgabe 13 – Text in Groß- und Kleinbuchstaben umwandeln

**Schwerpunkt:** Methoden, `String`, `Locale`, Ein-/Ausgabe.

## Ziel
Ein Benutzer gibt einen Satz ein. Das Programm gibt denselben Satz einmal in Groß- und einmal in Kleinbuchstaben zurück.

## Anforderungen
1. Lies die komplette Eingabezeile ein.
2. Implementiere zwei Methoden:
   - `String toUpperCaseGerman(String text)`
   - `String toLowerCaseGerman(String text)`
3. Verwende `toUpperCase(Locale.GERMAN)` und `toLowerCase(Locale.GERMAN)`, damit die Umwandlung unabhängig von der Standardsprache des Betriebssystems ist.
4. Behalte Zahlen, Leerzeichen und Satzzeichen bei.
5. Zeige Originaltext und beide Varianten an.

## Beispiel
**Eingabe:** `Grüße aus Köln!`  
**Groß:** `GRÜSSE AUS KÖLN!`  
**Klein:** `grüße aus köln!`

## Prüffälle
Leerer Text; gemischte Groß-/Kleinschreibung; Umlaute; `ß`, das bei der Umwandlung in Großbuchstaben zu `SS` werden kann; Ziffern.

## Freiwillige Erweiterung
Biete eine Menüauswahl `1 – Groß`, `2 – Klein`, `3 – Beides` und automatisierte Methodentests an.
