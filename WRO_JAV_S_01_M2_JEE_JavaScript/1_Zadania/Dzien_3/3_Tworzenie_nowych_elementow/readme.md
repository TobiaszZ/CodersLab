#  Tworzenie i usuwanie elementów

> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach.

Zadania rozwiązuj w pliku `app.js`, chyba, że w poleceniu podano inny plik.
Pamiętaj, żeby oddzielać zadania komentarzami i pisać czytelny, dobrze sformatowany kod.  

**Nie modyfikuj kodu HTML, chyba że w poleceniu jest napisane inaczej**.

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**

Każde zadanie ma swój plik **HTML** i powinno być rozwiązane w osobnym pliku JavaScript (puste pliki są już przygotowane w odpowiednim folderze).

#### Zadanie 1 - rozwiązywane z wykładowcą

Na stronie znajduje się tabela z informacjami na temat zamówień (z dwoma już wprowadzonymi zamówieniami).  
Poniżej znajduje się formularz do wypełnienia nowego zamówienia.
1. Napisz event, który pobierze informacje z inputów (```el.value```) i wprowadzi nowy wpis do tabeli.

#### Zadanie 2 - rozwiązywane z wykładowcą

Na stronie przypisanej do zadania znajduje się lista i guzik.  
1. Dopisz odpowiednie eventy do nich w taki sposób, żeby po kliknięciu w guzik dodał się nowy element do listy.  
2. Element powinien mieć w sobie informacje na temat tego, ile elementów jest w liście w chwili jego dodania.  
   Przykładowy element znajduje się w komentarzu w kodzie html

-------------------------------------------------------------------------------

#### Zadanie 3

Na stronie znajduje się guzik.
1. Dopisz do niego event w taki sposób, żeby po kliknięciu w niego guzik został usunięty ze strony.

#### Zadanie 4

Na stronie znajduje się lista z wpisami i guzik.
1. Napisz taki event, żeby po kliknięciu w guzik z listy zostały usunięte **wszystkie** jej dzieci.

#### Zadanie 5

Na stronie znajduje się tabela podobna do tej z zadania.  
Tym razem przy każdym zamówieniu znajduje się dodatkowo guzik, który służy do usuwania tego zamówienia.
2. Dopisz do niego odpowiedni event, który spowoduje, że dane zamówienie zniknie z tablicy.  
2. Spróbuj zrobić to w taki sposób, żeby wszystkie guziki korzystały z tego samego eventu (użyj ```this```).
3. Pamiętaj o zmianie łącznej kwoty na samym dole tabeli!

#### Zadanie 6

Na stronie znajdują się dwie listy. Obok każdego wpisu (w obu listach) znajdują się przyciski.
1. Napisz taki kod JavaScript, żeby po przyciśnięciu guzika element listy był przenoszony do drugiej listy.
2. Pamiętaj, że element może być przenoszony wiele razy (np. z listy `1` do listy `2`, a potem z powrotem do listy `1`).
