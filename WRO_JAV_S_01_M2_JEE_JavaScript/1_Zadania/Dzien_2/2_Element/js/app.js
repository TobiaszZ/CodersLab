/**
 * Created by Jacek on 2016-01-11.
 */

document.addEventListener("DOMContentLoaded", function(){
    var homeElement = document.getElementById("home");
    var childElements = document.querySelector(".oferts").children;
    var banner = document.querySelector(".ban");
    var blocks = document.querySelectorAll(".block");
    var links = document.querySelector(".links").children;

    /*
    Poniżej napisz kod rozwiązujący zadania
     */
  var homeElementClass = homeElement.className;
  var homeElementID = homeElement.id;
  
  homeElement.id = homeElementClass;
  homeElement.className = homeElementID;
	
  console.log(blocks.innerHTML);
  console.log(blocks.outerHTML);
  blocks.innerHTML = "Nowa wartość diva o klasie blocks";
  
  console.log(homeElement.id);
  
  for(var i = 0; i<childElements.length;i++){
	  console.log(childElements[i].tagName);
  }
  for (var i = 0; i<links.length; i++){
	  console.log(links[i].dataset);
  }
  console.log(banner.classList);
  console.log(banner.className);
});
