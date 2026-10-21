# Aufgabe 09 – Zufällige Passwörter generieren

**Schwerpunkt:** Methoden, `Random`, Schleifen, ASCII-Zeichen.

## Ziel
Schreibe eine parameterlose Methode `generatePassword()`, die ein zufälliges Passwort mit **8 bis 10 Zeichen (jeweils einschließlich)** erstellt.

## Anforderungen
1. Wähle die Länge zufällig aus `8`, `9` oder `10`.
2. Erzeuge jedes Zeichen zufällig aus dem **druckbaren ASCII-Bereich 33 bis 126** (einschließlich). Das Leerzeichen (ASCII 32) ist nicht enthalten.
3. Gib das Passwort als `String` zurück und zeige es im Hauptprogramm an.
4. Verwende vorzugsweise `Random`
5. Falls das Passwort Sonderzeichen wie `'`, `"` oder `\` enthält, müssen diese im generierten **String-Wert** nicht zusätzlich escaped werden; Escaping betrifft nur die Darstellung in Java-Quellcode.

## Beispiel
**Mögliche Ausgabe:** `A7!p_2Zq`  
**Hinweis:** Die Ausgabe ändert sich zufallsbedingt. Dieses Beispiel ist **kein** festes Soll-Ergebnis.

## Prüffälle
- Erzeuge z. B. 1.000 Passwörter. Jedes muss 8–10 Zeichen enthalten.
- Jeder erzeugte `char` muss im Bereich 33–126 liegen.
- Für das Basismodell ist **nicht** garantiert, dass jedes Passwort Großbuchstaben, Zahlen oder Sonderzeichen enthält.

## Freiwillige Erweiterung
Baue eine zweite Methode, die die Bedingungen aus Aufgabe 10 garantiert und dabei `SecureRandom` verwendet.
