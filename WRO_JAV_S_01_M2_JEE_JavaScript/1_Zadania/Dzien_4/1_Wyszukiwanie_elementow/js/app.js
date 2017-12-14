//$(document).ready(function){});
$(function(){
  var li = $('section.main').find('li');
  var showMore = $('.showMore');

  li.addClass ('borderClass');
  showMore.first().css('color', 'red');
//Zadanie 3
  li.addClass('colorText backgroundElement');
  li.fadeOut('slow');
  li.fadeIn('fast')
  //Zadanie 4
 $('a').css('color','red');
  // link.css("color", "red");
   $('.menu').find('li').css('color',	'red');
    $('.menu').find('li').addClass('redLinks');
   $('.menu').find('li').first().addClass('bigger');
   //Zadanie 5
  if($('.h1').hasClass('creepyHeader')){
    consol.log("mam")
  } else{
    $('h1').addClass('creepyHeader');
  }

});
