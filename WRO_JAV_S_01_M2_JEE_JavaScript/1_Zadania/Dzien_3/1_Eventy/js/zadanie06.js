document.addEventListener("DOMContentLoaded", function(){
	var boxes = document.getElementsByClassName('box');
	
	Array.prototype.forEach.call(boxes, function(box){
		
		box.addEventListener('click', function(){
			
			this.style.backgroundColor = "#" + Math.floor(Math.random()*16777215).toString(16);
		});
	});
});