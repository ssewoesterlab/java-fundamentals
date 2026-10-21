# Aufgabe 03 – Dreiecke prüfen und klassifizieren

**Schwerpunkt:** Vergleiche, logische Operatoren, Methoden.

## Ziel
Prüfe anhand von drei Seitenlängen, ob ein gültiges Dreieck vorliegt, und bestimme anschließend dessen Typ.

## Anforderungen
1. Lies die Seiten `a`, `b` und `c`.
2. Ein Dreieck ist gültig, wenn **alle** Seiten positiv sind und `a + b > c`, `a + c > b`, `b + c > a` gelten.
3. Bestimme den Typ **nur**, wenn das Dreieck gültig ist:
   - **Gleichseitig:** alle drei Seiten gleich.
   - **Gleichschenklig:** genau zwei Seiten gleich.
   - **Ungleichseitig:** alle Seiten verschieden.
4. Zeige das Ergebnis oder eine verständliche Fehlermeldung an.

## Beispiele
| Eingabe | Ausgabe |
|---|---|
| `3, 3, 3` | Gültiges gleichseitiges Dreieck |
| `5, 5, 8` | Gültiges gleichschenkliges Dreieck |
| `3, 4, 5` | Gültiges ungleichseitiges Dreieck |
| `1, 2, 3` | Kein gültiges Dreieck |
| `0, 4, 4` | Kein gültiges Dreieck |

## Prüffälle
- Eine Seite ist null oder negativ.
- Die Summe zweier Seiten ist **genau** gleich der dritten: ungültig.
- Verschiedene Reihenfolgen derselben drei Zahlen ergeben dasselbe Ergebnis.
