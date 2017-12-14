document.addEventListener("DOMContentLoaded", function(e) {
 var link = document.getElementsByTagName('a')[0];
  link.addEventListener('click', function(){
     var content = document.getElementsByClassName('content')[0];
     content.style.display="block";
 });

 var link2 = document.getElementsByTagName('a')[1];
  link2.addEventListener('mouseover', function(){
     var content = document.getElementsByClassName('content')[1];
     content.style.display="block";
  });


})
