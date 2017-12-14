document.addEventListener("DOMContentLoaded", function(){
	var menu1 = document.getElementById("menu");
	var main1 = document.getElementById("main-contener");
	var pink1 = document.getElementsByClassName("pink-color")[0];
	var images1 = Array.from(document.getElementsByClassName("images"));
	var link1 = Array.from(document.getElementsByClassName("my-link"));


	function getDataInfo(element){
return Array.from(element.children).map( el => el.dataset.info);
	}
	console.log(getDataInfo(menu1));
	function getElementClass(element){
		return Array.from(element.classList);
	}
	console.log(getElementClass(main1));

	function getElementText(element){
		return element.innerHTML;
	}
	console.log(getElementText(pink1))

	function getElementAlt(element){
		return element.map(function(el){
			return el = el.getAttribute("alt");
		});
	}
	console.log(getElementAlt(images1));
	function getElementHref(element){
		xyz = element.map(function(el){
			return el.getAttribute("href");
		});
		return xyz;
	}
	console.log(getElementHref(link1))
});
