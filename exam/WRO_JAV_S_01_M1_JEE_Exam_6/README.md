<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Egzamin 6 - Spring, Hibernate.

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki

## Jak zacząć?

1. Stwórz [*fork*][forking] repozytorium z zadaniami.
2. Utwórz projekt Mavena o nazwie **JEE_Exam_6**.
3. Wykonaj poniższe polecenia:
````bash
$ cd ~/folderZprojektami/JEE_Exam_6 // użyj własnej lokalizacji
$ git init
$ git remote add origin https://github.com/CodersLab/WAR_JAVA_JEE_Exam_6.git // użyj własnego forka
$ git fetch
$ git branch master origin/master
$ git checkout master

````
**Zwróć szczególną uwagę na adres repozytorium oraz nazwę folderu.**

4. Rozwiąż zadania i [*skomituj*][ref-commit] zmiany do swojego repozytorium.

    **Repozytorium może zawierać jedynie katalog `src`, pliki: `pom.xml`, `.gitignore`, `README.md`**
5. [*Wypchnij*][ref-push] zmiany do swojego repozytorium na GitHubie.
6. Stwórz [*pull request*][pull-request] do oryginalnego repozytorium, gdy skończysz wszystkie zadania.


#### Pamiętaj, że pull request musi być stworzony, aby wykładowca dostał Twoje odpowiedzi.

* podczas egzaminu **możesz** korzystać z notatek, kodu napisanego wcześniej, internetu i prezentacji,
* zabroniona jest jakakolwiek komunikacja z innymi kursantami oraz osobami na zewnątrz.

**Powodzenia!**

----------------------------------------------------------------------------------------

## Zadania praktyczne
Kod wpisz w odpowiednim pliku, zgodnie z poleceniem zadania.

Nazwa bazy danych to **exam_6**

### Zadanie 1 (3 pkt)

1. Uzupełnij zestaw zależności odpowiedzialnych za Spring MVC.
2. Uzupełnij podstawowy zestaw zależności dla korzystania z Hibernate.
3. Uzupełnij podstawowy zestaw zależności dla korzystania z Spring Data.
4. Dodaj plik konfiguracyjny dla hibernate -  `persistence.xml`.
5. Utwórz plik konfiguracyjny aplikacji oraz niezbędne ziarna.
6. Utwórz stronę główną, będzie ona zawierać linki do rozwiązań zadań.

### Zadanie 2 (4 pkt)

1. Utwórz następujące encje oraz określ walidacje:

User (nazwa tabeli `tweeter_user`):
- id - klucz główny
- firstName - pole wymagane
- lastName - pole wymagane
- email - walidacja adresu email, pole nie wymagane

Tweet (nazwa tabeli `tweeter_tweet`):
- id - klucz główny
- title - minimalna długość 5 znaków, maksymalna długość 50, pole wymagane
- tweet_text - pole wymagane, maksymalna długość 16 znaków
- created

2. Nazwy kolumn mają pozostać domyślne.
3. Połącz te modele relacją jeden do wielu (dwukierunkową).
4. W encji User pole odnoszące się do wielu tweetów nazwij ```tweets```.
5. W encji Tweet analogicznie pole odnoszące się do jednej encji `User` nazwij ```user```.

### Zadanie 3 (4 pkt)

1. Utwórz repozytorium dla enacji `User`.
2. Utwórz repozytorium dla enacji `Tweet`
3. Utwórz metody umożliwiające pobieranie:
- Tweetów dla zadanego id użytkownika. 
Utwórz akcję wywołującą tą metodę, wyświetl tweety w widoku.
 
Akcja ma być dostępna pod adresem `/user/tweets`. Dodaj link do strony głównej.

- Tweetów o tytule, który zaczyna się od ciągu znaków, np. `Programo` , posortowane od najnowszego względem daty utworzenia.
Ciąg znaków do wyszukiwania ma być określony jako parametr.

Utwórz akcję wywołującą tą metodę, wyświetl tweety w widoku.

Akcja ma być dostępna pod adresem `/user/search-tweets`. Dodaj link do strony głównej.
 

### Zadanie 4 (4 pkt)

1. Utwórz kontrolery dla enacji `User` z mapowaniem `/user`.
2. Utwórz kontrolery dla enacji `Tweet` z mapowaniem `/tweet`'
3. Utwórz akcje oraz formularz umożliwiające dodanie użytkownika, formularz ma być dostępny pod adresem `/user/add`. Dodaj link do strony głównej.
4. Utwórz akcje oraz formularze umożliwiające dodanie tweetu, formularz ma być dostępny pod adresem `/tweet/add` (formularz ma posiadać możliwość wybrania użytkownika).
Dodaj link do strony głównej.


### Zadanie 5 (5 pkt)

1. Utwórz akcje dostępną pod adresem `/user/all` która wyświetli listę wszystkich dodanych użytkowników. Dodaj link do strony głównej.
2. Dodaj możliwość usuwania użytkowników - link do usunięcia w tabeli html dla każdego użytkownika.
3. Dodaj możliwość edycji użytkowników - link do edycji w tabeli html dla każdego użytkownika.

Przykład interfejsu:

| Imię      | Nazwisko | Email                            | Akcja
| --------- |:--------:|:--------------------------------:| ----------:|
| Arek      | Józwiak  | arkadiusz.jozwiak@coderslab.pl   | Usuń Edytuj|
| Marek     | Marecki  |     marek.marecki@coderslab.pl   | Usuń Edytuj|


<!-- Links -->
[forking]: https://guides.github.com/activities/forking/
[ref-clone]: http://gitref.org/creating/#clone
[ref-commit]: http://gitref.org/basic/#commit
[ref-push]: http://gitref.org/remotes/#push
[pull-request]: https://help.github.com/articles/creating-a-pull-request
[ref-multiple-forms]: http://stackoverflow.com/a/14071321
