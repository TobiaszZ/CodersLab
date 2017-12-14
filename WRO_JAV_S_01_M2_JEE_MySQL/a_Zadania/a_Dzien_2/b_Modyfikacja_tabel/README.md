<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Modyfikacja tabel

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików **java** przygotowanych do każdego zadania.

#### Zadanie 1 - rozwiązywane z wykładowcą

Praca na bazie `cinemas_ex`  
W pliku `Main1.java`:

1. Dodaj do tabeli `Tickets` kolumnę `priceUSD`, przechowującą cenę biletu w `USD`. ALTER TABLE Ticket ADD priceUSD DECIMAL(6,2
2. Dodaj do tabeli `Movies` kolumnę `director` typ `char(80)`, przechowującą imię i nazwisko reżysera. ALTER TABLE Movies ADD director char(80)
3. Zmień w tabeli `Movies` kolumnę `director` na typ `varchar(50)`. ALTER TABLE Movies  MODIFY COLUMN director char(50)
4. Usuń kolumnę `priceUSD` z tabeli `Tickets`. ALTER TABLE priceUSD DROP COLUMN	Tickets;
 
----------------------------------------------------------------------------- 

#### Zadanie 2

Praca na bazie `cinemas_ex`  
W pliku `Main2.java`:
Napisz następujące zapytania do bazy:

1. Dodające do tabeli `Movies` kolumnę `watchCount`, przechowującą ilość wyświetleń filmu. ALTER TABLE Movies ADD COLUMN watchCount
ALTER TABLE Movies ADD COLUMN watchCount
2. Dodające do tabeli `Movies` kolumnę `isTop`, przechowującą wartość `tinyint` (domyślnie wartość `0`) o tym czy film jest hitem.
ALTER TABLE Movies ADD COLUMN isTop default "0";
3. Aktualizujące tabelę `Movies` tak, że kolumna `isTop` ma mieć wartość `1` jeśli `watchCount > 100`, w przeciwnym wypadku `0`.
UPDATE movies SET isTop=1 WHERE watchCount > 100;
4. Dodające do tabeli `Cinemas` kolumnę `openTime`, przechowującą godzinę otwarcia. 
ALTER TABLE Cinemas ADD openTime TIME
5. Dodające do tabeli `Cinemas` kolumnę `closeTime`, przechowującą godzinę zamknięcia.
ALTER TABLE Cinemas ADD closeTime TIME 
