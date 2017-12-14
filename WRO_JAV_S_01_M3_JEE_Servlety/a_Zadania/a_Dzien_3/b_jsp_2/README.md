<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java Servlety - jsp

### Zadania.

Stwórz projekt `JSP2`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz stronę `jsp1.jsp`. Następnie: 
1. W skryptlecie utwórz zmienną z aktualną datą i godziną i wyświetl ją na stronie.
2. Pamiętaj by dodać odpowiedni import.

#### Zadanie 2 - rozwiązywane z wykładowcą

W projekcie stwórz stronę `jsp2.jsp` i `error.jsp`. Następnie: 
1. Na stronie `jsp2.jsp` zdefiniuj stronę `error.jsp` jako stronę błędu.
2. Przetestuj działanie tworząc kod w skryptlecie generujący dowolny wyjątek, np. dzielenie przez zero, lub odwołanie do nieistniejącego elementu tablicy.

-------------------------------------------------------------------------------

#### Zadanie 3
W deskryptorze wdrożenia zdefiniuj:
1. stronę błędu dla kodu błędu 404.
2. stronę błędu dla wyjątku typu `java.lang.NullPointerException`.

Przetestuj czy odpowiednie definicje działają poprzez:
1. Wejście pod nieistniejący adres,
2. Wygenerowanie typu `java.lang.NullPointerException`.
3. Wygenerowanie innego wyjątku.


#### Zadanie 4
W projekcie stwórz strony  `header.jsp`, `footer.jsp` oraz `index.jsp`. Następnie:
1. W pliku `index.jsp` załącz odpowiednio plik `header.jsp` i `footer.jsp`.
2. Pliki `header.jsp` i `footer.jsp` umieść w odpowiedniej lokalizacji projektu - tak by nie można było ich wywołać bezpośrednio z przeglądarki.
3. Plik `header.jsp` - powinien zawierać:
    ````html
    <header>
      <h1>Most important heading here</h1>
    </header>
    ````  
4. Plik `footer.jsp` - powinien zawierać:
    ````html
    <footer>
      <p>Contact information: <a href="mailto:someone@example.com">
      someone@example.com</a>.</p>
    </footer>
    ````
