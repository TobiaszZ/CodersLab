<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Java Zaawansowane - Klasy abstrakcyjne
Pamiętaj aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań. 
 
#### Zadanie 1 - rozwiązywane z wykładowcą
1. Stwórz klasę abstrakcyjną o nazwie `Vehicle`, klasa ma posiadać pola:
    * maxSpeed (Integer)
    * model (String)
2. Zdefiniuj metodę `toString` zwracającą informacje w postaci:
`Class : <nazwa klasy>, model: <nazwa modelu>, speed: <maksymalna prędkość>`
3. Utwórz klasę `Car`, która dziedziczy po klasie `Vehicle`.
4. Klasa ma zawierać dodatkowe pole typu String o nazwie `type` reprezentującą typ (np. Terenowy, SUV), oraz dodatkowe metody dostępowe (getter, setter)
Dodaj konstruktor umożliwiający ustawienie wszystkich atrybutów klasy.
5. Utwórz klasę `Train`, która dziedziczy po klasie `Vehicle`. 
6. Klasa ma zawierać dodatkowe pole typu int o nazwie `trackWidth` reprezentującą szerokość toru (np. 600 - kolej wąskotorowa, 1435 - standardowa szerokość ), oraz dodatkowe metody dostępowe (getter, setter)
Dodaj konstruktor umożliwiający ustawienie wszystkich atrybutów klasy.
7. W klasie main utwórz tablicę 2 elementów `Vehicle`.
8. Wstaw do tablicy, pociąg oraz samochód, następnie w pętli wyświetl obiekty wywołując metodę `toString`. 
9. Przetestuj metody metodzie `main` klasy `Main1`.


#### Zadanie 2 - rozwiązywane z wykładowcą

1. Utwórz interfejs o nazwie `Inspectionable` - określający, które z pojazdów muszą przechodzić przegląd.
2. W interfejsie dodaj metodę `void createInspection()` - metoda ma wyświetlać dane w następujący sposób:
`Model: <nazwa modelu> - sprawdzony`.
3. Zmodyfikuj klasę `Car` tak by implementowała interfejs `Inspectionable` .
4. Zmodyfikuj pętlę wyświetlającą dane o pojazdach tak by w przypadku wystąpienia obiektu który implementuje `Inspectionable`, została wykonana metoda `createInspection()`.
-----------------------------------------------------------------------------

#### Zadanie 3 A 

Stwórz abstrakcyjną klasę `User` mającą:
1. Atrybuty `username`, `password` i `age` (zastanów się, jaki powinny mieć poziom dostępu).
2. Abstrakcyjną metodę `checkLogin`:
   * przyjmującą jako argumenty `username` i `password`
3. Publiczną metodę `setUsername`:
   * przyjmującą jako argument login
   * ustawiającą `username` na przekazaną wartość
4. Abstrakcyjną metodę: `setPassword`:
   * przyjmującą jako argument hasło
   * ta metoda będzie implementować różne sposoby sprawdzania hasła
4. Abstrakcyjną metodę: `setAge`:
   * przyjmującą jako argument wiek
5. Publiczną finalną metodę `login`
   * przyjmującą jako argumenty `username` i `password`
   * sprawdzającą hasło za pomocą metody `checkLogin`
     
#### Zadanie 3 B

Stwórz dwie klasy:  
* `Client`
* `Admin`  

będące rozszerzeniami klasy `User`, w których zaimplementujesz metody abstrakcyjne.  

Klasy mają działać w następujący sposób:  
1. Tworzymy obiekt klasy
2. Ustawiamy seterami odpowiednie wartości loginu, hasła (tutaj sprawdzamy jego poprawność) i wieku
3. Setter hasła ma zwrócić `false`, jeśli hasło nie spełnia warunków lub przekazany wiek nie jest liczbą całkowitą dodatnią
4. W tym momencie mamy obiekt z ustawionym loginem, hasłem i wiekiem.
5. Wywołujemy metodę `login`, przekazując jej login i hasło, będzie ona zwracać `true` lub `false`
6. W metodzie `login` ma zostać wywołana metoda `checkLogin`,  
   która sprawdzi poprawność loginu i hasła  
   oraz ewentualnie pozostałych warunków logowania i zwróci `true` lub `false`

W klasie `Admin` logowanie powinno spełniać następujące wymagania:
1. Użytkownik podał prawidłowy login.
2. Hasło miało minimum `10` znaków i było prawidłowe,  
   warunek długości hasła sprawdź w metodzie `setPassword`
3. Adres IP osoby logującej musi zaczynać się od `127` **lub** `192`

W klasie `Client` logowanie powinno wymagać, aby:
  1. Użytkownik podał prawidłowy login
  2. Hasło miało minimum `8` znaków i było prawidłowe,  
     warunek długości hasła sprawdź w metodzie `setPassword`
  3. Użytkownik miał minimum `18` lat.

Stwórz obiekty każdej z klas i ustaw loginy oraz hasła.  
Sprawdź, czy logowanie działa.  

Logowanie powinno wymagać prawidłowego hasła i po `3` nieudanych próbach z rzędu konto powinno być blokowane (metoda `login` zawsze wtedy zwraca `false`).
Zastanów się jak przechowywać błędne logowania.

Dodatkowo sprawdź poniższy scenariusz:  
1. Stwórz obiekt użytkownika, ustaw odpowiednie atrybuty
2. Wykonaj `2` błędne próby logowania
3. Wykonaj prawidłową próbę logowania
4. Wykonaj błędną próbę logowania
5. Sprawdź czy konto jest zablokowane, nie powinno być.

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**

