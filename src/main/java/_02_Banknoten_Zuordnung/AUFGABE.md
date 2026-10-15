# Aufgabe 02 – Banknoten und ihre Motive zuordnen

**Schwerpunkt:** `switch`, `Map`, Eingabevalidierung, Datenzuordnung.

## Ziel
Ein Benutzer wählt die Region **USA**, **Euroraum** oder **Türkei** und anschließend den Nennwert einer Banknote. Das Programm zeigt die auf der Banknote dargestellte Person bzw. beim Euro den **Architekturstil** an.

## Anforderungen
1. Frage die Region (`USA`, `EUR`, `TR`) ab, unabhängig von Groß-/Kleinschreibung.
2. Frage den Nennwert als ganze Zahl ab.
3. Suche den Eintrag in den untenstehenden Tabellen und zeige die Zuordnung an.
4. Behandle unbekannte Regionen und nicht unterstützte Nennwerte ohne Absturz.
5. Schreibe den Zuordnungscode nachvollziehbar, z. B. mithilfe verschachtelter `switch`-Blöcke oder Maps. Unnötige Kommentare in jeder Zeile sind nicht erforderlich.

### US-Dollar – Person auf der Vorderseite
| USD | Person |
|---:|---|
| 1 | George Washington |
| 2 | Thomas Jefferson |
| 5 | Abraham Lincoln |
| 10 | Alexander Hamilton |
| 20 | Andrew Jackson |
| 50 | Ulysses S. Grant |
| 100 | Benjamin Franklin |

### Euro – Architekturstil (Europa-Serie)
| EUR | Stil |
|---:|---|
| 5 | Klassik |
| 10 | Romanik |
| 20 | Gotik |
| 50 | Renaissance |
| 100 | Barock und Rokoko |
| 200 | Eisen- und Glasarchitektur des 19. Jahrhunderts |

**Sachlicher Hinweis:** Die Euro-Banknoten zeigen keine identifizierbaren realen Brücken oder Monumente. Die frühere **500-Euro-Banknote** gehört nur zur ersten Serie, trägt Motive moderner Architektur des 20. Jahrhunderts, wird nicht mehr ausgegeben und bleibt gesetzliches Zahlungsmittel. Für diese Aufgabe wird ausschließlich die Europa-Serie mit 5 bis 200 Euro verwendet.

### Türkische Lira – Vorder- und Rückseite
| TRY | Person(en) |
|---:|---|
| 5 | Mustafa Kemal Atatürk / Aydın Sayılı |
| 10 | Mustafa Kemal Atatürk / Cahit Arf |
| 20 | Mustafa Kemal Atatürk / Mimar Kemaleddin |
| 50 | Mustafa Kemal Atatürk / Fatma Aliye Topuz |
| 100 | Mustafa Kemal Atatürk / Buhurizade Mustafa Itrî |
| 200 | Mustafa Kemal Atatürk / Yunus Emre |

## Beispiel
**Eingabe:** `EUR`, `20`  
**Ausgabe:** `20 EUR – Architekturstil: Gotik.`

## Prüffälle
- `USA`, `2` → Thomas Jefferson.
- `EUR`, `500` → als **nicht Teil der verwendeten Europa-Serie** ablehnen.
- `TR`, `100` → Atatürk und Itrî.
- `USA`, `3` oder unbekannte Region → verständliche Meldung.



**Quelle für Euro-Motive:** [Europäische Zentralbank – Gestaltungselemente](https://www.ecb.europa.eu/euro/banknotes/current/design/html/index.de.html); [EZB – 500-Euro-Banknote](https://www.ecb.europa.eu/press/pr/date/2016/html/pr160504.en.html).
