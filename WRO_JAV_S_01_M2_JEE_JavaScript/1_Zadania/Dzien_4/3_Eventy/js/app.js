$(function(){
  function task1(){
    var button1 = $('.ironMan-btw');
    var button2 = $('.thor-btw');
    var button3 = $('.wolverine-btw');

button1.on("click", function(){
  console.log("klik");
});
button2.one("click", function(){
  console.log("klik ale raz");
});

button3.off("click", function(){
  button1.off("click");
  button2.off("click");
});
  }
function task(){
var baton = $('.superhero-description');
baton.find('dd').hide();

baton.find('dt').on("click" function(){
  $(this).next('dd').slideToggle('slow');
  }):
});




});
