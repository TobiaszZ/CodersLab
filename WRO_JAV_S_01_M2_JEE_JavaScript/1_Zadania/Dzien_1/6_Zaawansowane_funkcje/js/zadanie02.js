/**
 * Zagnieżdżanie funkcji.
 * Prześledź krok po kroku każdą linijkę kodu. Każdą!
 * Spróbuj napisać komentarze dla każdej z linijek kodu
 */


//Stworzenie funkcji jeden która nie przyjmuje żadnych parametrów 
function jeden() {

    //Stworzenie zmiennej która przyjmuje wartość jeden
    var zmienna1 = 1;

    //Stworzenie funcjji w funkcji 
    function dwa() {

        //Wyswietli 1
        console.log(zmienna1);

      //  Stworzenie kolejnej zmiennej 
        var zmienna2 = 3;
    }

    // Wyswietli jeden
    dwa();

    //Wyswietli 3
    console.log(zmienna2)
}

//Twój komentarz ...
jeden()