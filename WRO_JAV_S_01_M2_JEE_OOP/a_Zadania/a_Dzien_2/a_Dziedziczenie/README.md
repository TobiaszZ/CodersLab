<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Dziedziczenie - zadania

#### Zadanie 1 - rozwiązywane z wykładowcą.
Stwórz klasę ```AdvancedCalculator```, która dziedziczy po klasie ```Calculator```.
Klasa powinna implementować następujące metody:

1. ```pow(num1, num2)``` &ndash; metoda ma zwracać ```num1``` do potęgi ```num2```. Dodatkowo w tablicy operacji ma zapamiętać napis: "```num1```^```num2``` equals ```result```".
2. ```root(num1, num2)``` &ndash; metoda ma wyliczyć pierwiastek ```num2``` stopnia z ```num1```. Dodatkowo w tablicy operacji ma zapamiętać napis: "root ```num2``` of ```num1``` equals ```result```".  

-----------------------------------------------------------------------------

#### Zadanie 2.

Stwórz klasę `Shape`, która ma spełniać następujące wymogi:

1. Mieć prywatne atrybuty:
`x`, `y` (określające środek tego kształtu) i `color`.
2. Posiadać konstruktor przyjmujący zmienne określające wartości `x`, `y` i `color`. 
3. Mieć metodę wypisującą informacje o tym kształcie o nazwie `getDescription()` zwracającą wartość typu `String`.
4. Mieć metodę zwracającą odległość od środka innego kształtu o nazwie `getDistance(Shape shape)` zwracającą wartość typu `double`.

Sprawdź, co się dzieje, kiedy zmieniasz dostęp do poszczególnych funkcji z publicznych na prywatne. 

Stwórz klasę `Circle`, która ma spełniać następujące wymogi:

1. Dziedziczyć po klasie definiującej kształt (`Shape`).
2. Mieć dodatkowy atrybut `radius`.
3. Mieć konstruktor przyjmujący zmienne określające wartości `x`, `y`, `color` i `radius`.
4. Nadpisywać funkcje kształtu `getDescription()`.
5. Mieć metodę zwracającą pole powierzchni o nazwie `getArea()` zwracającą wartość typu `double`. .
6. Mieć metodę zwracającą obwód o nazwie `getCircuit()` zwracającą wartość typu `double`.

Przetestuj metodę `getDistance(Shape shape)` na obiektach typu Circle.


#### Zadanie 3.
Stwórz klasę `Employee`, która ma spełniać następujące wymogi:

1. Mieć publiczne atrybuty:
 * `id` - atrybut ten powinien trzymać numer identyfikacyjny pracownika,
 * `firstName` - atrybut określający imię pracownika,
 * `lastName` - atrybut określający nazwisko pracownika,
 * `salary` - atrybut określający ile pracownik zarabia za godzinę.
2. Posiadać konstruktor przyjmujący id, imię, nazwisko i płace za godzinę.
3. Posiadać metodę `raiseSalary(percent)` której rolą będzie zwiększenie wartości atrybutu `salary` o podany procent. Pamiętaj o sprawdzeniu czy podana wartość jest:
 * Wieksza (lub równa) od 0


#### Zadanie 4.
Stwórz klasę `HourlyEmployee`, która ma reprezentować pracownika któremu pracodawca płaci za godziny. Klasa ma spełniać następujące wymogi:

1. Dziedziczyć po klasie `Employee`.
2. Mieć dodatkową metodę `computePayment(hours)` która będzie zwracała kwotę do wypłacenia pracownikowi za liczbę wypracowanych godzin. 

#### Zadanie 5.
Stwórz klasę `SalariedEmployee`, która ma reprezentować pracownika z którym pracodawca ma umowę miesięczną. Klasa ma spełniać następujące wymogi:

1. Dziedziczyć po klasie `Employee`.
2. Mieć dodatkową metodę `computePayment()` która będzie zwracała kwotę do wypłacenia pracownikowi za miesiąc (dla uproszczenia możemy założyć że w każdym miesiącu jest 190 godzin pracujących). 
