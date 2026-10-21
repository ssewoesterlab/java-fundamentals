# Aufgabe 10 – Stärke eines Passworts prüfen

**Schwerpunkt:** Methoden mit Rückgabewert `boolean`, Zeichentests, Validierung.

## Ziel
Erstelle die Methode `isStrongPassword(String password)`. Sie soll **genau die nachfolgende Übungsregel** überprüfen. Diese Regel ist keine vollständige Bewertung realer Passwortsicherheit.

## Anforderungen
Ein Passwort ist nach der Aufgabenregel gültig, wenn es:
1. mindestens `8` Zeichen lang ist;
2. mindestens einen Großbuchstaben enthält;
3. mindestens einen Kleinbuchstaben enthält;
4. mindestens eine Ziffer enthält;
5. mindestens ein Zeichen aus dieser **expliziten** Sonderzeichenliste enthält:

```text
! @ # $ % ^ & * ( ) _ + - = { } [ ] ; : ' , < . > / ?
```

Die Leerzeichen in der Darstellung trennen nur die Zeichen: **Leerzeichen selbst sind nicht erlaubt**. Für das Grundmodell sind ausschließlich Buchstaben, Ziffern und Zeichen aus der Liste erlaubt. `null` und leere Eingaben liefern `false`.

## Ablauf
- Lies einen Passwort-String ein.
- Prüfe die fünf Bedingungen und die erlaubten Zeichen.
- Gib `true`/`false` als Ergebnis zurück und zeige eine verständliche Nachricht.

## Prüffälle
| Passwort | Ergebnis | Begründung |
|---|---|---|
| `Abcdef1!` | `true` | Alle Bedingungen erfüllt |
| `abcdef1!` | `false` | Kein Großbuchstabe |
| `ABCDEFG1!` | `false` | Kein Kleinbuchstabe |
| `Abcdefgh!` | `false` | Keine Ziffer |
| `Abcdef12` | `false` | Kein Sonderzeichen |
| `Ab1!` | `false` | Zu kurz |
| `Abcde 1!` | `false` | Enthält Leerzeichen |

## Freiwillige Erweiterung
Gib zusätzlich konkrete Hinweise, welche Bedingung fehlt. Implementiere die Prüfung zuerst **ohne Regex** und optional anschließend mit einem regulären Ausdruck.
