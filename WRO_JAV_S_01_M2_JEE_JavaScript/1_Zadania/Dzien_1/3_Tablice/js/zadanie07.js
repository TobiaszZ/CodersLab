function getMissingElement(array){
	
	var missing = false;
	
	for(var i =0; i<array.length; i++){
		
		if( (array[i+1] !== array[i] + 1) && (i+1 <array.length) ){
			console.log(array[i]+1);
			missing = true;
		}	
	}
	if(!missing)
		console.log(null);
}

console.log(getMissingElement([1,2,3,4,5,7]));