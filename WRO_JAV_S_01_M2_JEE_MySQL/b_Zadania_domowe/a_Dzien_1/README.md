<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# MySQL - zadania domowe
> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach. Zapytania do bazy powinny być przypisane do przygotowanych do tego zmiennych.

>Zadania z dopiskiem "dodatkowe" są dla chętnych

**WAŻNE -  nie zmieniaj struktury/nazw plików oraz korzystaj z przygotowanych zmiennych**
 
#### Przygotowanie i informacje
W pliku `dump.sql` znajduje się przygotowany zrzut 2 tabel z bazy danych wypełniony już gotowymi danymi na których będziesz pracować, zaimportuj go do swojej bazy.

Struktura oraz znaczenie poszczególnych kolumn w tabeli.  

Tabela `users`:
* `id` - id użytkownika
* `name` - nazwa użytkownika
* `email` - mail użytkownika
* `password` - hasło użytkownika (hash sha-256)
* `salt` - "sól" użyta do generowania hasła użytkownika

Tabela `offers`:
* `id` - id oferty
* `owner` - id użytkownika, relacja z tabelą `users`
* `status` - status oferty - 0 - weryfikacja, 1 - aktywne, 2 - odrzucone
* `price` - cena oferty
* `promoted` - 0/1 - czy oferta jest promowana
* `title` - tytuł oferty
* `description` - opis oferty
* `phone` - telefon do oferty
* `expire` - czas wygaśnięcia oferty - jeśli w przeszłości oferta nie aktywna
* `promoted_to` - czas promowania oferty - jeśli w przeszłości oferta nie promowana
* `activation_token` - token do aktywacji oferty


------------------+------------------+------+-----+---------------------+----------------+
| Field            | Type             | Null | Key | Default             | Extra          |
+------------------+------------------+------+-----+---------------------+----------------+
| id               | int(10) unsigned | NO   | PRI | NULL                | auto_increment |
| owner            | int(10) unsigned | NO   | MUL | NULL                |                |
| status           | tinyint(4)       | NO   |     | 0                   |                |
| price            | decimal(11,2)    | NO   |     | NULL                |                |
| promoted         | tinyint(4)       | NO   |     | NULL                |                |
| title            | varchar(65)      | NO   |     | NULL                |                |
| description      | varchar(5000)    | NO   |     | NULL                |                |
| phone            | varchar(20)      | NO   |     | NULL                |                |
| expire           | timestamp        | NO   |     | 0000-00-00 00:00:00 |                |
| promoted_to      | timestamp        | NO   |     | 0000-00-00 00:00:00 |                |
| activation_token | varchar(36)      | NO   |     | NULL                |                |
+------------------+------------------+------+-----+---------------------+----------------+


#### Zadanie 1
W pliku `Main1.java`:
są przygotowane zmienne, do których zapisz zapytania `SQL`, które:

1. Zwrócą użytkowników których imię to `Julia`. 
SELECT * FROM users WHERE name like "Julia%";
 
2. Zwrócą listę 5 użytkowników, po posortowaniu ich wg. maila malejąco.
SELECT * FROM users ORDER BY name DESC LIMIT 5;

3. Zwrócą listę użytkowników, których email jest w domenie `@yahoo.com` oraz imię rozpoczyna się na `L`.
SELECT * FROM users WHERE email like "%@yahoo.com" AND name LIKE "L%";

4. Zwrócą listę użytkowników, których `SHA2(name.salt)` jest zgodne z kolumną `password` - hint [SHA2()][mysql_sha2], [CONCAT()][mysql_concat].
SELECT * FROM users WHERE (SHA2(CONCAT(name, '.', salt), 256))=password"

5. Zwrócą listę **id** i **tytułów** ofert z ceną większą niż `500000`.
 SELECT id,title FROM offers WHERE price > 500000 

6. Zwrócą listę **id** i **cenę** ofert, które nie posiadają tokena aktywacyjnego oraz posiadają cenę pomiędzy `2000` a `400000` - hint [BETWEEN()][mysql_between].
SELECT id, price FROM offers WHERE price BETWEEN (2000 AND 400000) AND activation_token=0;

7. Zwrócą listę **tytuł**, **cena** i **telefon** ofert, które kończą się w ciągu `10` dni i są aktywne (**których data ważności jest większa niż aktualny czas**) - hint [DATE_ADD()][mysql_date_add], [CURRENT_TIMESTAMP()][mysql_current_timestamp], [FROM_UNIXTIME()][mysql_from_unixtime] .
!!! SELECT title,price,phone FROM offers 

8. Zwrócą listę ofert, których opis zawiera `violent`, telefon zawiera cyfrę `2` i cena jest wyższa niż `50000`.
SELECT * FROM offers WHERE description like "%violent%" and phone like "%2%" and price >50000;

9. Zwrócą listę ofert, które **nie są** promowane a ich cena jest mniejsza niż `300000` oraz tytuł **kończy się** na `LLC`.
SELECT * FROM offers WHERE promoted_to = 0 and price < 300000 and title like "%LLC";
10. Zwiększą cenę o `1000` w ofertach, których właściciel ma `id` pomiędzy `20` a `25`.
UPDATE offers SET price=price+1000 WHERE id BETWEEN 20 AND 25;

11. Usuną oferty, który wygasły więcej lub równo `3` dni temu, przykładowo aktualna data to `2016-11-05 12:45:03`, ma usunąć starsze niż `2016-11-02 12:45:03` - hint [DATE_ADD()][mysql_date_add], [NOW()][mysql_now].
DELETE offers WHERE expire <= (DATE_ADD(NOW() INTERVAL 3 DAY));

