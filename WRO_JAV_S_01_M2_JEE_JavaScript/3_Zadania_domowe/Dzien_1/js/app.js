
function getNumber(liczba,tablica){
	var sprawdz = false;
	for (var i = 0; i<tablica.length; i++){
		if(liczba===tablica[i])sprawdz=true;
		return sprawdz;
	}
}
getNumber(2, [33, 54, 2, 1, 4, 100]);
getNumber(5, [33, 54, 2, 1, 4, 100]);

function createIdentiMatrix(rows,columns){
	var tab = [];
	for(var i=0; i<rows; i++){
			 tab[i]=[];
				for(var j=0; j<columns; j++){
					if(i!=j)tab[i][j]=0;
					else tab[i][j]=1;
		}
	}
	return tab;
}
console.log(getNumber(2, [33, 54, 2, 1, 4, 100]));
console.log(getNumber(5, [33, 54, 2, 1, 4, 100]));


var tree=function(type){
	this.type = type;	
}
	bloom = function(){
		console.log("I'am blooming");
	}
var jeden = new tree ("Sosenka");
	jeden.bloom;
var dwa = new tree ("Dąb");
	dwa.bloom;	
var trzy = new tree ("Kasztan");
	trzy.bloom;
	
console.log(jeden.hasOwnProperty(bloom));
console.log(dwa.hasOwnProperty(bloom));
console.log(trzy.hasOwnProperty(bloom));

function addTheSameNumbers(liczba,tablica){
	var sum = null;
	for(var i = 0; i<tablica.length;i++){
		if (tablica[i]===liczba)sum+=liczba;
	}
	return sum;
}



