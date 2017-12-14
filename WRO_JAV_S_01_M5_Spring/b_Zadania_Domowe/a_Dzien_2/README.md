<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE - Spring MVC

### Zadania.

1. Stwórz projekt `Homework_02`. Rozwiązania zadań powinny znajdować się w tym projekcie.


#### Zadanie 1

1. Stwórz kontroler o nazwie `HeaderController`.
2. Stwórz akcję dostępną pod adresem `/showUserAgent`
3. Pobierz wartość nagłówka `userAgent`.
4. Utwórz widok dla tej akcji o nazwie `userAgent.jsp`.
5. Przekaż a następnie wyświetl w widoku parametr.

#### Zadanie 2

1. Stwórz kontroler o nazwie `RedirectController`.
2. Utwórz akcję dostępną pod adresem `/first`. Akcja ma ma wyświetlać widok `first.jsp`.
3. Utwórz akcję dostępną pod adresem `/third`. Akcja ma ma wyświetlać widok `third.jsp`.
4. W widoku `first.jsp` utwórz link do akcji dostępnej pod adresem `/second`, akcja ma przekierowywać do akcji dostępnej pod adresem `/third`.


#### Zadanie 3

1. Utwórz kontroler o nazwie `MultiplyController`.
2. Utwórz nową akcję multiply, dostępną pod adresem `/multiply`.
3. Akcja ma pobierać jeden parametr w URL o nazwie `size`.
4. Ustaw domyślną wartość tego parametru na wartość 10.
5. Przekaż zmienną do widoku a następnie wyświetl tabliczkę mnożenia w tabelce html w postaci:


| x | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 1 | 2 | 3 |   |   |   |   |   |   |   |
| 2 |       ...                             |
| 3 |                                       |
| 4 |                                       |
| ...                                       |
| 9 | 9 |18 |27 |36 |45 |54 |63 |72 |81 |90 |
| 10|...|

### Zadanie 4
1. W kontrolerze `MultiplyController` utwórz akcję `/paramMultiply/<rows>/<cols>`,
2. Akcja ma przyjmować 2 parametry `<rows>` oraz `<cols>`.
3. Przekaż zmienne do widoku a następnie wyświetl tabliczkę mnożenia w tabelce html w postaci:


Parametr rows = 10, cols =2.

| x | 1 | 2 |
|---|---|---|
| 1 | 1 | 2 |
| 2 | 2 | 4 |
| 3 | 3 | 6 |
| 4 | 4 | 8 |
| ...
| 9 | 9 | 18|
| 10| 10| 20|
