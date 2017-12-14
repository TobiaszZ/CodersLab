document.addEventListener("DOMContentLoaded", function(){
	var buttons = document.getElementsByClassName('button');
	
	Array.prototype.forEach.call(buttons, function(button){
		button.addEventListener('click',function(){
			var block = this.nextElementSibling;
			if(block !== null){
				if(block.style.display === 'none'){
					block.style.display = 'block';
				} else {
					block.style.display= 'none';
				}
				
			}
		});
	});
});