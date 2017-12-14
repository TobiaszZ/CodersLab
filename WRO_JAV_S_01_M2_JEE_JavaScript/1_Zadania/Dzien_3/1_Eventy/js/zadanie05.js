document.addEventListener("DOMContentLoaded", function(){
	var doc = document.getElementsByClassName("counter");
	var buttons = document.getElementById("button");

	buttons.addEventListener('click',function(e){
		var counter = parseInt(doc.innerText) + 1;
		doc.innerText = counter;
	 });

	
});
//array.prototype.forEach.call(buttons,function(button){
//	button.addEventListener("click",function(){
//		counter.innerText = parseInt(counter.innerText)+1;
//	});
//});