<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Java Zaawansowane - Interfejsy
Pamiętaj aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań.


#### Zadanie 1 - rozwiązywane z wykładowcą

1. Stwórz interfejs o nazwie `Url` służący do parsowania adresu URL w celu uzyskania parametrów przekazanych metodą `GET`
2. Interfejs powinien zawierać metodę `String getParam(String name, String url)` - `url` - adres do sparsowania.
   która ma zwrócić wartość parametru o nazwie `name` wyciągniętą z `url`.
3. Następnie stwórz klasę `StandardUrl`, w której zaimplementujesz interfejs.
   Jej zadaniem będzie sparsowanie standardowego url np. `url_example?param1=99&param2=string` w taki sposób żeby za pomocą metody
   `getParam("param1", "url_example?param1=99&param2=string")` uzyskać `99` itd.
4. W momencie gdy klasa będzie działała prawidłowo utwórz klasę `UrlMain` w której:
    * stworzysz instancję obiektu `StandardUrl` przekazując w konstruktorze przykładowego adresu URL (może być jak w przykładzie).
    * wyświetlisz listę z nazwami wszystkich parametrów i ich wartościami.
    
#### Zadanie 2 - rozwiązywane z wykładowcą

1. Dopisz nową klasę `ExtendedUrl`. Klasa ta ma zaimplementować interfejs oraz prawidłowo sparsować
 niestandardowy adres url wg. poniższego wzoru np. `url_example/param1.99/param2.string`
2. Dla przykładu z powyższym adresem przekazanie do metody argumentu `param1` ma zwrócić `99` a `param2` ma zwrócić `string`
3. Przetestuj działanie wykorzystując wcześniej utworzoną klasą `UrlMain`.
    
-----------------------------------------------------------------------------

#### Zadanie 2

1. Stwórz interfejs o nazwie `Moveable` zawierający 2 metody `void start()` oraz `void stop()`;
2. Utwórz klasy `Cat`, `Car`, `Person`, każda ma implementować interfejs `Moveable`.
3. Dla poszczególnych typów zaimplementowana metoda `start()` mają wyświetlać:
    * Car - samochód jedzie
    * Cat - kot skacze
    * Person - osoba idzie
3. Utwórz klasę `Main1` a w niej metodę `main`.
4. Utwórz tablicę w następujący sposób:
    ````java
    Moveable[] moveableTab = new Moveable[3];
    ````
    W ten sposób traktujemy interfejs jako typ danych. W tablicy możemy elementy, które implementują określony typem interfejs.

5. Umieść w tablicy jeden element każdego z utworzonych typów (`Cat`, `Car`, `Person`).
6. Wyświetl elementy tablicy wywołując metodę `start()`.

#### Zadanie 3

1. Utwórz klasę `Main2` a w niej metodę `main`.
2. Utwórz tablicę w następujący sposób:
    ````java
    List<Moveable> moveableList = new ArrayList<>();
    ````
3. Dodaj do listy jeden element każdego z utworzonych typów (`Cat`, `Car`, `Person`).
4. Wyświetl elementy tablicy wywołując metodę `start()`.

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
