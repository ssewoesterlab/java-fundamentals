# Aufgabe 07 – Jahreszeit anhand eines Datums bestimmen

**Schwerpunkt:** Verknüpfte Bedingungen, Datumskontrolle, Grenzfälle.

## Ziel
Bestimme anhand von Monat und Tag die Jahreszeit auf der Nordhalbkugel. Für die Übung verwenden wir **feste, vereinfachte Stichtage**; astronomische Jahreszeiten beginnen real nicht jedes Jahr am exakt gleichen Kalendertag.

## Festgelegte Übungsintervalle
| Jahreszeit | Beginn (einschließlich) | Ende (einschließlich) |
|---|---|---|
| Frühling | 20. März | 20. Juni |
| Sommer | 21. Juni | 21. September |
| Herbst | 22. September | 20. Dezember |
| Winter | 21. Dezember | 19. März |

Der Winter erstreckt sich über den Jahreswechsel.

## Anforderungen
1. Lies Monat (`1` bis `12`) und Tag ein.
2. Prüfe, ob das Datum existiert: 30/31-Tage-Monate korrekt behandeln. Weil kein Jahr erfragt wird, nimmt diese Grundaufgabe **ein Nicht-Schaltjahr** an (Februar: höchstens 28 Tage).
3. Gib bei gültigem Datum genau eine Jahreszeit aus.
4. Wiederhole die Eingabe oder zeige bei ungültigem Datum eine Fehlermeldung.

## Prüffälle
- `19.03` Winter; `20.03` Frühling.
- `20.06` Frühling; `21.06` Sommer.
- `21.09` Sommer; `22.09` Herbst.
- `20.12` Herbst; `21.12` Winter.
- `31.04`, `29.02`, `0.01` → ungültig im Grundmodell.

## Freiwillige Erweiterung
Frage zusätzlich ein Jahr ab und verwende `LocalDate.of(year, month, day)` zur Prüfung, auch für Schaltjahre.
