document.addEventListener("DOMContentLoaded", function(){
	var addButton = document.getElementById('addBtn');
	var table = document.getElementById('#orders tbody');
	
	addButton.addEventListener('click',function(){
		var orderId = document.getElementById('orderId').value;// wartośc która bedzie podawana w tabeli
		var item = document.getElementById('item').value;
		var quantity = document.getElementById('quantity').value;
		
	var row = table.lastElementChild.cloneNode(true);
	row.children[0].innerText = orderId;
	row.children[1].innerText = item;
	row.children[2].innerText = quantity;
	
	ordersTable.appendChild(row);
	});
});