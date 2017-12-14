document.addEventListener("DOMContentLoaded", function(){
	var tata = document.getElementsByClassName('button');
	
	Array.prototype.forEach.call(tata, function(buttons){
		buttons.addEventListener('click',function(){
			this.parentElement.style.backgroundColor = "#" + Math.floor(Math.random()*16777215).toString(16);
		});
	});
});