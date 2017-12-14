document.addEventListener("DOMContentLoaded", function(){
var checkbox1 = document.getElementById('invoice')

function toggleInvoice(){
  var invoiceData = document.getElementById('invoiceData');

  if (checkbox1.checked){
    invoiceData.style.display = "block";
  }else{
    invoiceData.style.display = "none";
  }
}
  toggleInvoice(checkbox1);
  checkbox1.addEventListener("change", toggleInvoice);
});
