function boilEgg ( sec){
	var ms = sec * 1000;
	var interval = setInterval(function(){
		console.log("Gotuje sie");
	},5000);
	
	var timeout = setTimeout(function(){
		clearInterval(interval);
		console.log("gotowe");
		},ms)
	}

//boilEgg(30);


//
//var id = setInterval(function() {
//    console.log('jestem wywoływana co dwie sekundy');
//}, 2000
//)
//
//
//clearInterval(id)

function max(){
	var arguments = Array.prototype.slice.call(arguments);
	arguments.sort(function(a,b){
		return b-a;
	});
	return arguments[0];
}

console.log(max(1,6,45,89,3,99,5));



