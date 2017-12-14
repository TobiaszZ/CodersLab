$(function(){

    var textarea = $('#text');
    var counter = $('#counter');

    function countChar ( element){
      counter.text(textarea.val().length+1);
      if(textarea.val().length<33){
        $('#counter').css('color', 'green')
      }else if (textarea.val().length>33 && textarea.val().length<66 ) {
        $('#counter').css('color', 'yellow')
      }else if (textarea.val().length>66 && textarea.val().length<100){
        $('#counter').css('color', 'red')
      }

  }
  textarea.on('keypress keyup' , function (){
    countChar($(this));
    if(textarea.val().length === 99){
      return false;
    }
  });
});
