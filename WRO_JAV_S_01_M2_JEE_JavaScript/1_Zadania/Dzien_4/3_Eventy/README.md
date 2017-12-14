#  jQuery - eventy

> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach.

Zadania rozwiązuj w pliku `app.js`, chyba, że w poleceniu podano inny plik.
Pamiętaj, żeby oddzielać zadania komentarzami i pisać czytelny, dobrze sformatowany kod.  

**Nie modyfikuj kodu HTML/CSS, chyba że w poleceniu jest napisane inaczej**.

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**

#### Zadanie 1 - rozwiązywane z wykładowcą

Znajdź w pliku `index.html` trzy **buttony** w elemencie o **klasie** ```hero-buttons```.  
Stwórz funkcję, w której wykonaj następujące czynności:
1. ustaw każdy z trzech przycisków pod inną zmienną,
2. dla elementu pierwszego ustaw event ```click```, który po kliknięciu wyświetli w konsoli napis `kliknięto mnie`,
3. dla elementu drugiego ustaw event ```click```, który po kliknięciu wyświetli w konsoli napis `kliknięto mnie, ale już drugi raz nie dam się kliknąć`, ten komunikat ma się wyświetlić tylko jeden raz,
4. dla trzeciego wywołaj metodę `off`, która odczepi wszystkie eventy z wszystkich przycisków.

Przetestuj działanie Twojej funkcji.

-------------------------------------------------------------------------------

#### Zadanie 2

W pliku `counter.html` znajduje się pusty formularz, umieść w nim pole **textarea**.

1. Poniżej pola ma znaleźć się licznik wpisanych aktualnie znaków w to pole np. ```63/100```.  
2. Licznik ma zwiększać i zmniejszać swoją wartość po **każdym** wpisanym/usuniętym znaku.
3. Zablokuj możliwość wpisania więcej niż `100` znaków w to pole.

Napis z liczbą wpisanych znaków ma zmieniać kolor:

|kolor fontu|liczba wpisanych znaków|
|:--:|:--:|
|zielony|0&ndash;33|
|zółty|34&ndash;66|
|czerwony|67&ndash;100|

Zadanie rozwiąż w pliku `counter.js` i pamiętaj o podpięciu jQuery.

Hint:  
Odpowiednikiem `innerHTML` w `jQuery` jest [html()][html] a `innerText` jest [text()][text]

#### Zadanie 3

Znajdź w pliku `index.html` **sekcję** o **klasie** ```superhero-description```, a następnie napisz funkcję, w której:
1. Ukryj domyślnie wszystkie elementy **dd**.
2. Po kliknięciu w element **dt** spraw, by elementy **dd**:
   * rozwijały się, jeśli są ukryte,
   * zwijały się, jeśli są widoczne.

#### Zadanie 4

W pliku `index.html` znajdź formularz o **klasie** ```login```.
1. Stwórz funkcję, która będzie reagować na wciśnięcie przycisku ```show-hide-btn```.
2. Na początek ustaw event tak, aby po wciśnięciu wypisał w konsoli `działam`.
3. Następnie funkcja ma sprawdzać, jakiego typu jest element przechowujący hasło.
   Jeśli ```password```, zmień **type** na ```text```. Jeśli ```text```, zmień na ```password```.
   
Zapoznaj się z metoda [attr()][attr] i użyj jej w tym zadaniu.

#### Zadanie 5

1. Po najechaniu kursorem myszy na element w **menu** wypisz w konsoli tekst `Hura`.

#### Zadanie 6

Znajdź w pliku `index.html` formularz o **klasie** ```login```, a następnie napisz funkcję, w której:
1. ustaw lekki cień wewnętrzny po kliknięciu wewnątrz elementu **input**,
2. zmień ```background-color``` na szary po wyjściu kursorem z pola **input**.

<!-- Links -->
[attr]:https://api.jquery.com/attr/
[html]:https://api.jquery.com/html/
[text]:https://api.jquery.com/text/