function factors(liczba){
	var pusta =[];

	if(liczba <=0){
		return pusta;	
	}
	
	for(var i=1; i <= (liczba); i++){
    	if(liczba%i==0){
    		pusta = pusta + i + ", ";
    	}
    }
	return pusta;
}
console.log(factors(100));