# Aufgabe 05 – Aggregatzustand von Wasser bestimmen

**Schwerpunkt:** `if`/`else if`, Grenzwerte, `double`.

## Ziel
Bestimme anhand einer Temperatur den Aggregatzustand von reinem Wasser in einem vereinfachten Modell **bei Normaldruck**.

## Anforderungen
1. Lies eine Temperatur in Grad Celsius (`double`) ein.
2. Verwende folgende Regeln:
   - `T < 0 °C`: fest (Eis)
   - `T == 0 °C`: Phasenübergang / Gefrier- und Schmelzpunkt
   - `0 °C < T < 100 °C`: flüssig
   - `T == 100 °C`: Phasenübergang / Siedepunkt
   - `T > 100 °C`: gasförmig (Wasserdampf)
3. Gib für jeden Fall eine deutsche Nachricht aus.

**Fachliche Einschränkung:** Die Phasenübergänge hängen vom Druck ab; exakt an den Übergangstemperaturen können Phasen nebeneinander vorliegen. Das Programm verwendet bewusst eine schulische Vereinfachung.

## Beispiele
`-5` → `Wasser ist fest.`  
`0` → `Wasser befindet sich am Schmelz-/Gefrierpunkt.`  
`25` → `Wasser ist flüssig.`  
`100` → `Wasser befindet sich am Siedepunkt.`  
`105` → `Wasser ist gasförmig.`

## Prüffälle
Teste `-0.1`, `0`, `0.1`, `99.9`, `100`, `100.1` und ungültige Texteingaben.

## Freiwillige Erweiterung
Extrahiere eine Methode `String getWaterState(double temperature)` und teste alle Grenzen.
