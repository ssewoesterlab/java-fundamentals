# Aufgabe 12 – Palindrome erkennen

**Schwerpunkt:** `String`, Methoden, Schleifen, Textnormalisierung.

## Ziel
Prüfe, ob ein eingegebener Text vorwärts und rückwärts gleich gelesen wird.

## Festgelegte Vergleichsregel
Damit Beispiele mit Großbuchstaben und Leerzeichen eindeutig sind, wird vor dem Vergleich:
1. die Groß-/Kleinschreibung ignoriert;
2. Leerraum und Satzzeichen ignoriert;
3. die Reihenfolge der verbleibenden Buchstaben und Ziffern **beibehalten**.


## Anforderungen
1. Lies einen ganzen Text mit `Scanner.nextLine()` ein.
2. Entwickle `boolean isPalindrome(String text)`.
3. Bereinige den Text gemäß den festgelegten Vergleichsregeln.
4. Vergleiche von vorn und hinten oder arbeite mit einem umgekehrten String.
5. Gib das Ergebnis in einem verständlichen deutschen Satz aus.

## Beispiele
| Eingabe | Ergebnis |
|---|---|
| `Kayak` | Palindrom |
| `Anna` | Palindrom |
| `Eine Horde bedrohe nie` | Palindrom |
| `Oreo` | Kein Palindrom |
| `Müdür müdür müdür?` | Kein Palindrom |

