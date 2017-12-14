function checkArray(array){
	var result = [];
	
	for(var i = 0; i<array.length; i++){
		var nieparzyste = false;
		for(var j =0; j<i.length; j++){
			if (array[i][j] % 2 !== 0){
				result[i] = false;
				break;
			}
		}
		if(!nieparzyste){
			result[i]=true;
		}
	}
	return result;
}
function print2DArray(array){
	for(var i=0; i<array.length; i++){
		for (var j=0; j<array[i].length; j++){
			console.log(array[i][j]);
		}
	}
}

function create2DArray(rows, colums){
	var k = 1;
	array=[];
	for(var i = 0; i <rows; i++){
		array[i]=[];
		for (var j = 0; j<colums; j++){
			array[i][j]
		}
	}
}

console.log(checkArray([[11,12],[42,2],[-4,-120], [0,0], [1,34]]));
console.log(print2DArray([[11,12],[42,2],[-4,-120], [0,0], [1,34]]));