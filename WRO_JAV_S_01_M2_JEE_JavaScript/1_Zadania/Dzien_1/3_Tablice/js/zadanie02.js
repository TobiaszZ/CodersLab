function add(array){
	var result=0;

	for(var i=0; i < array.length; i++){
		result += array[i]
	}
	return result;
}

function multiply(array){
	var result=1;

	for(var i=0; i < array.length; i++){
		result *= array[i]
	}
	return result;
}
console.log("Suma liczb" + add([1,2,3,4,5,6,7,8,9,10]));
console.log("iloczyn" + multiply([1,2,3,4,5]));