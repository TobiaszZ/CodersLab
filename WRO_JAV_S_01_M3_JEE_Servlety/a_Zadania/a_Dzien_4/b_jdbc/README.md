# Java Servlety - Servlety - jdbc

### Zadania.

Stwórz projekt `MVCjdbc`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz servlet `Servlet_01` dostępny pod adresem `/add-book`. Następnie:
1. W widoku stwórz formularz zawierający pola o nazwach (title, author, isbn)
Formularz ma przesłać dane metodą POST do tego samego servletu (do metody `doPost`).
2. Stwórz Klasę `Book` zawierającą pola zgodne z polami wcześniej utworzonego formularza.
3. Odbierz dane na ich podstawie stwórz obiekt klasy Book.
4. Utwórz klasę dostępu do danych korzystającą z bazy danych o nazwie `BookDao`.
5. Utwórz metodę zapisu do bazy.
6. Zapisz dane do bazy.

#### Zadanie 2 - rozwiązywane z wykładowcą

W projekcie stwórz servlet `Servlet_02` dostępny pod adresem `/delete-book`,
 który usunie podaną w parametrze `id` książkę.
1. Utwórz w `BookDao` metodę służącą do usuwania książki. 

-----------------------------------------------------------------------------

#### Zadanie 3

W projekcie stwórz servlety umożliwiające:
1. Wyświetlanie listy książek dostępny pod adresem `/all-books`.
2. Edycję książki - link do edycji w tabeli html dla każdej książki.

Dodaj linki umożliwiające usuwanie książek - link do usunięcia w tabeli html dla każdej książki.

Przykład interfejsu:

| Title             | Author           | Isbn           | Akcja
| ----------------- |:----------------:|:------- ------:| ----------:|
| Thinking in Java  | Bruce Eckel      | 9789814035750  | Usuń Edytuj|
| Java 2 Podstawy   | Cay S. Horstmann | 9788371979842  | Usuń Edytuj|


#### Zadanie 4

W projekcie stwórz servlet `Servlet_04`, dostępny pod adresem `/search-book`. Następnie: 
1. Utwórz na stronie wyświetlającej wszystkie książki formularz umożliwiający wpisanie ciągu znaków do wyszukiwania.
2. Wyszukiwanie ma się odbywać po tytule książki lub jego części.
