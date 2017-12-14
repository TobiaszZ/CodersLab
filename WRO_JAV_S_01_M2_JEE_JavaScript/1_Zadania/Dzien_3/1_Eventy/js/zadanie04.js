document.addEventListener("DOMContentLoaded", function(){
	var doc = document.getElementsByClassName("counter");
	console.log(doc);
	var buttons1 = document.getElementById("button1");
	var buttons2 = document.getElementById("button2");
	var buttons3 = document.getElementById("button3");
	
	buttons1.addEventListener('click',function(e){
		var counter = parseInt(doc[0].innerText) + 1;
		doc[0].innerText = counter;
	 });
});

//Array.prototype.forEach.call(buttons,function(button,key){
//button.addEventListener("click",function(){
//counters[key].innerText = parseInt(counters[key].innerText) + 1}