document.addEventListener("DOMContentLoaded", function(){
	var baton = document.getElementById("remove");
	
	baton.addEventListener('click', function(){
		baton.parentElement.removeChild(baton);
	});
	
});