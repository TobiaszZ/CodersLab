<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Relacje jeden do wielu

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików **java** przygotowanych do każdego zadania.

**Część zadań w swoim poleceniu ma utworzenie relacji między tabelami, w takiej sytuacji należy zmodyfikować strukturę tabel i dodać nowe kolumny lub nowe tabele.**

#### Zadanie 1 - rozwiązywane z wykładowcą
W pliku `Main1.java`:

W bazie danych o nazwie ```products_ex``` stwórz następującą tabele:
```SQL
* Opinions:
  * description: string
```

1. Tabela ```Opinions``` ma być połączona z tabelą ```Products``` relacją jeden do wielu (produkt ma wiele opinii, opinia jest przypisana do jednego produktu).
2. Napisz po `5` zapytań, które dodadzą opinie do `3` istniejących produktów.  

Create TABLE Opinions(
	id int not null auto_incremnt,
	description varchar(255),
	products_id int not null,
	PRIMARY KEY (id)
	Foreing KEY (product_id) references (products(id));
Show Tables;

Insert into opinions values (default, "stara ale jara", 6)
Insert into opinions values (default, "slaba", 6) 



-----------------------------------------------------------------------------

#### Zadanie 2
W pliku `Main2.java`:

W bazie danych o nazwie ```products_ex``` stwórz następującą tabele:
```SQL
* Categories:
  * id: int
  * name: string
* Categories_sub:
  * id: int
  * main_id: int -- relacja z id głównej kategorii
  * name: string
```
Połącz tabele `Categories` i `Categories_sub` za pomocą relacji wiele do jednego (jedna kategoria może mieć wiele podkategorii, jedna podkategoria ma jedną kategorię nadrzędną).

Create table Categories (
id int,
name varchar(255),
PRIMARY KEY (id));

Create table Categories_sub (
id int,
main_id,
name varchar(255),
Foreing KEY (main_id) references (categories(id));
// Klucz (tabela w Twojej kategorii) referencje do (odnoszącej się tabeli(i jaka wartość));


#### Zadanie 3
W pliku `Main3.java`:

Dodaj zapytania do pliku a następnie wypisz w konsoli:

1. Wszystkie tylko produkty które mają opinie oraz dostępne dla nich opinie. (nie powinny występować wartości null)
2. Pobierz wszystkie produkty razem z opiniami niezależnie od tego czy mają opinie. (mogą występować wartości null)
3. Pobierz wszystkie opinie dla produktu o id 1, wynik ma zawierać również wszystkie dane dotyczące produktu.

#### Zadanie 4
W pliku `Main4.java`:

Dodaj zapytania do pliku a następnie wypisz w konsoli:

1. Za pomocą odpowiedniego złączenia pobierz wszystkie podkategorie kategorii o id 1.
2. Pobierz id oraz nazwę kategorii - tylko tych które mają podkategorie. (skorzystaj z `DISTINCT`).
select product name opinions.desctiption from product

USUWANIE POWTÓRZEŃ !!Odrazu po selekcie 






select distinct przed listą kolumn 

