# Aufgabe 14 – Zwei Zahlen-Arrays vereinigen

**Schwerpunkt:** Arrays, Mengen, Sortieren, Eingabeparsing.

## Ziel
Führe zwei Listen ganzer Zahlen zusammen, entferne **alle Duplikate** und gib das Ergebnis **aufsteigend sortiert** aus.

## Anforderungen
1. Frage zwei kommagetrennte Zahlenfolgen ab, etwa `1, 2, 3` und `3, 5, 8`.
2. Wandle jeden Wert in `int` um. Entferne optional Leerzeichen um die Kommas.
3. Berücksichtige Zahlen, die innerhalb desselben Arrays oder in beiden Arrays mehrfach vorkommen, **nur einmal**.
4. Sortiere das Resultat **numerisch aufsteigend**.
5. Gib das Ergebnis lesbar aus, z. B. als `[1, 2, 3]`.
6. Bei ungültigen Eingaben wie `1,zwei,3` soll eine Fehlermeldung erscheinen; das Programm soll nicht kommentarlos abstürzen.

## Beispiel
**Array 1:** `1,2,3,4,5,99,100`  
**Array 2:** `3,5,8,9,85,100`  
**Ergebnis:** `[1, 2, 3, 4, 5, 8, 9, 85, 99, 100]`

## Prüffälle
- `3,3,1` und `1,2` → `[1, 2, 3]`.
- `-2,0` und `0,-5` → `[-5, -2, 0]`.
- Leere Liste: lege fest, dass eine leere Eingabe `[]` bedeutet.
- `1,2,` (leeres letztes Feld) → ungültige Eingabe oder dokumentierte Wiederholung.
