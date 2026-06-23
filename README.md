# 📈 Logarithmusdarstellung - Schleifen und Mathematik

> **Titel:** Logarithmusdarstellung
> **Zweck:** Verständnis von Schleifen und mathematischen Funktionen in Java vertiefen

---

## 📋 Projektinformationen

| Feld | Inhalt |
|------|-------|
| **Projektname** | Logarithmusdarstellung |
| **Typ** | Schulprojekt |
| **Klasse** | 1aAPC |
| **Schuljahr** | 2025/26 |
| **Abgabedatum** | 02.06.2026 |
| **Autor** | Rößmann Eva |
| **Lehrer** | G. Jarz |
| **Fach** | Applikationsentwicklung |

---

## 🎯 Projektbeschreibung

Dieses Projekt demonstriert die Verwendung von **for-Schleifen**, mathematischen Funktionen und Konsolenausgaben in Java.

Für die Zahlen von 80 bis 1 wird der dekadische Logarithmus berechnet. Das Ergebnis wird mit Sternen (`*`) visualisiert. Je größer der Logarithmuswert ist, desto mehr Sterne werden ausgegeben.

Dadurch entsteht eine einfache textbasierte Darstellung mathematischer Werte.

---

## 🛠️ Entwicklungsumgebung

### Verwendete Software & Tools

| Tool / Software | Version | Zweck |
|---|---|---|
| **IntelliJ IDEA** | 2025.3.4.1 | Code-Editor & IDE |
| **Java SDK** | 21+ | Programmiersprache |
| **Terminal/Console** | - | Programmausführung |

### 💻 Betriebssystem

- ✅ Windows 11
- ✅ macOS
- ✅ Linux

---

### 📊 Beispiel-Ausführung

```
80 *******************
79 *******************
78 *******************
77 *******************
76 *******************
75 *******************
74 *******************
73 *******************
72 *******************
71 *******************
```

### 📊 Weiteres Beispiel

```
10 **********
9 *********
8 *********
7 ********
6 *******
5 ******
4 ******
3 ****
2 ***
1
```

---

### 🔍 Detaillierte Code-Analyse

| Code-Element | Erklärung |
|---|---|
| `for (int i = 80; i >= 1; i--)` | Schleife zählt von 80 bis 1 rückwärts |
| `Math.log10(i)` | Berechnet den dekadischen Logarithmus |
| `double log` | Speichert den Logarithmuswert |
| `(int)(log * 10)` | Umwandlung des Wertes in eine Sternanzahl |
| `int sterne` | Speichert die Anzahl der Sterne |
| `System.out.print(i + " ");` | Gibt die aktuelle Zahl aus |
| `for (int j = 0; j < sterne; j++)` | Schleife für die Sternausgabe |
| `System.out.print("*");` | Gibt einen Stern aus |
| `System.out.println();` | Zeilenumbruch nach jeder Ausgabe |

---

## 📚 Verwendete Java-Konzepte

- for-Schleifen
- Verschachtelte Schleifen
- Mathematische Funktionen
- Datentypen (`int`, `double`)
- Typumwandlung (Casting)
- Konsolenausgabe

---

## 📜 Lizenz

Dieses Projekt wurde im Rahmen des Schulunterrichts erstellt.

```
Copyright © 2026 Rößmann Eva
Schulprojekt - rdata GmbH
Nicht für kommerzielle Nutzung vorgesehen
```

---
