$(function(){
//Zadanie 1

var task1_1 = $('span[data-task="_task1"]');

var task1_2 = task1_1.prevAll('p').first();

var task1_3 = task1_2.closest('section');

var task1_4 = task1_3.next();

var task1_5 = task1_4.find('.container');
task1_5.css( 'background-color', 'green' ).addClass( 'answerTask1' );

setTimeout(function(){
    task1_5.slideUp('slow');
}, 4000);

//Zadanie 2
var task2_1 = $('span[data-task="_task2"]');
var task2_2 = task2_1.parent().prev();
var task2_3 = task2_2.children('div').eq(1);
var task2_4 = taks2_3.find('button');
var task2_5 = task2_4.closest('.cart-item');
task2_5.addClass('cart-updated');

});
