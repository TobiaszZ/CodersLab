function distFromAvarage(array){
	var sum = 0;
	var sre = 0;
	for (var i=0; i<array.length; i++){
		sum += array[i] ;
	}
	sre = sum/array.length;
	
	var roz=[];
	for(var i = 0; i<array.length; i++){
		roz = array[i] - sre;
		if(roz<0) roz *= -1;
		console.log(roz);
	}
	
}
console.log(distFromAvarage([1,2,3,4,5]));