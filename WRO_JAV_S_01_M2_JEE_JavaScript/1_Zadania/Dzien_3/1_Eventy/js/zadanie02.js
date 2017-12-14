document.addEventListener("DOMContentLoaded", function(){
var buttons = document.getElementById("bubblingButtons").children;

for(var i=0; i<buttons.length; i++){
	

	buttons[i].addEventListener("click",function(event){
		var counter = parseInt(this.dataset.counter) + 1;
		this.dataset.counter = counter;
	});
}
});