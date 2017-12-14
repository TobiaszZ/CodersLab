String.prototype.apperLower = function(){
	var result = "";
	var k = 1;
	
	for(var i = 0; i < this.length; i++){
		if (this[i] !=" "){
			k++;
		if(k%2 === 0){
			result += this[i].toUpperCase();
		}else{
			result += this[i].toLowerCase();
		}
		}else{
			result+= " ";
			}
		}
	
	return result
};

console.log("Jaja".apperLower());



//Zadanie 2
var Car = function (color,type){
	this.color = color;
	this.type = type;
	this.km = 0;
}
Car.prototype.printCarInfo = function(){
	console.log(this.type + this.color + this.km);
}
Car.prototype.drive = function(km){
	this.km += km;
}
var seat=new Car("white", "leon");
seat.drive(30);
seat.printCarInfo();





