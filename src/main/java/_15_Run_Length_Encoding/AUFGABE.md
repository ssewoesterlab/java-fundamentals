# Aufgabe 15 – Textkompression mit Run-Length-Encoding

**Schwerpunkt:** Strings, Schleifen, Zähler.

## Ziel
Implementiere eine vereinfachte **Lauflängencodierung (Run-Length-Encoding, RLE)**. Aufeinanderfolgende identische Zeichen werden durch ihre Anzahl und das Zeichen ersetzt.

## Anforderungen
1. Schreibe `String compressText(String input)`.
2. Für jede unmittelbar zusammenhängende Zeichengruppe füge `Anzahl` + `Zeichen` an.
3. Auch ein **einzelnes Zeichen** erhält die Anzahl `1`.
4. Gib für einen leeren Eingabestring einen leeren Ergebnisstring zurück.
5. Damit das Format eindeutig bleibt, verarbeitet das **Grundmodell nur Buchstaben `A–Z` und `a–z`**. Ziffern, Satzzeichen und Leerzeichen werden für diese Basisaufgabe abgelehnt.
6. Berücksichtige Groß- und Kleinbuchstaben als unterschiedliche Zeichen (`A` ≠ `a`).

## Beispiele
| Eingabe | Ergebnis |
|---|---|
| `aaaabbbcccccdd` | `4a3b5c2d` |
| `abbbbbbbccc` | `1a7b3c` |
| `aaaaaaaaaa` | `10a` |
| `aabbbccccccddd` | `2a3b6c3d` |
| `abc` | `1a1b1c` |
| leerer Text | leerer Text |

**Wichtig:** RLE verkleinert nicht alle Texte. `abc` wird in diesem Format sogar länger.

## Prüffälle
Ein Zeichen; zwei Gruppen desselben Zeichens, die durch andere Zeichen getrennt sind; lange Folge mit mehr als neun Zeichen; unerlaubte Ziffern; Groß-/Kleinschreibung.

