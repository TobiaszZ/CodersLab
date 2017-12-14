<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java Servlety - jstl

### Zadania.

Stwórz projekt `JSTL`. Rozwiązania zadań powinny znajdować się w tym projekcie. Zadania należy rozwiązać używając jstl.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz stronę `jsp1.jsp`. Następnie:
1. Dołącz odpowiednie biblioteki do projektu jeżeli jest to konieczne.
2. Sprawdź poprawność działania jstl wyświetlając za pomocą odpowiedniego znacznika wartość GET o nazwie `role`.
3. W przypadku braku wartości ma się wyświetlić napis `guest`.

#### Zadanie 2 - rozwiązywane z wykładowcą
W projekcie stwórz stronę `jsp2.jsp`. Następnie:
1. Pobierz wartość z GET o nazwie role, wyświetl w pętli wszystkie wartości tego parametru.

Przykład url:
```
http://localhost:8080/Book/NewFile.jsp?role=admin&role=guest
```

-------------------------------------------------------------------------------

#### Zadanie 3
W projekcie stwórz`jsp3.jsp`. Następnie:
1. Pobierz parametr GET o nazwie `minimalAge`, użyj instrukcji warunkowej if.
2. Jeżeli parametr `minimalAge` jest większy od 18 wyświetl napis `Dozwolone od lat 18`.
3. Jeżeli parametr `minimalAge` jest mniejszy od 18 wyświetl napis`Dozwolone poniżej lat 18`.
4. Jeżeli parametr nie istnieje wyświetl napis `Brak parametru`.

#### Zadanie 4
W projekcie stwórz `jsp4.jsp`. Następnie:
1. Pobierz parametr GET o nazwie `minimalAge`, użyj instrukcji warunkowej `choose `.
2. Jeżeli parametr `minimalAge` jest większy od 18 wyświetl napis `Dozwolone od lat 18`.
3. Jeżeli parametr `minimalAge` jest mniejszy od 18 wyświetl napis`Dozwolone poniżej lat 18`.
4. Jeżeli parametr nie istnieje wyświetl napis `Brak parametru`.

#### Zadanie 5
W projekcie stwórz `jsp5.jsp`. Następnie:
1. Wyświetl za pomocą pętli jstl oraz wartości pobranych przy pomocy EL informacje o wszystkich nagłówkach http.
    ````html
    accept-language = en-US,en;q=0.8
    cookie = JSESSIONID=aaahquZhaXWB8gHWBohRv
    host = localhost:8080
    upgrade-insecure-requests = 1
    connection = keep-alive
    accept-encoding = gzip, deflate, sdch, br
    user-agent = Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/56.0.2924.76 Chrome/56.0.2924.76 Safari/537.36
    accept = text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
    ````

#### Zadanie 6 - dodatkowe
Zapoznaj się z tagami formatującymi standardowej biblioteki.
(https://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm).

#### Zadanie 7 - dodatkowe
Zapoznaj się z funkcjami dostępnymi w JSTL.
(https://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm).
