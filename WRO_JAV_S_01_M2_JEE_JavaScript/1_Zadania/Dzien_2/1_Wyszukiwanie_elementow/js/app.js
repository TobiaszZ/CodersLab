//Co oznaca poniższy kod dowiecie się w dalszej części modułu
document.addEventListener("DOMContentLoaded", function(){
function zadanie1(){
	var article = document.querySelector("article.first");
	var h1 = article.getElementsByTagName("h1"); //wyswietlenie ile jest nagłówków w tym html 
	var oferts = article.getElementsByClassName("oferts"); // pobranie wszystkich elementów
	for(var i = 0; i<oferts.length; i++){
		console.log(oferts[i]);
	}
	var div = article.getElementsByTagName("div");
	for(var i = 0; i<div.length; i++){
		console.log(div[i]);
	}
}
function zadanie2(){
	var element = document.querySelector("nav > ul > li:nth-child(5)");
}
function zadanie3(){
	
	var	id	= document.getElementById("home");
	var id1 = document.querySelector("#home");
	var li = document.querySelector("li:not([data-direction])");
	var block = document.querySelector("block");

}
function zadanie4(){
	var li = document.querySelectorAll("nav li");
	var p = document.querySelectorAll("div p")
	var div = document.querySelectorAll("article div")
}
});