
$(function() {
	  var availableTags = [
		  "Agrale","Aston Martin","Audi","Bentley","BMW","Changan","GM/Chevrolet",
		  "Chrysler", "Dodge","Fiat","Honda", "Hyundai", "Jac Motors", "Jaguar","Jeep",
		  "Jinbei", "Lamborghini", "Mahindra", "Ghibli", "Mercedes-Benz","MG Motors",
		  "Mitsubishi","Nissan","Peugeot","Porsche","Ram","Smart", "Subaru", "Toyota", ""
	  ];
	  
	  $("#marca").autocomplete({
	    source: availableTags
	  });
	});