<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - Servlety

### Zadania.

1. Stwórz projekt `Servlety_02`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

1. W projekcie stwórz servlet `Servlet_01` dostępny pod adresem **/Servlet_01**, który wyświetli w przeglądarce lokalny czas.


#### Zadanie 2 - rozwiązywane z wykładowcą
1. W projekcie stwórz servlet `Servlet_02` dostępny pod adresem **/Servlet_02**,
oraz stronę HTML `index.html`, z odnośnikiem do servletu.
2. Zainicjuj w desktyptorze wdrożenia parametr dostępny tylko dla servletu o nazwie `myParam`, oraz wartości `coderslab.pl`. 
3. Pobierz parametr w servlecie, a następnie wyświetl na stronie.


-------------------------------------------------------------------------------

#### Zadanie 3
1. W projekcie stwórz servlet `Servlet_03` dostępny pod adresem **/Servlet_03**,
oraz stronę HTML `index.html`, z odnośnikiem do servletu.
2. Zainicjuj w deskryptorze parametr dostępny w całej aplikacji o nazwie `applicationName`, oraz wartości `MyApplicationName`. 
3. Pobierz parametr `applicationName` w servlecie, a następnie wyświetl na stronie.

#### Zadanie 4
1. W projekcie stwórz servlet `Servlet_04` dostępny pod adresem **/Servlet_04**,
2. Wyświetl w przeglądarce poniższe informacje:
    * Adres IP
    * Przeglądarkę
    * Aktualny czas


#### Zadanie 5

1. W projekcie stwórz servlet `Servlet_05` dostępny pod adresem **/Servlet_05**,
2. Pobierz z nagłówka HTTP informacje na temat przeglądarki użytkownika a następnie wyświetl na stronie informacje postaci:
`Użytkownik używa przeglądarki: Chrome`.
 
Hint: Sprawdź jakiej przeglądarki używa użytkownik wg. poniższych zasad (jeśli ciąg zawiera):  
  * `Chrome` - `Google Chrome`
  * `Firefox` - `Mozilla Firefox`
  * `Opera` - `Opera`
  * `Safari` - `Safari`

Jeśli posiadasz kilka przeglądarek, sprawdź czy Twój kod działa prawidłowo.
