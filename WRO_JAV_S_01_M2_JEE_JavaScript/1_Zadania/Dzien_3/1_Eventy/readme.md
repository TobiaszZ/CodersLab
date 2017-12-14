#  Eventy

> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach.

Zadania rozwiązuj w pliku `app.js`, chyba, że w poleceniu podano inny plik.
Pamiętaj, żeby oddzielać zadania komentarzami i pisać czytelny, dobrze sformatowany kod.  

**Nie modyfikuj kodu HTML, chyba że w poleceniu jest napisane inaczej**.

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**

Każde zadanie ma swój plik **HTML** i powinno być rozwiązane w osobnym pliku JavaScript (puste pliki są już przygotowane w odpowiednim folderze).

#### Zadanie 1 - rozwiązywane z wykładowcą

Uruchom stronę przygotowaną dla zadania 1.  
Sprawdź w konsoli, czy są jakieś błędy.  
Następnie:
1. Przenieś tag ```<script>``` do sekcji ```<head>```. Zobacz, co się zmieniło w działaniu skryptu. Spróbuj to wytłumaczyć.// Drzewo za szybko sie załadowało js, ale drzewo html juz tak 
2. Stwórz event ```DOMContentLoaded``` dla elementu ```document``` i przenieś kod do środka tego eventu.  
   Czy poprawiło to sytuację?
3. Przenieś znowu tag ```<script>``` na koniec pliku, czy jest jakaś różnica?

#### Zadanie 2 - rozwiązywane z wykładowcą

Na stronie znajdują się trzy guziki.
1. Napisz jeden event dla wszystkich guzików, który ma być podpięty do elementu rodzica o **id** ```bubblingButtons```,  
   który spowoduje, że po kliknięciu licznik znajdujący się w atrybucie ```data-counter``` zwiększy wartość o jeden.

Pamiętaj, żeby wszystko pisać w evencie ```DOMContentLoaded```.

-------------------------------------------------------------------------------

#### Zadanie 3

Na stronie znajduje się guzik.
1.Podepnij do niego event, który na kliknięcie spowoduje, że w konsoli wyświetli się napis:
  `Hura! Działa!`
  
Pamiętaj, żeby wszystko pisać w evencie ```DOMContentLoaded```.

#### Zadanie 4

Na stronie znajdują się trzy guziki i trzy liczniki (elementy ```span``` o klasie ```counter```).
1. Do każdego guzika dopisz event, który spowoduje, że przypisany do niego licznik zwiększy swoją wartość o `1` po kliknięciu w guzik.

Pamiętaj, żeby wszystko pisać w evencie ```DOMContentLoaded```.

#### Zadanie 5

Na stronie znajdują się trzy guziki i jeden licznik.

1. Napisz jeden wspólny event dla wszystkich guzików, który spowoduje, że po kliknięciu w guzik licznik zwiększy wartość o `1`.

Pamiętaj, żeby wszystko pisać w evencie ```DOMContentLoaded```.

#### Zadanie 6

Na stronie znajdują się trzy elementy **div**.
1. Napisz wspólny event zmieniający kolor tła **tylko** w klikniętym **divie**.  
   Użyj do tego słowa kluczowego ```this```.
   
Pamiętaj, żeby wszystko pisać w evencie ```DOMContentLoaded```.

**Hint**:
Żeby uzyskać losowy kolor użyj poniższego kodu:
```JavaScript
var randomColor = "#" + Math.floor(Math.random()*16777215).toString(16);
```

#### Zadanie 7

Na stronie znajduje się jeden element **div**.
1. Napisz dla niego event, który będzie wypisywał położenie kursora myszy w chwili, gdy znajduje się nad tym elementem.
2. Wyszukaj zarówno położenie kursora globalne (czyli odległość od górnego lewego rogu okna), jak i lokalne (czyli odległość od lewego górnego rogu elementu).

Pamiętaj, żeby wszystko pisać w evencie ```DOMContentLoaded```.

#### Zadanie 8

Na stronie znajdują się zagnieżdżone elementy. Do każdego dopisane są eventy.
1. Użyj metod ```stopPropagation``` i ```stopImmediatePropagation``` w taki sposób, aby:
   * Wywoływały się eventy dla elementu pierwszego i drugiego, a nie wywoływał się event dla elementu trzeciego.
   * Wywoływały się wszystkie eventy dla elementu czwartego i pierwszy event dla elementu piątego.
2. Dla ułatwienia, każdy event powoduje zmianę koloru elementu na którym został wywołany.

#### Zadanie 9

Na stronie znajdują się dwa elementy pokazujące wielkość okna.
1. Dopisz event do okna (element ```window```), który spowoduje,  
   że elementy te będą pokazywały poprawne wartości nawet po przeskalowaniu okna.
