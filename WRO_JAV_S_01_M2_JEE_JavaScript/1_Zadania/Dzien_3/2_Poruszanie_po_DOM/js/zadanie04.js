document.addEventListener("DOMContentLoaded", function(){
	
	var first = document.getElementsByClassName('first')[0];
	var firstChild = first.firstElementChild;
	var thirdChild = firstChild.children[2];
	
	var second = document.getElementsById('second');
	var parent = second.parentElement;
	var fourChild = second.children[3];
	
	var third = document.querySelector('[data-ex=third]');
	var grandpa = third.parentElement.parentElement;
	
});