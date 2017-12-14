<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Java Zaawansowane - Wzorce projektowe
Pamiętaj aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań.  

#### Zadanie 1 - rozwiązywane z wykładowcą.
1. Utwórz implementację klasy `AppConfig`, której zadaniem będzie przechowywanie danych konfiguracyjnych.
2. Uzupełnij odpowiednie elementy klasy tak, by spełniała wymagania wzorca Singleton.

#### Zadanie 2 - rozwiązywane z wykładowcą.
1. Utwórz interfejs o nazwie `Product`, a następnie jego implementacje w postaci klas:
    * SimpleProduct
    * AdvanceProduct
    * VirtualProduct
2. Utwórz implementację wzorca Fabryki.
     
-----------------------------------------------------------------------------

#### Zadanie 3
1. Utwórz implementację klasy `AtmApi` udostępniającą API dla bankomatów zgodnie z wzorcem Fasady.
2. Klasa ta ma umożliwiać wywołanie:
    * metody `deposit` klasy `BankAccount`
    * metody `payOut` klasy `BankAccout`
    * metody `transferMoney` klasy `Transfer`
    * metody `recharge` klasy `PhoneCard`
    * metody `getLoan` klasy `Loan`
3. Utwórz wymagane klasy oraz ich metody
    
    
#### Zadanie 4
1. Utwórz klasę `Post` dla systemu CMS oraz implementacje klas obserwatorów:  
  * FacebookObserver - klasy imitującej umieszczenie postu na portalu Facebook
  * SubscriberObserver - klasy imitującej powiadomienie subskrybentów o pojawieniu się nowego postu.
  * PublishSubscriber - klasy imitującej dodanie postu na powiązanych z naszym systemem blogach.
2. Utwórz implementację wzorca Obserwator.



**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
