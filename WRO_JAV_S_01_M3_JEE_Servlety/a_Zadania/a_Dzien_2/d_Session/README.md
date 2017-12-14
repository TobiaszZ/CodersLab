<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - SESJA
### Zadania.

Stwórz projekt `Session`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz trzy servlety `Servlet_01_Set`, `Servlet_01_Get`, `Servlet_03_Del`. Następnie:
1. Pierwszy ma nastawiać informacje w sesji pod kluczem ```counter``` na `0`.
2. Drugi ma wyświetlać zawartość sesji pod kluczem ```counter``` i zwiększać ją o `1`. Jeżeli nie ma takich danych w sesji, to strona powinna wyświetlić odpowiednią informacje.
3. Trzeci ma usuwać dane z sesji (tylko te trzymane pod kluczem ```counter```).

#### Zadanie 2 - rozwiązywane z wykładowcą

W projekcie stwórz servlet `Servlet_02`. Następnie:
1. Dodaj do niego formularz z możliwością wpisania oceny. 
2. Po zatwierdzeniu formularza dodaj ocenę do sesji. Oceny trzymaj w tablicy, którą będziesz wkładać do sesji.
 Zadbaj o walidację wprowadzanych ocen (nie mniej niż 1 i nie więcej niż 6).
3. Wylicz średnią z ocen (pamiętaj o właśnie dodanej ocenie).
4. Wszystkie zapamiętane oceny i ich średnia powinny być wyświetlane pod formularzem.

-------------------------------------------------------------------------------

#### Zadanie 3.
W projekcie stwórz  `Servlet_03_Add` dostępny pod adresem `/addToSession` oraz servlet `Servlet_03_All` dostępny pod adresem `/showAllSession`. Następnie:
1. Dodaj do niego następujący formularz:  
    ```html
    <form action="#" method="POST">
        <label>
            Klucz:
            <input type="text" name="key">
        </label>
        <label>
            Wartość:
            <input type="text" name="value">
        </label>
        <input type="submit">
    
    </form>
    ``` 
2. Dodaj do servletu `Servlet_03_Add` funkcjonalność która po zatwierdzeniu formularza metodą POST doda nową zmienną sesyjną o podanej nazwie i wartości. 
3. Dodaj do servletu `Servlet_03_All` funkcjonalność która wyświetli w formie tabeli wszystkie dane znajdujące się w sesji (zarówno klucz jak i wartość). 

#### Zadanie 4

W projekcie stwórz servlet `Servlet_04`, oraz stronę HTML `index_04.html`. Następnie:
1. Dodaj do strony formularz, zawierający jedno pole tekstowe (nazwa) oraz dwa pola liczbowe (ilość i cena) służącymi do dodawania produktu do koszyka. Formularz powinien przekierować do sevletu metodą POST.
2. Po odebraniu danych POST w servelecie dodaj do sesji przedmiot. Pamiętaj że przedmiotów będzie więcej więc użyj do tego tablicy. 
3. Dodaj do servletu funkcjonalność która wyświetli zawartość naszego koszyka. Zawartość ma być wyświetlana zarówno w przypadku wejścia metodą GET jak i metodą POST.

Przykładowy koszyk:
```
Produkt 1 - 4 x 5.20zł = 20.80zł
Produkt 2 - 1 x 9.99zł =  9.99zł
Produkt 3 - 1 x 2.20zł =  2.20zł
                   SUMA: 32.99zł
```

#### Zadanie 5

W projekcie stwórz servlet `Servlet_05`. Następnie:
1. Dodaj do niego formularz, z 3 polami tekstowymi (imię, nazwisko, mail) oraz polem numeryczne, do którego będzie wpisywana captcha: wynik działania matematycznego. 
2. Nad polem numerycznym do wpisania zabezpieczenia widnieje informacja: `Wpisz poniżej sumę {liczba1} + {liczba2}`. Liczby powinny być losowe z zakresu od 0 do 100. Servlet powinien obliczyć sumę tych liczb i zapisać wynik do sesji pod kluczem `captcha`
5. Po przesłaniu formularza aplikacja sprawdzi czy wpisany przez użytkownika wynik zgadza się z tym z sesji i wyświetli odpowiedni komunikat.


#### Zadanie 6

