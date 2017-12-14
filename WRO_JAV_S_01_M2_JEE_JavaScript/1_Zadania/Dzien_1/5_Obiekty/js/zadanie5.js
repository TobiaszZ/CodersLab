var Rectangle = function (dlugosc , szerokosc){
	this.dlugosc = dlugosc;
	this.szerokosc = szerokosc;
}

Rectangle.prototype.getArea = function() {
	return this.dlugosc * this.szerokosc;
}

Rectangle.prototype.getPerimiter = function (){
	return this.dlugosc*2 + this.szerokosc*2;
}

var test = new Rectangle(2,4);