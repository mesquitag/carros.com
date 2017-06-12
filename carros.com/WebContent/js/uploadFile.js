function uploadFile(){
	 
	var target = document.querySelector("img");
	var file = document.querySelector("input[type=file]").files[0];
 	
	var reader = new FileReader();
	
	reader.onloadend = function(){
		target.src = reader.result;
		/////-----------Upload Ajax--------------------
		$.ajax({
			method: "POST",
			url: "CadVeiculoControl",
			data: {fileUpload : reader.result}
		})
		.done(function(response){
			alert("Sucesso: " + response);
		})
		.fail(function(xhr,status,errorThrown){
			alert("Error: "+ xhr.responseText);
		});
	
	/////-------------------------------
	
	};
	
	if(file){
		reader.readAsDataURL(file);
		
	}else{
	target.src="";
	}
 }