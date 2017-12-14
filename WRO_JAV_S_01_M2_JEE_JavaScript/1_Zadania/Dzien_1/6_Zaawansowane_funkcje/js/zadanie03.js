/**
 * Funkcje wyższego rzędu.
 * Prześledź krok po kroku każdą linijkę kodu. Każdą!
 * Spróbuj napisać komentarze dla każdej z linijek kodu
 */

//Tworzenie funckji 
function sortArray() {

    //tablica ze zmiennymi
    var points = [41, 3, 6, 1, 114, 54, 64];

    //sortowanie wzgledem funkcji 
    points.sort(function(a, b) {
        //rodzaj sortowania
        return a-b;
    });

    //posortowae
    return points;
}

//funckja ktora bedzie sortowała 
sortArray();
