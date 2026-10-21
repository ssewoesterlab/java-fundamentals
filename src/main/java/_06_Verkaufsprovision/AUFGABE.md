# Aufgabe 06 – Gehalt mit Verkaufsprovision berechnen

**Schwerpunkt:** `double`, Berechnungen, Grenzvergleich, Methoden.

## Ziel
Berechne das Gesamtgehalt eines Vertriebsmitarbeiters aus Fixgehalt und leistungsabhängiger Provision. Die Regeln sind **fiktiv** und dienen ausschließlich der Java-Übung.

## Anforderungen
1. Lies Fixgehalt, Verkaufsumsatz und Zielumsatz (Leistungsschwelle) als nichtnegative Beträge ein.
2. Liegt der tatsächliche Verkaufsumsatz **streng über** der Leistungsschwelle, beträgt der Provisionssatz `10 %`.
3. In allen anderen Fällen – **einschließlich Gleichheit** – beträgt der Provisionssatz `5 %`.
4. Berechne `provision = umsatz * provisionssatz`.
5. Berechne `gesamtgehalt = fixgehalt + provision` 

## Beispiele
| Fixgehalt | Umsatz | Schwelle | Provision | Gesamtgehalt |
|---:|---:|---:|---:|---:|
| 2.000 | 10.000 | 8.000 | 1.000 | 3.000 |
| 2.000 | 8.000 | 8.000 | 400 | 2.400 |
| 2.000 | 6.000 | 8.000 | 300 | 2.300 |

## Prüffälle
Teste Umsatz gleich Schwelle, Umsatz null, Schwelle null und negative bzw. nichtnumerische Eingaben.
