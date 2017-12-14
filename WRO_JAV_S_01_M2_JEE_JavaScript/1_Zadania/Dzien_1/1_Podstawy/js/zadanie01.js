function mathInfo() {
    var randomNumber = Math.floor(Math.random() * 100);
    //Parzysta vs nieparzysta
    if (randomNumber%2==0){
    	console.log(randomNumber + " Liczba Parzysta");
    	
    } else {
    	console.log(randomNumber +  " Liczba Nieparzysta");
    }
    
    //dzielniki liczby
    var result = "";
    for(var i=1; i <= (randomNumber/2); i++){
    	if(randomNumber%i==0){
    		result = result + i + ", ";
    	}
    }
    console.log(result);
    
    //wynik potegowania
    var reszta = randomNumber % 5;
    console.log(Math.pow(randomNumber,reszta));
    
}

//to wywołanie ma spowodować wyświetlenie w konsoli informacji z zadania
mathInfo();
