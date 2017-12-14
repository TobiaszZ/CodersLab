document.addEventListener("DOMContentLoaded", function(){
//Walidacja karty

function validateCard(){
  var card = document.getElementById('card');
  var type = document.getElementById('type');

  card.addEventListener('keyup',function
    var count = card.value.length;
    if(count>0){
      //Visa
      if(card.value[0]==4){
        type.innerText = 'Visa';

        if(count != 16){
          type.innerText = "Zły format karty "

        }
      } //MasterCard
      else if (card.value[0]==5){
        type.innerText = 'MasterCard';
      } // AmericanExpress
      else if (card.value[0] ==3)&&(card.value[1]==4 || card.value[1]==7) {
        type.innerText = "AmericanExpress";
      }
      else {
        type.innerText = "Karta nieobsługiwana";
      }
      else {
        type.innerText = '';
      }
    }
  });
}

});
