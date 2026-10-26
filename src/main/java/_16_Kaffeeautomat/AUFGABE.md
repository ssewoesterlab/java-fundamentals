# Aufgabe 16 – Kaffeeautomat ☕

## Erstellen Sie einen einfachen Kaffeeautomaten.

- Das System soll folgende Frage stellen: **„Welchen Kaffee möchten Sie?“**
- Türkischer Kaffee
- Filterkaffee
- Espresso

Erstellen Sie eine String-Variable namens `hangiKahve` und geben Sie eine der verfügbaren Kaffeesorten ein (zum Beispiel `Türk Kahvesi` oder `turk kahvesi`).

Verwenden Sie eine String-Methode, damit bei der Eingabe nicht zwischen Groß- und Kleinschreibung unterschieden wird (**case-insensitive**).

## TODO – Bedingung 1: Kaffeeauswahl

- Erstellen Sie eine String-Variable namens `kahve`.
- Wenn Türkischer Kaffee ausgewählt wurde, geben Sie **„Türkischer Kaffee wird zubereitet...“** aus. Schreiben Sie den Kaffeenamen nicht direkt in die Ausgabe, sondern verwenden Sie die String-Variable `hangiKahve`!
- Wenn Filterkaffee ausgewählt wurde, geben Sie **„Filterkaffee wird zubereitet...“** aus. Verwenden Sie ebenfalls die String-Variable `hangiKahve`!
- Wenn Espresso ausgewählt wurde, geben Sie **„Espresso wird zubereitet...“** aus. Verwenden Sie ebenfalls die String-Variable `hangiKahve`!
- Bei einer ungültigen Eingabe soll folgende Meldung erscheinen: **„Ungültige Eingabe. Bitte versuchen Sie es erneut.“**

**Hinweis:** Wenn eine ungültige Eingabe erfolgt, muss dieselbe Frage erneut gestellt werden.

## TODO – Bedingung 2: Milchauswahl

- Das System soll folgende Frage stellen:

  **„Möchten Sie Milch zu Ihrem Kaffee hinzufügen? (Bitte antworten Sie mit Ja oder Nein):“**

- Die Frage muss einschließlich der Klammern genau so in der Konsole angezeigt werden.
- Erstellen Sie eine String-Variable namens `süt`.
- Wenn die Antwort **„Ja“** lautet, soll folgende Meldung in der Konsole erscheinen: **„Milch wird hinzugefügt...“**
- Verwenden Sie eine String-Methode, damit die Eingabe unabhängig von der Groß- und Kleinschreibung erkannt wird. Mögliche Eingaben sind beispielsweise `Ja`, `JA`, `jA`, `YES`, `YeS` usw.
- Wenn die Antwort **„Nein“** lautet, geben Sie **„Milch wird nicht hinzugefügt.“** aus.

**Hinweis:** Bei einer ungültigen Eingabe muss dieselbe Frage erneut gestellt werden.

## TODO – Bedingung 3: Zuckerauswahl

- Das System soll folgende Frage stellen:

  **„Möchten Sie Zucker? (Bitte antworten Sie mit Ja oder Nein):“**

- Die Frage muss einschließlich der Klammern genau so in der Konsole angezeigt werden.
- Verwenden Sie String-Methoden, um die Eingabe unabhängig von der Groß- und Kleinschreibung zu verarbeiten.
- Erstellen Sie eine String-Variable namens `şeker`.
- Wenn die Antwort **„Ja“** lautet, soll das System folgende Frage stellen:

  **„Wie viele Stück Zucker möchten Sie?: “**

- Erstellen Sie eine Variable vom Typ `int` namens `kacSeker` und lesen Sie die gewünschte Zuckermenge ein.
- Geben Sie anschließend beispielsweise **„5 Stück Zucker werden hinzugefügt.“** aus.
- Wenn die Antwort **„Nein“** lautet, soll das System **„Zucker wird nicht hinzugefügt.“** ausgeben.

**Hinweis:** Bei einer ungültigen Eingabe muss dieselbe Frage erneut gestellt werden.

## TODO – Bedingung 4: Größenwahl

- Das System soll folgende Frage stellen:

  **„Welche Größe möchten Sie? (Bitte Groß - Mittel - Klein eingeben.) : “**

- Bei der Eingabe soll nicht zwischen Groß- und Kleinschreibung unterschieden werden (zum Beispiel `Groß` oder `groß`).
- Erstellen Sie eine String-Variable namens `boyut`.
- Wenn die String-Variable `boyut` dem Wert **„Groß“** entspricht, geben Sie **„Ihr Kaffee in der Größe Groß wird zubereitet.“** aus. Verwenden Sie dafür die String-Variable `boyut`, beispielsweise durch die Verkettung:

  `"Ihr Kaffee wird in der Größe " + boyut + " zubereitet."`

- Wenn der String `size` dem Wert **„Mittel“** entspricht, geben Sie **„Ihr Kaffee in der Größe Mittel wird zubereitet.“** aus. Verwenden Sie dafür ebenfalls die String-Variable `boyut`.
- Wenn der String `size` dem Wert **„Klein“** entspricht, geben Sie **„Ihr Kaffee in der Größe Klein wird zubereitet.“** aus. Verwenden Sie dafür ebenfalls die String-Variable `boyut`.

**Hinweis:** Bei einer ungültigen Eingabe muss dieselbe Frage erneut gestellt werden.

## Ergebnis: Bestellübersicht

- Nachdem alle Angaben zur Bestellung gemacht wurden, soll das Ergebnis angezeigt werden.
- Geben Sie beispielsweise folgende Meldung in der Konsole aus:

  **„Türkischer Kaffee, mittlere Größe, fertig. Guten Appetit!“**

- Verwenden Sie für den Kaffeenamen die String-Variable `hangiKahve` und für die Größe die String-Variable `boyut`.