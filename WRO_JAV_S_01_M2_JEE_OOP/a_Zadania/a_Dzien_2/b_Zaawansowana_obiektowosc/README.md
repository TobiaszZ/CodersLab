<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Zaawansowana obiektowość - Zadania.

#### Zadanie 1 - zadanie rozwiązywane z wykładowcą
Do klasy ```AdvancedCalculator``` dopisz:

 1. Stałą  ```PI```, która będzie miała przypisaną wartość **3.14159265**.
 2. Statyczną metodę ```computeCircleRadius(r)``` , która będzie zwracała pole koła. Ta metoda nie będzie dopisywać obliczeń do tablicy (napisz w komentarzu, dlaczego nie może tego robić).
 3. Statyczną tablicę, która będzie przechowywała historię operacji wykonanych na wszystkich kalkulatorach.
 4. Statyczną metodę `printGlobalOperations()`, która będzie wyświetlać wszystkie operacje ze wszystkich obiektów klasy `Calculator`.

-----------------------------------------------------------------------------

#### Zadanie 2.
Do klasy ```AdvancedCalculator``` dopisz:

1. Przeciążoną metodę `printGlobalOperations(int length)`, która wyświetli określoną ilość ostatnich operacji.
2. Przeciążoną metodę `printGlobalOperations(String length)`, która wyświetli określoną ilość ostatnich operacji.
Wykonaj rzutowanie wartości typu `String`. Napisz obsługę odpowiedniego wyjątku.


#### Zadanie 3

Napiszemy podstawę obiektowego programu, który będzie wspomagać skanowanie produktów w sklepie.

Stwórz klasę `Product`. Klasa ta ma posiadać podane atrybuty:
  * `id` - liczba całkowita. Powinna być unikalna w całym systemie (jak to osiągnąć będzie wyłumaczone w dalszej części zadania).
  * `name` - String. Jest to nazwa danego produktu.
  * `description` - String. Jest to opis danego produktu.
  * `price` - double. Jest to cena za jeden produkt. Powinna być większa od `0.01`. Sprawdź ten warunek w własnoręcznie utworzonym setterze. Jeśli warunek nie będzie spełniony - zostaw starą wartość lub null (jeżeli była pusta).
  * `quantity` - liczba całkowita większa od zera.


Klasa powinna mieć nastepujące elementy:
  * konstruktor - powinien przyjmować opis, cenę i ilość produtku.
  * atrybut id powiniem mieć możliwość wyłącznie odczytu.
  * metodę ```getTotalSum()``` która będzie zwracała łączną kwotę za dany produkt (wyliczaną jako ilość * cena produktu).

####Generowanie kolejnego id dla produktu:
W dalszej części programu będziemy chcieli identyfikować nasze produkty po ich id.
Dlatego musimy zagwarantować że każdy z stworzonych produktów będzie miał unikalny numer identyfikacyjny.
W tym celu powinniśmy zdefiniować zmienną klasową ```nextId```.

Zmienna ta będzie trzymała id ktore zostanie nadane następnemu stworzonemu produktowi. Nastepnie w konstruktorze klasy musimy wykonać następujące czynności:
  * właśnie tworzonemu produktowi przypisać id trzymane w zmiennej `nextId`,
  * zwiększyć wartość  `nextId` o jeden.

```
//w konstruktorze
    this.id = nextId;
    this.nextId++;

```

Dzięki temu żaden z naszych produktów nie będzie miał takiego samego id.

### Zadanie 4

1. Napisz klasę `ShoppingCart`. Klasa ta ma posiadać następujące atrybuty:
  * `products` - tablica z obiektami klasy `Product`.

Do tej zmiennej nie powinno być ustawionych getterów, ani setterów.

 Klasa powinna mieć też nastepujące metody:
 
  * `addProduct(Product newProduct)` - metoda ta powinna dodawać nowy produkt do tablicy z produktami. Kluczem produktu powinno być jego id (dzięki temu będziemy mogli łatwo znaleźć produkt w naszym koszyku). Jeżeli dodawany obiekt nie jest produktem, rzuć wyjątek ArgumentError. Przy dodawaniu drugiego egzemplarza produktu pamiętaj o zwiększaniu jego ilości.
  * `removeProduct(int productId)` - metoda ta powinna usuwać wszystkie sztuki produktu z koszyka. Jeśli taki produkt nie był wcześniej zeskanowany, to ma nic nie robić.
  * `changeProductQuantity(int productId, int newQuantity)` - metoda ta powinna zmianiać ilość danego produktu w koszyku. Jeśli taki produkt nie był wcześniej zeskanowany, to ma nic nie robić.
  * `printReceipt()` - metoda drukująca paragon. Na paragonie powinno się znaleźć: lista wszystkich produktów, wraz z ich id, nazwą, ceną, ilością i łączną ceną (pamiętaj że masz do tego dedykowaną metodę w klasie `Product`) i łączna kwota za wszystkie produkty znajdujące się w koszyku. Zwracaj ciąg znaków w postaci:

```
1: Produkt 1, 2x2.5 = 5.0
2: Produkt 2, 3x12.0 = 28.8
3: Produkt 3, 1x1 = 1
---
Razem: 38.8
```

2. Zmodyfikuj klasę produktu tak, żeby umożliwiała nadawanie rabatu. Jeżeli ilość danego produktu jest większa lub równa 3 to metoda ```get_total_sum()``` powinna nadawać 20% zniżki na łączną kwotę za te produkty.
