function circle(r){
	if (typeof r !== "number")
		return false;
	
	var pi = 3.14;
	var obw = 2*pi*r;
	var pole = pi*r*r;
	return "obwód "+ obw + " pole "+ pole;
}

console.log(circle(8));