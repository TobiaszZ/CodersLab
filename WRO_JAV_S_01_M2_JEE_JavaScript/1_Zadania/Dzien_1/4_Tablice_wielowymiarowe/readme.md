<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Tablice wielowymiarowe

> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach.

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**

#### Zadanie 1 - rozwiązywane z wykładowcą

1. W pliku `app.js` stwórz funkcję ```checkArray``` przyjmującą jako argument tablicę dwuwymiarową z liczbami całkowitymi.
2. Funkcja ma zwrócić nową tablicę, w której kolejnymi elementami będą wartości boolean ```true``` lub ```false```, zależne od tego, czy każdy element tablicy drugiego wymiaru jest parzysty.

```JavaScript
var arr = [
    [11, 12],
    [42, 2],
    [-4, -120],
    [0, 0],
    [1, 34],
];

//output

var arrayCheck = [
    false, // bo 11
    true,
    true,
    true,
    false, // bo 1
];
//---------------
//-> input
var arr = [];
arr[0] = [3, 4, 56, 773, 1];
arr[1] = [7, 12, 0, 98, 34, 381];
arr[2] = [12, 66, 96, 54, 10];

//output ->
arrayCheck[0];//ma mieć wartość false
arrayCheck[1];//ma mieć wartość false
arrayCheck[2];//ma mieć wartość true
```
-------------------------------------------------------------------------------

#### Zadanie 2

1. W pliku `app.js` stwórz funkcję ```print2DArray```, która jako argument przyjmuje tablicę dwuwymiarową.
2. Następnie funkcja ta ma wypisać w konsoli zawartość tej tablicy.

#### Zadanie 3

1. W pliku `app.js` stwórz ręcznie dwuwymiarową tablicę i przetestuj ją na rozwiązaniu zadania 2.

#### Zadanie 4

1. W pliku `app.js` stwórz funkcję ```create2DArray``` przyjmującą dwie liczby całkowite (```rows``` i ```columns```).
2. Zadaniem funkcji jest zwrócenie tablicy dwuwymiarowej o podanej liczbie rzędów i kolumn.
3. Każda komórka ma być wypełniona kolejną liczbą całkowitą.
4. Następnie użyj rozwiązania z zadania 2 do wypisania tej tablicy w konsoli.  

Hint: Użyj pętli zagnieżdżonych.
