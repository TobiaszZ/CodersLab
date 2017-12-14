<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# JavaScript - Snippety
> Krótkie kawałki kodu, które pokazują zależności, rozwiązują popularne problemy oraz pokazują jak używać niektórych funkcji.

#### 1. Tworzenie obiektów na podstawie konstruktora
```JavaScript
function Animal(type) {
    this.type = type;
}

Animal.prototype.sayVoice = function(voice) {
    console.log(voice);
}

var lion = new Animal('lion');
lion.sayVoice("roar");

var pigeon = new Animal('pigeon');
pigeon.sayVoice("gru gru");
```

#### 2. Tworzenie obiektów za pomocą Object.create()

```JavaScript
var Animal = {
    type: "",
    sayVoice: function(voice) {
        console.log(voice);
    }
}

var lion = Object.create(Animal);
lion.type = "lion";
lion.sayVoice("roar");


var pigeon = Object.create(Animal);
pigeon.type = "pigeon";
pigeon.sayVoice("gru gru");
```

#### 3. setInterval & clearInterval
> Ustaw interwały / powtórzenia

```JavaScript
var id = setInterval(function() {
    console.log('jestem wywoływana co 2 sekundy');
}, 2000 );

clearInterval(id);
```

#### 4. setTimeout & clearSetTimeout
> Wykonaj kod po podanym czasie

```JavaScript
var id = setTimeout(function() {
    setOpacity(1);
}, 1000);

clearSetTimeout(id);
```

#### 5 Różne rodzaje eventów

* click
  ```JavaScript
  var button = document.getElementById('send');
  button.addEventListener('click', function(){
      console.log('hurra kliknięto');
  });
  ```

* keyup/keydown/keypress
  ```JavaScript
  var inputField = document.getElementById('name');
  inputField.addEventListener('keyup', function(){
      console.log('hurra wpisano tekst');
  });
  ```
  * `keyup` - uruchamiany kiedy puszczasz klawisz
  * `keydown` - uruchamiany kiedy klawisz jest wciśnięty
  * `keypress` - uruchamiany kiedy klawisz jest wciśnięty, ale zwraca wpisany znak ukryty pod klawiszem, a nie numer klawisza tak jak poprzednie, działa ze znakami specjalnymi  

Zobacz różnicę - http://jsfiddle.net/user2314737/543zksjc/3/show/


* mouseenter/mouseleave/mousemove/mouseover
  ```JavaScript
  var myButton = document.getElementById('myButton');
  myButton.addEventListener('mouseenter', function(){
      console.log('hurra najechano na element');
  });
  ```
  * `mouseenter` - uruchamiany raz kiedy wjeżdżasz kursorem na element, ale nie reaguje na dzieci  
  * `mouseover` - uruchamiany raz kiedy wjeżdżasz kursorem  nad element i jego dzieci  
  * `mouseleave` - uruchamiany kiedy zjedziesz kursorem z elementu  
  * `mousemove` - uruchamiany kiedy wykonujesz ruch kursorem jest nad elementem i jego dziećmi  
  
Zobacz różnicę - https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_event_mouseenter_mouseover

#### 6. Pobieranie różnych wartości z elementów z formularza
* input
  ```JavaScript
  var inputField = document.getElementById('card');
  inputField.value;
  ```

* checkbox
  ```JavaScript
  var checkboxField = document.getElementById('condition');
  checkboxField.checked;
  ```

* radiobutton
  ```JavaScript
  var radioBtn = document.getElementById('radio');
  radioBtn.checked;
  ```
* textarea
  ```JavaScript
  var msgField= document.getElementById('message');
  msgField.value;
  ```
* select & option
  * Pobranie  
  ```JavaScript
  var selectField = document.getElementById('infos');
  selectField.options[selectField.selectedIndex].value;
  ```
  * Ustawienie  
  ```JavaScript
  var selectField = document.getElementById('infos');
  selectField.options[1].selected = true;
  ```
  
#### 7. Czy możemy mieszać w jednym pliku kod JavaScript i jQuery?

Tak, jest to możliwe, poniżej przykład takiego rozwiązania.  
Dodatkowo poniżej znajdują się przykłady różnych rozwiązań z użyciem JavaScript i jQuery.

