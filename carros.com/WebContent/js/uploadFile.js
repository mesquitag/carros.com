function uploadFile(){
	 
	var target = document.querySelector("img");
	var file = document.querySelector("input[type=file]").files[0];
 	
	var reader = new FileReader();
	reader.onloadend = function(){
		target.src = reader.result;
	};
	
	if(file){
		reader.readAsDataURL(file);
	}else{
	target.src="";
	}
 }