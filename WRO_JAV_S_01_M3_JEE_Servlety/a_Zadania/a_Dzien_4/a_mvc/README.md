<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java Servlety - MVC

### Zadania.

Stwórz projekt `MVC`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą
Celem zadania jest utworzenie servletu, który wczyta z parametru GET wartość podaną w Euro i wyświetli w jsp wartość w złotówkach. W tym celu:
1. W projekcie stwórz servlet `Servlet_01`, który wczyta zmienną GET : ```value```.
2. Zdefiniuj parametr inicjalizacji o nazwie `exchangeRate` ze zdefiniowanym przelicznikiem walut .
3. W kontrolerze (servlecie) przelicz waluty i przekaż do widoku.
4. Wyświetl przeliczoną wartość.

#### Zadanie 2 - rozwiązywane z wykładowcą

W projekcie stwórz servlet `Servlet_02`, który wczyta dwie zmienne GET : ```start``` i ```end``` . Następnie: 
1. W servlecie zwiększ obie wartości o wartość `10`, przekaż zwiększone zmienne do widoku JSP .
2. W widoku wyświetl  wszystkie liczby  ```start``` do ```end```. 

-----------------------------------------------------------------------------

#### Zadanie 3

W projekcie stwórz servlet `Servlet_03`. Następnie:
1. W widoku stwórz formularz zawierający pola o nazwach (title, author, isbn). Formularz ma przesłać dane metodą POST do tego samego servletu (do metody `doPost`).
2. Stwórz Klasę `Book` zawierającą pola zgodne z polami wcześniej utworzonego formularza.
3. Odbierz dane na ich podstawie stwórz obiekt klasy Book.
4. Przekaż obiekt do widoku `result.jsp`. 
5. Wyświetl właściwości nowo dodanego obiektu `title`, `author`.


#### Zadanie 4

W projekcie stwórz servlet `Servlet_04`. Następnie: 
1. W widoku wyświetlanym metodą `GET` o nazwie `form.jsp` stwórz formularz zawierający pola o nazwach (title1, author1, age1), (title2, author2, age2), itd do 5. 
Formularz ma być przesłany metodą POST do servletu  `Servlet_04`.
2. Zaimportuj wcześniej stworzoną klasę `Book`.
3. W servlecie `Servlet_04` odbierz dane na ich podstawie stwórz obiekty klasy Book.
4. Obiekty umieść w liście lub tablicy, którą następnie przekaż do widoku `result.jsp`. 
5. W pętli wyświetl właściwości wszystkich obiektów `title`, `author`.


#### Zadanie 5

1. W projekcie stwórz servlet `Servlet_05_1`. 
2. Servlet ma udostępniać możliwość dodawania nowej książki w sposób pojedynczy (obiekt `Book`), który następnie będzie zapisywany do sesji.    
3. Następnie stwórz `Servlet_05_2`, który będzie udostępniał możliwość tworzenia 3 książek na raz -
 podobnie jak w poprzednim zadaniu, niezależnie od metody dodania książki ma ona zostać zapisana w sesji. Utworzone obiekty przechowuj w tablicy.   
4. Na końcu stwórz Servlet, który będzie wyświetlał w widoku listę wszystkich utworzonych książek.
