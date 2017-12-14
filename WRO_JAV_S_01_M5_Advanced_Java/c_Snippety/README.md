<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java Podstawy - Snippety
> Krótkie kawałki kodu, które pokazują zależności, rozwiązują popularne problemy oraz pokazują jak używać niektórych funkcji.

#### Podstawowe znaczenie wyrażeń regularnych

|      Wyrażenie      |                        Znaczenie                       |
|:-------------------:|:------------------------------------------------------:|
|         foo         |                      string "foo"                      |
|         ^foo        |                "foo" na początku strniga               |
|        ^foo$        |              "foo" zajmuje całość stringa              |
|        [abc]        |                       a, b, lub c                      |
|        [a-z]        |                    każda mała litera                   |
|        [^A-Z]       |            każda litera, która nie jest duża           |
|      (gif|jpg)      |                    "gif" lub "jpeg"                    |
|        [a-z]+       |              jedna lub więcej mała litera              |
|      [0-9\.\-]      |           każda cyfra, kropka lub znak minus           |
|  ^[a-zA-Z0-9]{1,}$  | każdy wyraz, który ma minimum jedną  literę lub liczbę |
|     ([wx])([yz])    |                   wy, wz, xy, lub xz                   |
|     [^A-Za-z0-9]    |         każdy symbol z wyłączeniem liter i cyfr        |
| ([A-Z]{3}|[0-9]{4}) |              trzy litery lub cztery cyfry              |

#### Klasy abstrakcyjne, interfejsy

  * Aby zdefiniować metodę abstrakcyjną używamy słowa kluczowego **abstract**.
  * Klasa jest abstrakcyjna jeżeli posiada przynajmniej jedną metodę abstrakcyjną.
  * Aby zdefiniować interfejs używamy słowa kluczowego **interface** .
  * Z klas abstrakcyjnych nie można tworzyć obiektów.
  * Metody interfejsów są domyślnie abstrakcyjne i publiczne.
  * Pola interfejsów są domyślnie statyczne i finalne.
  * Klasa może implementować wiele interfejsów.
  
#### Przykład definicji interfejsu
````java
public interface Vehicle {
    public void drive();
    public void stop();
}  
````

#### Przykład klasy implementującej interfejs

````java
public class Bike implements Vehicle{
 
    @Override
    public void drive() { }
 
    @Override
    public void stop() { }
 
 
}  
````

#### Przykład metody domyślnej interfejsu (Java 8)
````java
public default int getPriority(){
    return 0;
} 
````

#### Przykład definicji klasy abstrakcyjnej

````java
public abstract class Vehicle {
 
	public void go() {
		this.startEngine();
	}
 
	public void stop() {
		this.stopEngine();
	}
 
	abstract void startEngine();
	abstract void stopEngine();
}
````
