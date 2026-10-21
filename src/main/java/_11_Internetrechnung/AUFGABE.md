# Aufgabe 11 – Internetrechnungen für mehrere Kunden

**Schwerpunkt:** Methoden, Schleifen, `switch`, Summenbildung, Eingaben.

## Ziel
Berechne die monatliche Rechnung mehrerer Internetkunden. Grundlage sind eine monatliche Grundgebühr und Zusatzkosten für über das Paket hinaus genutzte Gigabyte.

## Fiktive Zusatzpreise
| Kundengruppe | Preis pro zusätzlichem GB |
|---:|---:|
| 1 | 0,10 GE |
| 2 | 0,20 GE |
| 3 | 0,30 GE |

`GE` bedeutet **fiktive Geldeinheiten**; die Quelle nennt keine Währung. Es handelt sich nicht um reale Anbieterpreise.

## Anforderungen
1. Erfrage für jeden Kunden eine **nichtnegative** Grundgebühr, eine Kategorie (`1`, `2` oder `3`) und eine **nichtnegative** ganze Zahl zusätzlicher GB.
2. Weise der Kategorie den richtigen Zusatzpreis zu.
3. Berechne `zusatzkosten = zusaetzlicheGB * preisProGB` und `monatsbetrag = grundgebuehr + zusatzkosten`.
4. Lagere die Berechnung in `calculateInvoice(...)` aus.
5. Zeige die Rechnung dieses Kunden an.
6. Frage `Weiteren Kunden berechnen? (ja/nein)` und wiederhole bei `ja`.
7. Führe eine **Gesamtsumme aller bearbeiteten Monatsrechnungen** und eine Kundenanzahl. Gib beides beim Beenden aus.

## Beispiel
Kunde 1: Grundgebühr `30,00`, Kategorie `2`, Mehrverbrauch `15 GB` → `33,00 GE`.  
Kunde 2: Grundgebühr `25,00`, Kategorie `1`, Mehrverbrauch `0 GB` → `25,00 GE`.  
**Gesamtsumme:** `58,00 GE` für `2` Kunden.

## Prüffälle
Unbekannte Kategorie; negative Mehrnutzung; Nulltarif; mehrere Kunden; `ja`/`nein` unabhängig von Groß-/Kleinschreibung.

