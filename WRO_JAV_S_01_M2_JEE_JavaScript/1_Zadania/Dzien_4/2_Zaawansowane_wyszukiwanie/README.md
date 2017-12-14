#  jQuery - zaawansowane wyszukiwanie elementów

> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach.

Zadania rozwiązuj w pliku `app.js`, chyba, że w poleceniu podano inny plik.
Pamiętaj, żeby oddzielać zadania komentarzami i pisać czytelny, dobrze sformatowany kod.  

**Nie modyfikuj kodu HTML/CSS, chyba że w poleceniu jest napisane inaczej**.

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**

#### Zadanie 1 - rozwiązywane z wykładowcą

Zadanie rozwiązuj wyłącznie korzystając z metod do poruszania się po DOM.

1. W pliku `index.html` znajduje się element `span` o atrybucie `data-task` ustawionym na `_task1`, znajdź go, i wykonaj następujące czynności.    
   Kolejne przejście wykonuj z elementu znalezionego we wcześniejszym punkcie.
2. Przejdź do elementu `p`, który jest rodzeństwem i znajduje się najbliżej.
3. Przejdź do przodka, którego tag to `section`
4. Przejdź do następnego elementu
5. Znajdź elementy o klasie `container` i zmień im kolor tła na zielony oraz dodaj klasę `answerTask1`
6. Po `4` sekundach ukryj elementy znalezione w pkt. 5 korzystając ze `slideUp()`

-------------------------------------------------------------------------------

#### Zadanie 2

Zadanie rozwiązuj wyłącznie korzystając z metod do poruszania się po DOM.

1. W pliku `index.html` znajduje się element `span` o atrybucie `data-task` ustawionym na `_task2`, znajdź go, i wykonaj następujące czynności.    
   Kolejne przejście wykonuj z elementu znalezionego we wcześniejszym punkcie.
2. Przejdź do elementu `section` o klasie `shopping` używając dowolnej metody do poruszania się po DOM
3. Przejdź do drugiego dziecka będącego elementem `div`
4. Znajdź potomka o tagu `button`
5. Znajdź najbliższy element o tagu `cart-item` i dodaj mu klasę `cart-updated`

Rozwiązanie powinno spowodować nadanie zielonego obramowania elementowi zawierającemu `buty`