```javascript
$(function () {
    var exJS = document.querySelector('#example');//element JavaScript
    var exJQ = $('#example');//element jQuery

    exJS.innerHTML;//własność JavaScript

    exJQ.html();//metoda jQuery robiąca dokładnie to samo
    exJQ.prop('innerHTML');//inny sposób z użyciem jQuery
    //------------------------
    exJS.id;//własność JavaScript

    exJQ.attr('id');//metoda jQuery robiąca dokładnie to samo
    exJQ.prop('id');//inny sposób z użyciem jQuery
    //------------------------

    exJQ.data('year', 2012);//zadziała ale nie doda w kodzie html atrybutu a przypisze go do obiektu
    exJQ.attr('data-year', 2012);//to OK

    //------------------------
    exJS.dataset.year;//własność JavaScript

    exJQ.data('year');//metoda jQuery robiąca dokładnie to samo
    exJQ.prop('dataset').year;//inny sposób z użyciem jQuery
    exJQ.attr('data-year');//jeszcze inny sposób z użyciem jQuery
    //------------------------
    exJS.setAttribute('class','foo');//ten sposób NADPISZE aktualny atrybut z użyciem JavaScript
    exJS.classList.add('foo');//ten sposób doda klasę do już istniejących z użyciem JavaScript

    exJQ.addClass('foo');//dodanie klasy z użyciem jQuery
    exJQ.attr('class', exJQ.attr('class') + ' foo');//inny sposób z użyciem jQuery


    //------------------------
    this;//obiekt JS
    $(this);//obiekt JQ

    this.addClass('boo');//NIE WOLNO METODY JQ NA JS - tak nie możemy mieszać JS i JQ
    this.classList.add('boo');//WOLNO - tak możemy

    $(this).addClass('boo');//WOLNO - tak możemy
    $(this).classList.add('boo');//NIE WOLNO METODY JQ NA JS - tak nie możemy mieszać JS i JQ

    //------------------------
    //jak zamienić obiekt JS na JQ
    var el = document.querySelector('#form');//obiekt JS
    $(el);//tworzymy obiekt JQ poprzez otoczenie go $()
    $(el).addClass('someClass');//używamy metody jQuery
});
````

#### 8. O jakich krokach (w JavaScript) musimy pamiętać przy wyszukiwaniu elementów w DOM i modyfikacji ich? 

1. Sprawdzamy czy drzewo DOM zostało załadowane
2. Sprawdzamy czy musze uzyć selektora css czy nie musze aby znaleźć element, od tego zależy użyta metoda  
   `query...()` - selektor css, `getEleme...()` - nazwa
3. Po znalezieniu sprawdzam czy jest to tablica czy pojedynczy element
4. Iteruję po tablicy lub działam bezpośrednio na pojedynczym elemencie.

```javascript
var firstLi = document.querySelector('ul#menu > li');//pojedynczy element
//mogę na nim pracować
firstLi.classList.add('anyClass');

var buttons = document.querySelectorAll(".btn");
buttons.classList.add('anyClass');//!!!NIE WOLNO PONIEWAŻ TO TABLICA!!!
//tablica więc iteracja
for (var i = 0; i < buttons.length; i++) {
    buttons[i].classList.add('anyClass');
}
```

#### 9. Jak pobierać i ustawiać własności na elementach?

Zasadę można opisać poniższym przykładem:  

```javascript
//skladania ustawiania to 
na_czym.co = wartosc;
//skladnia pobierania
var zmienna = z_czego.co;
```

Przykład kodu:  
```javascript
var dataCourse = firstLi.dataset.course;//data-course - pobranie
var dataCourse2 = firstLi.getAttribute('data-course');//to samo w inny sposób

firstLi.dataset.price = '19.99';//data-price - ustawienie
firstLi.setAttribute('data-price', '19.99');//to samo w inny sposób

var id1 = firstLi.id;//pobranie id
var id2 = firstLi.getAttribute('id');//to samo w inny sposób

firstLi.id = 'newId';//ustawienie id
firstLi.setAttribute('id', newId);//ustawienie id

var class1 = firstLi.className;//string z klasami
var class2 = firstLi.getAttribute('class');//to samo w inny sposób
```

Należy pamiętać, że nie wszystkie własności możemy  ustawiać z użyciem `setAttribute()`, jedynie te widoczne w `html`.
