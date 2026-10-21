# Aufgabe 04 – Monatliche Stromrechnung berechnen

**Schwerpunkt:** Ganzzahlen, Tarifauswahl, Rechenoperationen, Formatierung.

## Ziel
Ein Energieversorger verwendet in diesem **fiktiven Übungstarif** einen einheitlichen kWh-Preis, dessen Höhe sich nach dem gesamten Monatsverbrauch richtet.

## Anforderungen
1. Lies den vorherigen und aktuellen Zählerstand in **kWh** als ganze, nichtnegative Zahlen ein.
2. Prüfe: Der aktuelle Zählerstand darf nicht kleiner sein als der vorherige.
3. Berechne `verbrauch = aktuellerStand - vorherigerStand`.
4. Ermittle für den **gesamten Verbrauch** einen einheitlichen Arbeitspreis anhand der Tabelle.
5. Berechne `rechnung = verbrauch * arbeitspreis` und zeige den Betrag mit zwei Nachkommastellen an.

| Verbrauch (kWh) | Preis pro kWh (fiktive Geldeinheiten) |
|---:|---:|
| 0–100 | 1,10 |
| 101–200 | 1,30 |
| 201–300 | 1,50 |
| 301–400 | 1,70 |
| 401–500 | 1,90 |
| ab 501 | 2,30 |

**Wichtig:** Dies ist **kein Stufentarif**: Bei 150 kWh wird `150 × 1,30` gerechnet, nicht `100 × 1,10 + 50 × 1,30`. Steuern und Grundgebühren sind nicht Bestandteil der Aufgabe.

## Beispiel
**Vorher:** `1250`  
**Aktuell:** `1400`  
**Verbrauch:** `150 kWh`  
**Rechnung:** `195,00 GE`

## Prüffälle
- Verbrauch `0`, `100`, `101`, `500`, `501`.
- Aktueller Stand kleiner als alter Stand → Eingabefehler.

