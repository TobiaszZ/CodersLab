<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Tablice

> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach.

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**

#### Zadanie 1 - rozwiązywane z wykładowcą

Zajrzyj do pliku `zadanie01.js` znajduje się tam tam napisany szkielet funkcji przyjmującej tablicę.

1. Dopisz ciało funkcji w taki sposób, żeby zwracać ```true``` (wartość booleanowską), kiedy tablica ma liczby rosnące (każda następna jest większa od poprzedniej), a ```false``` &ndash; jeżeli nie.
2. Pamiętaj, żeby użyć słowa kluczowego ```return``` do zwracania danych z funkcji.

#### Zadanie 2 - rozwiązywane z wykładowcą

1. W pliku `zadanie02.js` napisz dwie funkcje ```add(array)``` i ```multiply(array)```
2. Obie mają przyjmować tylko jeden argument - tablicę.
3. Funkcja ```add``` ma zsumować wszystkie liczby znajdujące się w tej tablicy (przy pomocy pętli `for`)
4. Funkcja ```multiply``` ma pomnożyć wszystkie liczby znajdujące się w tablicy (przy pomocy pętli `for`).

#### Zadanie 3 - rozwiązywane z wykładowcą

1. W pliku `zadanie03.js` napisz funkcję ```distFromAvarage```, która ma przyjmować jako argument tablicę z liczbami.
2. Zwracana przez funkcję tablica ma przedstawiać w każdej komórce różnicę między liczbą z danej komórki a średnią wartością tablicy.  
   Dla uproszczenia możesz użyć funkcji z poprzedniego zadania.  
   
Np.
```JavaScript
distFromAvarage([1,2,3,4,5,6,7]);// => [3,2,1,0,1,2,3] (średnia z tablicy wejściowej to 4)
distFromAvarage([1,1,1,1]);// => [0,0,0,0] (średnia z tablicy wejściowej to 1)
distFromAvarage([2,8,3,7]);// => [3,3,2,2] (średnia z tablicy wejściowej to 5)
```

-------------------------------------------------------------------------------

#### Zadanie 4

W pliku `zadanie04.js` stwórz tablicę z listą swoich ulubionych owoców.  
Następnie:
1. Wypisz pierwszy owoc w konsoli.
2. Wypisz ostatni owoc w konsoli (skorzystaj z atrybutu ```length```).
3. W pętli wypisz wszystkie owoce (skorzystaj z atrybutu ```length```).

#### Zadanie 5

1. W pliku `zadanie05.js` stwórz funkcję ```printTable(array)```, która przyjmuje tylko jeden parametr - tablicę.
2. Przy pomocy pętli `for` przeiteruj (przejdź) po każdym elemencie i wypisz każdy z nich w konsoli.

#### Zadanie 6

1. W pliku `zadanie06.js` stwórz funkcję ```factors```, która ma przyjmować tylko jeden argument - liczbę, która musi być większa od `0`.
2. Funkcja ta ma zwracać tablicę zawierającą wszystkie dzielniki podanej liczby (w kolejności malejącej).
3. Jeżeli liczba jest mniejsza lub równa `0`, to funkcja ma zwracać pustą tablicę.

```JavaScript
factors(2);// => [2, 1]
factors(54);// => [54, 27, 18, 9, 6, 3, 2, 1]
factors(-4);// => []
```

#### Zadanie 7

1. W pliku `zadanie07.js` stwórz funkcję ```getMissingElement```, która ma przyjmować tylko jeden argument - tablicę zawierającą rosnące liczby całkowite.
2. Funkcja ta ma zwracać brakującą liczbę (czyli miejsca, w którym tablica skacze o dwa zamiast o jeden).
3. Jeżeli w tablicy nie ma brakujących liczb, to funkcja ma zwracać ```null```.
```JavaScript
getMissingElement([1,2,3,4,5,6,7]);// => null
getMissingElement([6,7,8,10,11,12,13,14,15]);// => 9
getMissingElement([-4,-3,-2,0,1,2,3,4]);// => -1
```


#### Zadanie 8 - dodatkowe

1. W pliku `zadanie08.js` stwórz tablicę zawierającą w w każdej komórce rok urodzenia.
2. Następnie napisz funkcję, która przyjmie tę tablicę jako argument i wyświetli:
   * rok urodzenia najstarszej osoby i jej wiek,
   * rok urodzenia najmłodszej osoby i jej wiek.
   Użyj pętli do iteracji tablicy, ale postaraj się pobierać elementy metodą ```pop``` lub ```shift```.
