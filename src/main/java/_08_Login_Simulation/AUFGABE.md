# Aufgabe 08 – Registrierung und Anmeldung simulieren

**Schwerpunkt:** Schleifen, `String.equals`, Zustände, Eingabevalidierung.

## Ziel
Implementiere eine einfache **Lernsimulation** mit Registrierung und anschließender Anmeldung. Das ist **kein sicheres Authentifizierungssystem**: Testdaten dürfen nur im Arbeitsspeicher gehalten werden.

## Anforderungen
1. Frage einen nichtleeren Benutzernamen und ein Passwort ab.
2. Frage dasselbe Passwort ein zweites Mal ab. Bei Abweichung wiederhole die Passworteingabe, bis beide übereinstimmen.
3. Starte anschließend die Anmeldung und frage Benutzername **und** Passwort ab.
4. Es gibt **insgesamt drei Login-Versuche**. Jeder Versuch mit falschem Benutzernamen oder Passwort zählt als Fehlversuch.
5. Bei erfolgreicher Anmeldung: Begrüßung mit dem registrierten Benutzernamen; Anmeldungsschleife beenden.
6. Nach dem dritten Fehlversuch: Meldung ausgeben und Programm beenden.
7. Zeige nach Fehleingaben die Anzahl verbleibender Versuche (`2`, `1`, `0`) an, jedoch **nie das Passwort selbst**.

## Beispiel
```text
Registrierung erfolgreich.
Benutzername: max
Passwort: [Eingabe]
Anmeldung fehlgeschlagen. Verbleibende Versuche: 2
Benutzername: max
Passwort: [Eingabe]
Willkommen, max! Anmeldung erfolgreich.
```

## Prüffälle
Passwörter stimmen bei Registrierung zunächst nicht überein; erster Login korrekt; dritter Fehlversuch; falscher Benutzername bei richtigem Passwort; leere Eingaben.

