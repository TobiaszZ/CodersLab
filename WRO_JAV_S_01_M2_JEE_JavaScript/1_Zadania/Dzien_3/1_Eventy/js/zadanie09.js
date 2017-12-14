document.addEventListener("DOMContentLoaded", function () {
	
	function windowSize(){
		var windowWidth = document.getElementById('windowWidth');
		var windowHeight = document.getElementById('windowHeight');
		
			windowWidth.innerText = window.innerWidth;
			windowHeight.innerText = window.innerHeight;
		
	}
	windowSize();
	
	window.addEventListener('resize',windowSize)
});