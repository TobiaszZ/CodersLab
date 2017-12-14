#  jQuery - wyszukiwanie elementów

> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach.

Zadania rozwiązuj w pliku `app.js`, chyba, że w poleceniu podano inny plik.
Pamiętaj, żeby oddzielać zadania komentarzami i pisać czytelny, dobrze sformatowany kod.  

**Nie modyfikuj kodu HTML/CSS, chyba że w poleceniu jest napisane inaczej**.

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**

#### Zadanie 1 - rozwiązywane z wykładowcą

Dołącz do swojego pliku bibliotekę jQuery.  
W pliku **app.js** umieść kod sprawdzający, czy DOM został załadowany.

+#### Zadanie 2 - rozwiązywane z wykładowcą

Zapoznaj się z plikiem `index.html` oraz plikiem `style.css`.
1. Dodaj klasę ```borderClass``` do każdego elementu ```li``` w elemencie ```section class="main"```.
   Pamiętaj, aby wykonać to w odpowiedniej funkcji.
2. Znajdź wszystkie elementy o **klasie** ```showMore```.  
   **Pierwszemu** z tych elementów zmień kolor fontu ```css()``` na czerwony.

-------------------------------------------------------------------------------

#### Zadanie 3

1. Ustaw każdemu elementowi **li** (tylko te w **sekcji** o **klasie** ```main```) dodatkowe dwie **klasy**:
   * ```colorText```,
   * ```backgroundElement```.
   Znajdziesz je w pliku **style.css** pod odpowiednim komentarzem.
   Łącznie z poprzednią **klasą** ```borderClass```będą to trzy **klasy** ustawione dla każdego **li**.  
2. Ustaw także dla tych elementów następujące funkcje:
   * ```fadeOut``` z bardzo wolnym zanikaniem,
   * ```fadeIn``` z bardzo wolnym pojawianiem.

Pamiętaj, aby wykonać to w odpowiedniej funkcji.

Czy widzisz nadmiarowość w swoim kodzie?

#### Zadanie 4

Za pomocą jQuery wykonaj następujące operacje:
1. Wyszukaj wszystkie **linki** i ustaw im czerwony kolor za pomocą funkcji ```css()```.
2. Zmodyfikuj kod tak, aby kolor czerwony miały linki **tylko z menu**.
3. Dodaj **klasę** ```redLinks``` w pliku **style.css** (ustaw w niej kolor tekstu na czerwony) i za pomocą ```addClass``` nadaj ją elementom **li** w menu (zmodyfikuj kod z podpunktów 1. i 2.).
4. Spraw, aby pierwszy element menu miał większy font niż inne.  
   Stwórz w tym celu odpowiednią **klasę** w pliku `style.css`.

Pamiętaj, aby wykonać to w odpowiedniej funkcji.

#### Zadanie 5

Sprawdź, czy **h1** ma **klasę** ```creepyHeader```.
1. Jeśli nie ma, dodaj ją do tego elementu.
2. Jeśli ma, wypisz w konsoli, że **nagłówek** ma już taką **klasę**.

Pamiętaj, aby wykonać to w odpowiedniej funkcji.
