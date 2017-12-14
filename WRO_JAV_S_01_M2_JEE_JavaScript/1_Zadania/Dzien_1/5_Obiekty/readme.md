<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Obiekty

> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach.

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**

Zadania rozwiązuj w pliku `app.js`, chyba, że w poleceniu podano inny plik.

#### Zadanie 1 - rozwiązywane z wykładowcą

1. Za pomocą prototypu dodaj metodę ```upperLower``` do wbudowanego w JavaScript obiektu ```String```.
2. Metoda zamieni podany ciąg znaków tak, że każdy znak nieparzysty w wyrazie będzie zamieniony na mała literę, a parzysty na duża.
3. Jeśli w ciągu występuje spacja, **pomiń ją**.

Po rozwiązaniu zadania pomyśl, czy można funkcję zapisać w inny, łatwiejszy sposób.

```JavaScript
//-> input
var funnyText = "Smiesznie".upperLower();

//output ->
sMiEsZnIe

//-> input
var funnyTextWithSpace = "Javascript jest super".upperLower();

//output ->
jAvAsCrIpT jEsT sUpEr
```

#### Zadanie 2 - rozwiązywane z wykładowcą

1. Stwórz obiekt `Car`, utwórz dla niego odpowiednie atrybuty:
   * markę,
   * kolor,
   * liczbę przejechanych kilometrów (na początku `0`).
2. Oraz metody:
   * ```printCarinfo()``` metoda powinna wypisywać informacje o samochodzie (kolor, markę i liczbę przejechanych kilometrów).
   * ```drive(km)```, która dodaje do przejechanych kilometrów podaną wartość.  
     Użyj słowa kluczowego ```this```, żeby odwołać się do obiektu w środku metody.

-------------------------------------------------------------------------------

#### Zadanie 3

1. Do obiektu `Car` z zadania 2 dodaj tablicę z listą dat przeglądów (niech będą to zwykłe napisy).  
   Dodaj ten nowy atrybut poza ciałem obiektu.
2. Dodaj też następujące metody:
   * metodę dodającą wpis do tej tablicy,
   * metodę wyświetlającą wszystkie przeglądy samochodu.  
   Użyj słowa kluczowego ```this```, żeby odwołać się do obiektu w środku metody.

#### Zadanie 4

1. W pliku `zadanie04.js` możesz znaleźć przykładowy konstruktor dla robota.
2. Konstruktor oczekuje, że podasz tylko imię robota.
3. Wszystkie roboty mają od razu kilka metod (metody dodane są przez prototypy).
4. Utwórz kilka robotów i sprawdź, czy w napisanym kodzie nie ma błędów.

#### Zadanie 5

1. Stwórz konstruktor dla obiektów ```Rectangle```, który będzie przyjmować informację na temat długości i szerokości nowo stworzonej figury.
2. Następnie przy pomocy prototypu klasy dodaj do niej następujące metody:
   * ```getArea()``` - metoda ma zwracać pole powierzchni,
   * ```getPerimiter()``` - metoda ma zwracać obwód.

Stwórz kilka obiektów i zobacz, czy metody działają tak jak powinny.

#### Zadanie 6

1. Stwórz konstruktor dla obiektów ```Calculator```.  
   Konstruktor ma nie przyjmować żadnych danych.
2. Każdy nowo stworzony obiekt powinien mieć pustą tablicę, w której będzie trzymać historię wywołanych operacji.
3. Następnie przy pomocy prototypu klasy dodaj do niej następujące metody:
   1. ```add(num1, num2)``` - metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo w tablicy operacji ma zapamiętać napis: "added ```num1``` to ```num2``` got ```result```" (oczywiście z wartościami zmiennych podstawionymi w odpowiednie miejsce).
   2. ```multiply(num1, num2)``` - metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo w tablicy operacji ma zapamiętać napis: "multiplied ```num1``` with ```num2``` got ```result```" (oczywiście z wartościami zmiennych podstawionymi w odpowiednie miejsce).  
   3. ```subtract(num1, num2)``` - metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo w tablicy operacji ma zapamiętać napis: "subtracted ```num1``` from ```num2``` got ```result```" (oczywiście z wartościami zmiennych podstawionymi w odpowiednie miejsce).  
   4. ```divide(num1, num2)``` - metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo w tablicy operacji ma zapamiętać napis: "divided ```num1``` by ```num2``` got ```result```" (oczywiście z wartościami zmiennych podstawionymi w odpowiednie miejsce).  
   5. ```printOperations()``` - metoda ma wypisać wszystkie operacje zapamiętane w pamięci.
   6. ```clearoperations()``` - metoda ma wyczyścić wszystkie operacje z pamięci.

**Pamiętaj o używaniu ```this```**.
