document.addEventListener("DOMContentLoaded", function(){
	var button = document.querySelector('a.button');
	var list = document.querySelector('ul.menu');
	
	button.addEventListener('click', function(){
		var countList = list.children.length;
		var element = document.createElement('li');
		
		element.innerText = (countList + 1)
		list.appendChild(element);
	});
	
});