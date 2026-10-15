# Aufgabe 01 – Erdbeben nach Magnitude einordnen

**Schwerpunkt:** `Scanner`, `double`, Verzweigungen, Vergleichsoperatoren.

## Ziel
Entwickle ein Konsolenprogramm, das eine vom Benutzer eingegebene Erdbebenmagnitüde einer vereinfachten Kategorie zuordnet. Die Magnitude beschreibt die Stärke eines Erdbebens; sie ist **nicht** mit der an einem Ort empfundenen Intensität gleichzusetzen. Die folgende Tabelle dient als Übungsmodell, nicht als amtliche Schadensprognose.

## Anforderungen
1. Lies eine Zahl vom Typ `double` ein (z. B. `5.5` oder bei deutscher Eingabe `5,5`; lege ein einheitliches Eingabeformat fest).
2. Ermittle die Kategorie über eine zusammenhängende `if`-/`else if`-Kette.
3. Gib die Magnitude und die passende Bezeichnung aus.
4. Behandle nichtnumerische Eingaben verständlich. Nicht endliche Werte (`NaN`, `Infinity`) sind ungültig.

| Magnitude M | Kategorie im Übungsmodell |
|---|---|
| M < 2,0 | Mikroerdbeben |
| 2,0 ≤ M < 3,0 | Sehr kleines Erdbeben |
| 3,0 ≤ M < 4,0 | Kleines Erdbeben |
| 4,0 ≤ M < 5,0 | Leichtes Erdbeben |
| 5,0 ≤ M < 6,0 | Moderates Erdbeben |
| 6,0 ≤ M < 7,0 | Starkes Erdbeben |
| 7,0 ≤ M < 8,0 | Großes Erdbeben |
| M ≥ 8,0 | Sehr großes Erdbeben |

## Beispiel
**Eingabe:** `5.5`  
**Ausgabe:** `Magnitude 5,5: Moderates Erdbeben.`

## Prüffälle
- Die Grenzwerte `2`, `3`, `5`, `8` gehören jeweils zur **neuen** Kategorie.
- `1.9` → Mikroerdbeben; `8.3` → sehr großes Erdbeben.
- Auch negative Magnituden sind in bestimmten Magnitudenskalen prinzipiell möglich; lehne sie daher nicht allein wegen des Vorzeichens ab.
- Bei Text statt Zahl folgt eine Fehlermeldung.