W projekcie stwórz servlet `Servlet_06` podpięty do adresu `/favImages`, oraz 4 strony HTML `wybor_1.html`, `wybor_2.html`, `wybor_3.html`, `wybor_4.html`. Zadanie polega na napisaniu systemu który ma zapamiętywać obrazki które podobają się użytkowników. System będzie działał w następujący sposób:
1. Użytkownik wchodzi na stronę, servelet sprawdza czy w sesji zapamiętana informacja na temat ilości odwiedzonych już stron. Jeżeli nie ma to zapamiętuje w sesji pod kluczem `pagesVisited` wartość 1 i przekierowuje użytkownika do pierwszej strony.
2. Formularz z strony przesyła dane do serveletu.
3. Servelet sprawdza czy w sesji jest informacja na temat ilości odwiedzonych już stron. Jako że jest (dodaliśmy ją w punkcie 1) to zapamiętuje w sesji pod kluczem `choice_1` odpowiedź wysłaną przez klienta i przekierowuje go do następnej strony.
4. Sytuacja będzie się powtarzać aż do przejścia przez wszystkie strony (ilość stron musi być wcześniej znana w servelecie).
5. Po otrzymaniu wyników z ostatniej strony servelet powinien wyświetlić informację: `Te obrazy Ci się podobały:`, a pod nią wyświetli numery stron na których użytkownik odpowiedział `Tak` wybranych zdjęć.

Krok po kroku jak rozwiązać to zadanie:
1. Do każdej z stron dodaj obraz (mogą być losowe obrazki, np. pobrane z [Lorempixel][lorempixel]), nad którym widnieje pytanie`Czy podoba Ci się ten obraz?` oraz formularz z polem wyboru `Tak`/`Nie`.
2. Podepnij servelet do odpowiedniego adresu.
3. Po wejściu na odpowiednią stronę sprawdź w servelecie czy w sesji zapamiętana informacja na temat ilości odwiedzonych już stron. Następnie:
    * Jeżeli nie jest zapamiętana, to nastaw ją na wartość 1 i przekieruj do pierwszej strony,
    * Jeżeli jest zapamiętana to zwiększ ją o jeden i przekieruj do odpowiedniej strony.
4. Dodajmy obsługę formularza. Jeżeli serverlet otrzymał dane metodą POST to **PRZED** zmianą numeru zapamiętanej strony dodaj do sesji informację na temat wyboru użytkownika pod kluczem `choice_{numer strony}`.
5. Dodajmy sprawdzenie końca - jeżeli numer strony jest większy niż maksymalna ilość stron to servelet powinien wyświetlić wyniki.

Hint: Do przekierowania do kolejnej strony html użyj `response.sendRedirect("wybor_2.html");`.
  

#### Zadanie 7

W projekcie stwórz servlet `Servlet_06`. Następnie:
1. Wylosuj w nim 2 liczby całkowite z przedziału 20-1000.
2. Wyświetli 3 pola do wpisania wyników działań na wylosowanych liczbach:
    * dodawania, 
    * odejmowania, 
    * mnożenia.
3. Po wysłaniu formularza wygeneruj stronę która sprawdzi wpisane przez nas wyniki i przedstawi je w postaci:

```
20	+	3	=	23	Correct
20	-	3	=	17	Correct
20	*	3	=	89	Wrong
```
Hint: w sesji zapamiętaj liczby, a nie wyniki - dzięki temu będziesz trzymać jedną zmienną mniej. 

#### Zadanie 8

W projekcie stwórz servlet `Servlet_08`. Następnie:
1. Przygotuj sobie tablicę z nazwami krai sąsiadującymi z Polską i ich stolicami.
2. Po uruchomieniu serveletu na serwerze wyświetl formularz z zapytaniem o stolicę sąsiadującego z Polską państwa. W postaci: `Podaj stolicę dla państwa: Niemcy `
3. Po przesłaniu odpowiedzi, system zweryfikuje poprawność odpowiedzi i wyświetl odpowiedni komunikat oraz ponownie wyświetli pytanie o kolejne państwo.
4. Po wyświetleniu wszystkich pytań wyświetli się wynik naszego quizu z informacją o ilości poprawnych odpowiedzi:
`Poprawnych odpowiedzi: 4`.

Hint: To zadanie będzie miało podobny algorytm działania co zadanie 6 - wzoruj się na nim.

[lorempixel]:http://lorempixel.com/
