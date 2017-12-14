<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#### Zadanie 1.
Ze względu na oszczędności w pewnej firmie planowane są zwolnienia najlepiej opłacanych pracowników,
którzy nie są spokrewnieni z szefem o nazwisku **Kowalski**.

1. W pliku `Main1.java` napisz program, który wczyta dane z pliku `earnings.txt`.

2. Wyświetli listę 3 pracowników z największymi zarobkami, których nazwisko nie jest takie samo jak szefa (Kowalski).

    * Zwróć uwagę że nazwisko to może się odmieniać (Kowalski, Kowalska).
    * Zwróć uwagę na ułożenie danych w pliku, występują linie które nie zawierają płac.
    * Zwróć uwagę że ułożenie danych w pliku może się zmieniać.
    * Zwróć uwagę że kolejność danych w lini może być przestawiona.


#### Zadanie 2.

1. W pliku `Main2.java` do zmiennych **reg1**, **reg2**, **reg3**, **reg4** wpisz kolejno wyrażenia regularne, opisujące:

    * liczby zmiennoprzecinkowe (5.65 , 123.123)
    * liczby w notacji naukowej ( 5.4325e+04 ; 2.0000342E-06)
    * datę w formacie `dd/mm/yyyy`
    * datę w formacie `yyyy-mm-dd` - gdzie rok jest powyżej 2000


#### Zadanie 3

W pliku `Main3.java`

1. Napisz metodę `static boolean verifyLogin(String email)`,
która zwróci **true** jeżeli ciąg znaków:
    * Ma minimum 5 znaków.
    * Zawiera tylko litery, cyfry, znak podkreślenia, myślnik
    * Nie zaczyna się od cyfry

**false** w przeciwnym wypadku.


#### Zadanie 4
1. Utwórz projekt mavena.
2. Za pomocą pliku pom.xml dołącz do projektu bibliotekę `apache commons io`.
3. Zapoznaj się z jej możliwościami i wypróbuj wybraną z nich.
    http://commons.apache.org/proper/commons-io/

#### Zadanie 5

1. Za pomocą pliku pom.xml skonfiguruj plugin `maven-javadoc-plugin`, plugin ten służy do tworzenia różnego rodzaju archiwów zawierających nasz projekt, np. zip, jar.
2. Wykorzystamy go do utworzenia wykonywalnego archiwum jar z naszego projektu. Plik ten będzie zawierał w sobie wszystkie wymagane do uruchomienia zależności.
3. Uzupełnij plik pom o definicję pluginu:
    ```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-javadoc-plugin</artifactId>
                <version>2.10.4</version>
                <configuration>

                </configuration>
            </plugin>
        </plugins>
    </build>
    ```
4. Z konsoli lub eclipse wykonaj następującą komendę:
mvn javadoc:javadoc
5. Po poprawnym wykonaniu w folderze target otrzymamy folder site - w którym znajduje się dokumentacja z naszych klas w formacie html.
https://maven.apache.org/plugins/maven-javadoc-plugin/index.html

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
