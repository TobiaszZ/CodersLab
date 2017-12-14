document.addEventListener("DOMContentLoaded", function(){

	var listContainer = document.getElemtsByClassName('listContainer');

	Array.prototype.forEach.call(listContainer, function(e){
	
		e.addEvenListener('mouseover', function(event){
			this.classList.add('hovered');
		}
	
		var li = this.getElementsByTagName('li');
	
	Array.prototype.forEach.call(v,k){
		if (k === 0){
			v.style.backgroundColor = "red";
		}else if ( k === li.length-1){
			v.style.backgroundColor = "blue"
		}else{
			v.style.backgroundColor = "green"
		}	
		}
});
});
});
});