# **1. Repetition av Grundläggande Programmeringskoncept (25 min)**

## **1.1. Introduktion till Objektorienterad Programmering (OOP) - 10 min**

## **Fyra grundläggande principer i OOP:**

Här är en beskrivning av de fyra grundläggande principerna samt bilder som du kan använda för att visualisera dessa
koncept.

1. **Inkapsling (Encapsulation)**

- **Beskrivning:** Inkapsling handlar om att dölja de interna detaljerna i en klass och endast exponera vad som är
  nödvändigt. Det hjälper till att skydda data från otillåten åtkomst och manipulation.
- **Visualisering:** Bilden visar ett objekt (t.ex. en "Bil") med privata variabler (t.ex. hastighet, färg) som endast
  kan ändras genom publika metoder (t.ex. `accelerera()`).

2. **Arv (Inheritance)**

- **Beskrivning:** Arv möjliggör skapandet av en ny klass baserad på en redan existerande klass. Den nya klassen (
  subklassen) ärver egenskaper och beteenden från den gamla klassen (superklassen) men kan också lägga till egna
  egenskaper eller metoder.
- **Visualisering:** Bilden visar en hierarki där en "Bil" är en specifik typ av "Fordon", vilket illustrerar att "Bil"
  ärver egenskaper från "Fordon".

3. **Polymorfism (Polymorphism)**

- **Beskrivning:** Polymorfism gör det möjligt för ett objekt att ta flera former. Det innebär att samma metod kan bete
  sig olika beroende på vilken klass som använder den.
- **Visualisering:** Bilden visar hur en metod som heter `start()` kan fungera på olika sätt beroende på om den anropas
  från en "Bil", en "Cykel" eller en "Båt".

4. **Abstraktion (Abstraction)**

- **Beskrivning:** Abstraktion innebär att man förenklar komplexa system genom att dölja ovidkommande detaljer och
  fokusera på de relevanta delarna. Genom att använda abstrakta klasser och gränssnitt kan man skapa en standardiserad
  uppsättning metoder som kan implementeras på olika sätt av olika klasser.
- **Visualisering:** Bilden visar hur en abstrakt klass "Fordon" kan ha en abstrakt metod `drive()`, som implementeras
  på olika sätt av subklasser som "Bil" och "Cykel".

---

## **1.2. Repetition av Grundläggande Programmeringskoncept - 15 min**

## **1.2.1. Variabler och Datatyper**

- **Vad är en variabel?**
    - En variabel är en lagringsplats för data som kan användas och ändras under programmets gång. Variabler har en
      datatyp som bestämmer vilken typ av data de kan lagra.

- **Exempel på datatyper:**
    - `int`: Heltal (t.ex. 42)
    - `double`: Decimaltal (t.ex. 3.14)
    - `char`: Ett enskilt tecken (t.ex. 'A')
    - `String`: Text (t.ex. "Hej")
    - `boolean`: Sant eller falskt värde (`true` eller `false`)

  ```java
  int age = 25;
  double price = 19.99;
  char grade = 'A';
  String name = "Anna";
  boolean isStudent = true;
  ```

- **Hur man kollar vilken typ något är:**
    - I Java används klassmetoden `.getClass().getName()` eller typen `instanceof` för att kontrollera vilken typ en
      variabel eller ett objekt har.

  ```java
  System.out.println(((Object) age).getClass().getName()); // java.lang.Integer
  System.out.println(name instanceof String); // true
  ```

- **Hur man tar reda på information om variablerna:**
    - Använd metoder som `System.out.println()` för att skriva ut variabelns värde och typ, eller verktyg i IDE:n för
      att inspektera variabler vid debug.

  ```java
  System.out.println("Variabeln name har värdet: " + name + " och är av typen: " + name.getClass().getName());
  ```

## **1.2.2. Operatorer och Uttryck**

- **Aritmetiska operatorer:**
    - `+` (addition): Lägger ihop två tal.
    - `-` (subtraktion): Drar bort ett tal från ett annat.
    - `*` (multiplikation): Multiplicerar två tal.
    - `/` (division): Dividerar ett tal med ett annat.
    - `%` (modulus): Returnerar resten vid division.

  ```java
  int sum = 10 + 5; // 15
  int difference = 10 - 5; // 5
  int product = 10 * 5; // 50
  int quotient = 10 / 2; // 5
  int remainder = 10 % 3; // 1
  ```

- **Jämförelseoperatorer:**
    - `==` (lika med): Kontrollerar om två värden är lika.
    - `!=` (inte lika med): Kontrollerar om två värden inte är lika.
    - `>` (större än): Kontrollerar om ett värde är större än ett annat.
    - `<` (mindre än): Kontrollerar om ett värde är mindre än ett annat.
    - `>=` (större än eller lika med): Kontrollerar om ett värde är större än eller lika med ett annat.
    - `<=` (mindre än eller lika med): Kontrollerar om ett värde är mindre än eller lika med ett annat.

  ```java
  boolean isEqual = (5 == 5); // true
  boolean isNotEqual = (5 != 4); // true
  boolean isGreater = (5 > 3); // true
  boolean isLesser = (3 < 5); // true
  boolean isGreaterOrEqual = (5 >= 5); // true
  boolean isLesserOrEqual = (3 <= 5); // true
  ```