12. Usuną oferty, których numer telefonu rozpoczyna się od `+48` i są promowane oraz aktywne (**których data ważności jest większa niż aktualny czas** i mają odpowiedni status).
DELETE offers WHERE phone LIKE "+48%" and expire>Now() AND promoted_to=1 AND status=1;

13. Zmienią status promowania na `1` i dodadzą koniec promowania za `23` dni dla ofert, których `3` i `4` cyfra telefonu to `48` oraz nie są aktualnie promowane - hint [SUBSTRING()][mysql_substring].
UPDATE offers SET promoted=1 AND expire=(DATE_ADD(expire, INTERVAL 23 DAY)) WHERE SUBSTRING(phone, 4)LIKE '%48' AND promoted=0;

14. Zwrócą oferty, których cena pomnożona przez `2` jest mniejsza od `50000` oraz oferta jest promowana (**data końca promowania jest w przyszłości**).
SELECT * FROM WHERE offers price*2>50000 and promoted_to>now();

15. Zmienią w opisach ofert słowo `executed` na `founded` ale tylko tych gdzie telefon posiada `(` lub `)` i cena jest większa niż `400000`.
UPDATE offers SET description <= (REPLACE(description,executed, founded)) AND (phone LIKE '%(%' OR phone LIKE '%)%') AND price>400000;

16. Zwrócą ilość ofert aktywnych (**których data ważności jest większa niż aktualny czas** i mają odpowiedni status) jako alias `sum_active` - hint [COUNT()][mysql_count].

    ```
    Przykład
    +------------+
    | sum_active |
    +------------+
    |         59 |
    +------------+
    ```

17. **dodatkowe** Zwrócą ilość aktywnych (**których data ważności jest większa niż aktualny czas** i mają odpowiedni status) ofert jako alias `sum_user`, posiadanych przez użytkownika, zwrócona lista ma zawierać wszystkich użytkowników - hint `GROUP BY`, `WHERE`, `COUNT()`.

    ```
    Przykład
    +-------+----------+
    | owner | sum_user |
    +-------+----------+
    |     2 |        9 |
    |     3 |       21 |
    |     5 |        1 |
    |    10 |        1 |
    |   ... |      ... |
    |    13 |        2 |
    +-------|----------|
    ```

18. **dodatkowe** Zwrócą ilość ofert **tylko aktywnych i odrzuconych** zwróconych jako kolumny `type` oraz `counter`, powinno zwrócić 2 rekordy. 
    
    ```
    Przykład
    +------+---------+
    | type | counter |
    +------+---------+
    |    1 |      14 |
    |    2 |      42 |
    +------+---------+
    ```

19. **dodatkowe** Zwrócą **sumę** cen ofert nie aktywnych (**których czas ważności minął** a były aktywne (`status=1`)) jako alias `sum_nonactive_nopromoted`, które nie były promowane - hint [SUM()][mysql_sum].
20. **dodatkowe** Zwrócą średnią cenę oferty jako `avg_price` zaokrąglone do `2` miejsc po przecinku, biorąc pod uwagę oferty aktywne (**których data ważności jest większa niż aktualny czas**) i **promowane** z ceną ponad `44645.04` - hint [AVG()][mysql_avg], [ROUND()][mysql_round].

    ```
    Przykład
    +-----------+
    | avg_price |
    +-----------+
    | 523168.97 |
    +-----------+
    ```

#### Zadanie 2
W pliku `Main2.java`:  
Zapytania tworzące tabele zapisz do odpowiednich zmiennych w `java`.  

W bazie danych stwórz następujące tabele:
```SQL
* images:
  * id: int unsigned auto_increment primary key
  * offer_id: int unsigned
  * src: varchar(100) (link do zdjęcia)
  * dimension: varchar(10) (np. 400x832)
* users_companies:
  * id: int unsigned auto_increment primary key
  * user_id: int unsigned unique
  * name: varchar(30)
  * nip: int
  * street: varchar(50)
  * street_nr: mediumint
  * phone: char(9)
  * post_code: char(6)
  * capital: decimal(7,2)
  * rate: decimal(5,4)
  * created_at: datetime
```

#### Zadanie 3
W pliku `Main3.java`:  

1. Napisz zapytania dodające po 5 rekordów do każdej z tabeli utworzonej w poprzednim zadaniu.  


<!-- Links -->
[mysql_concat]: https://dev.mysql.com/doc/refman/5.7/en/string-functions.html#function_concat
[mysql_sha2]: https://dev.mysql.com/doc/refman/5.6/en/encryption-functions.html#function_sha2
[mysql_between]: https://dev.mysql.com/doc/refman/5.7/en/comparison-operators.html#operator_between
[mysql_sum]: https://dev.mysql.com/doc/refman/5.7/en/group-by-functions.html#function_sum
[mysql_substring]: https://dev.mysql.com/doc/refman/5.7/en/string-functions.html#function_substring
[mysql_count]: https://dev.mysql.com/doc/refman/5.7/en/counting-rows.html
[mysql_avg]: https://dev.mysql.com/doc/refman/5.7/en/group-by-functions.html#function_avg
[mysql_round]: https://dev.mysql.com/doc/refman/5.7/en/mathematical-functions.html#function_round
[mysql_date_add]: https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html#function_date-add
[mysql_current_timestamp]: https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html#function_current-timestamp
[mysql_from_unixtime]: https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html#function_from-unixtime
[mysql_now]: https://dev.mysql.com/doc/refman/5.6/en/date-and-time-functions.html#function_now
[stack_mysql_domain]: http://stackoverflow.com/a/2440458/3668159
