document.addEventListener("DOMContentLoaded", function() {
   function zadanie1(){
	   var listElements = document.querySelectorAll(".ex1 li ");
	   Array.prototype.forEach.call(listElements, function(el, key){
		   if (typeof el.dataset.direction === 'undefined'){
			   el.dataset.direction = "top";
		   }
		   if (key%2 == 0){
			   el.style.backgroundColor = "green"
		   }
		   if (key === 4){
			   el.classList.add("big");
		   }
		   if (key%3 == 0){
			   el.style.textDecoration = "underline";
		   }
   });
   }
   function zadanie2(){
	   var options = document.querySelectorAll(".ex2 option ");
	   Array.prototype.forEach.call(listElements, function(el){
		   var value = el.getAttribute("value");
		   el.innerText = value ;
		   el.dataSet.year = parseInt(value)+20;
	   });
   }
   function zadanie3(){
	   var ex3 = document.querySelectorAll('ex3');
	   var chrome = ex3.getElementByClassName('chrome');
	   var firefox = ex3.getElementByClassName('firefox');
	   var edge = ex3.getElementByClassName('edge');
   }
   
});
