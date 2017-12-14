<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - Spring - Tworzenie projektu

### Zadania.


#### Zadanie 1 - rozwiązywane z wykładowcą

1. Otwórz IDE **STS** a następnie utwórz w nim projekt Maven o nazwie `Spring02mvc`.
2. Uzupełnij podstawowy zestaw zależności dla korzystania z MVC Springa.
3. Skorzystaj z zależności opisanych w prezentacji.  

#### Zadanie 2 - rozwiązywane z wykładowcą

1. Dodaj klasę konfiguracji.
2. Utwórz inicjalizator aplikacji.
3. Utwórz kontroler o nazwie `HelloController`.
4. Utwórz akcję o nazwie `helloWorld`, oraz przypisz jej adres `hello`.
5. Dodaj adnotację @ResponseBody i zwróć napis **Hello World**.
6. Uruchom aplikację i sprawdź w przeglądarce utworzoną akcję. 

-------------------------------------------------------------------------------

#### Zadanie 3

1. Utwórz kontroler o nazwie `RandomController`.
2. Utwórz akcję kontrolera o nazwie `showRandom`, która wylosuje liczbę z zakresu od 1 do 100. 
3. Wyświetli w przeglądarce napis: **Wylosowano liczbę: <wylosowana liczba>**.


#### Zadanie 4

1. Utwórz widok o nazwie `home.jsp` ze statyczną zawartością html.
2. Utwórz akcję `helloView`, dostępną pod adresem `/helloView` która wyświetli ten widok.


#### Zadanie 5

1. Zdefiniuj z klasie konfiguracji `ViewResolver` - skorzystaj z przykładu z prezentacji.
2. Utwórz widok o nazwie `helloViewResolver.jsp` znajdujący się z lokalizacji określonej w konfiguracji `ViewResolver`.
3. Utwórz akcję `helloViewResolver` , która wyświetli utworzony widok. 