- **Logiska operatorer:**
    - `&&` (AND): Sant om båda uttrycken är sanna.
    - `||` (OR): Sant om minst ett av uttrycken är sant.
    - `!` (NOT): Vänder ett sant uttryck till falskt och vice versa.

  **Sanningstabeller**

**And:**

|   A   |   B   | A and B |
|:-----:|:-----:|:-------:|
| true  | true  |  true   |
| true  | false |  false  |
| false | true  |  false  |
| false | false |  false  |

**Or:**

|   A   |   B   | A or B |
|:-----:|:-----:|:------:|
| true  | true  |  true  |
| true  | false |  true  |
| false | true  |  true  |
| false | false | false  |

**Not:**

|   A   | not A |
|:-----:|:-----:|
| true  | false |
| false | true  |

**Sammanfattning:**

|   A   |   B   | A and B | A or B | not A |  
|:-----:|:-----:|:-------:|:------:|:-----:|  
| true  | true  |  true   |  true  | false |  
| true  | false |  false  |  true  | false |  
| false | true  |  false  |  true  | true  |  
| false | false |  false  | false  | true  |

  ```java
  boolean andResult = (5 > 3) && (8 > 6); // true
  boolean orResult = (5 > 3) || (8 < 6); // true
  boolean notResult = !(5 > 3); // false
  ```

- **Uttryck:**
    - Ett uttryck är en kombination av variabler, operatorer och metodanrop som evalueras till ett enda värde.

  ```java
  int result = (10 + 5) * 2; // 30
  boolean comparison = (10 > 5) && (3 < 5); // true
  ```

---

# Övningsuppgifter:

## **Övningsuppgifter: Grundläggande Programmeringskoncept**

### **1. Variabler och Datatyper**

**Uppgift 1.1:**  
Skapa en klass med en `main`-metod där du deklarerar och initialiserar följande variabler:

- En heltalsvariabel `age` med värdet 30.
- En flyttalsvariabel `height` med värdet 1.75.
- En `char`-variabel `initial` med värdet 'A'.
- En strängvariabel `name` med värdet "Alice".
- En `boolean`-variabel `isStudent` med värdet `true`.

**Uppgift 1.2:**  
Skriv ut alla variabler och deras typer i konsolen. Använd `.getClass().getName()` eller `instanceof` där det är
möjligt.

<details>
  <summary>Lösningsförslag</summary>

  ```java
  System.out.println("Variabeln name har värdet: "+name +" och är av typen: "+((Object) name).getClass().getName());
  ```

</details>

### **2. Operatorer och Uttryck**

**Uppgift 2.1:**  
Skapa ett program som beräknar och skriver ut följande:

- Summan av 10 och 20.
- Skillnaden mellan 100 och 30.
- Produkten av 5 och 7.
- Kvoten när 20 delas med 4.
- Resten när 10 delas med 3.

**Uppgift 2.2:**  
Skapa ett program som jämför två tal, t.ex. `a = 15` och `b = 20`, och skriver ut resultatet av följande jämförelser:

- Är `a` lika med `b`?
- Är `a` större än `b`?
- Är `a` mindre än eller lika med `b`?

**Uppgift 2.3:**  
Skapa ett program som använder logiska operatorer för att utvärdera följande uttryck:

- `x = 10`, `y = 5`, `z = 20`.
- Är `x` större än `y` OCH `z` större än `y`?
- Är `x` större än `y` ELLER `z` mindre än `y`?
- Negera resultatet av `x > y`.

**Uppgift 2.4:**  
Skapa ett program som beräknar och skriver ut resultatet av ett uttryck som använder både aritmetiska och
jämförelseoperatorer, t.ex.:

- `(10 + 5) * 2 > 20` (bör ge `true`)

### **3. Avancerade Uppgifter för Snabbare Studenter**

**Uppgift 3.1:**  
Skriv ett program som beräknar hypotenusan av en rätvinklig triangel med hjälp av Pythagoras sats. Låt användaren mata
in de två kateterna och beräkna hypotenusan. Tips: Använd `Math.sqrt()` för att beräkna kvadratroten.

```java
Math.sqrt(a * a + b * b);
```

<details>
  <summary>Lösningsförslag</summary>

  ```java
  double a = 3.0;
  double b = 4.0;
  double c = Math.sqrt(a * b + b * b);
  System.out.println("Hypotenusan är: "+c);
  ```

</details>

**Uppgift 3.2:**  
Skapa ett program där användaren matar in sin ålder, och programmet bestämmer om de är berättigade att rösta (18 år
eller äldre), och om de är berättigade till pension (65 år eller äldre).

<details>
  <summary>Lösningsförslag</summary>

  ```java
  int age = 20; // Mata in en ålder
  boolean canVote = (age >= 18);
  boolean canRetire = (age >= 65);
  System.out.println("Kan rösta: "+canVote);
  System.out.println("Kan gå i pension: "+canRetire);
  ```
</details>

**Uppgift 3.3:**  
Skriv ett program som beräknar den totala kostnaden för en shoppinglista. Använd variabler för att representera priserna
för olika objekt och summera dessa för att få det totala beloppet.

**Uppgift 3.4:**  
Skapa ett program som använder en kombination av logiska och aritmetiska operatorer för att lösa en enkel ekvation,
t.ex. `x + 2 * y = 10`, och skriver ut om det finns lösningar för givna värden av `x` och `y`.

---

**Extra Utmaning:** Utvidga de mer avancerade uppgifterna eller hitta på egna tillägg till uppgifterna.
