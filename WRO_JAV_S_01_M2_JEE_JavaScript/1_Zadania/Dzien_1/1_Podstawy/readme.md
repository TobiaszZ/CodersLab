<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Podstawy

> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach.

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**

#### Zadanie 1 - rozwiązywane z wykładowcą

Zajrzyj do pliku `zadanie01.js`.  
Znajdziesz tam kod funkcji, która losuje liczbę z przedziału `1-100`.  
Dopisz kod, który wyświetli następujące informacje w konsoli:
 1. Czy liczba jest parzysta czy nieparzysta.
 2. Wszystkie dzielniki liczby, np. dla `10` wyświetli `5`, `2`, `1` (liczby mają wyświetlić się w jednej linii).
 3. Wyświetli wynik potęgowania liczby, wykładnikiem potęgi ma być reszta z dzielenia tej liczby przez `5`.

```
**Przykład dla polecenia 3.**:
Wylosowana liczba: 8
8 % 5 = 3
8^3 = 512
```

Zadanie rozwiąż w tym samym pliku.

#### Zadanie 2 - rozwiązywane z wykładowcą

W pliku `zadanie02.js` znajduje się przykładowa funkcja obliczająca proste równania.  
Jako, iż funkcje przedstawione są w kolejnym dziale, zajmujemy się jedynie jej ciałem.  
Dodatkowo w kodzie znajdziesz komentarze opisujące funkcje.

Niestety nie działa ona dobrze.  
1. Znajdź błędy i je napraw, tak żeby funkcja działała.  
2. Dopisz dodatkowe testy, żeby sprawdzić, czy wszystkie przypadki działają.

Zadanie rozwiąż w tym samym pliku.

-------------------------------------------------------------------------------

#### Zadanie 3

1. W pliku `zadanie03.js` stwórz tyle zmiennych, ile różnych znasz typów.
2. Każdą odpowiednio nazwij i wstaw do nich odpowiednie dane.
3. Następnie dodaj do siebie różne zmienne i zobacz, jakiego typu jest wynik.
4. Napisz w komentarzu przy każdej zmiennej jej typ.
5. Wypisz każdą zmienną w konsoli.  

Zwróć uwagę, jak zmieniają się typy danych w zależności od tego, jakie typy ze sobą dodajemy.  
Jest to tzw. niejawna konwersja danych (silnik JavaScript bez naszego udziału zmienia typ danych).

#### Zadanie 4

Zajrzyj do pliku `zadanie04.js`.  
Jest tam napisany szkielet funkcji przyjmującej trzy liczby.  
1. Dopisz ciało funkcji tak, żeby zwracać ```true``` (wartość logiczną), jeżeli z podanych liczb można stworzyć trójkąt,  
   a ```false``` jeżeli nie.
2. Tę figurę geometryczną można zbudować z trzech linii tylko wtedy, gdy suma długości dwóch z nich jest większa niż długość trzeciej linii, czyli:

   ```JavaScript
   a + b > c
   c + b > a
   a + c > b
   ```

   Użyj ```if```, ```else``` oraz ```else if```.

3. Następnie zmień rozwiązanie tak, aby zawrzeć wszystkie te punkty w jednym zapytaniu ```if``` (użyj operatorów logicznych).
Pamiętaj żeby użyć słowa kluczowego ```return``` do zwracania danych z funkcji.

Zadanie rozwiąż w tym samym pliku.

#### Zadanie 5

Zajrzyj do pliku `zadanie05.js`.  
Znajdziesz tam kod.  
1. Przeanalizuj go i opisz w komentarzu zauważone błędy.
2. Postaraj się nie uruchamiać kodu zanim nie znajdziesz błędów.
