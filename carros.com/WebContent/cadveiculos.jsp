<jsp:include page="menuadm.jsp" />
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="container">

	<!-- Main component for a primary marketing message or call to action -->
	<div class="jumbotron">
		<br>
		<h2>Cadastro de Veiculos</h2>
		<br>
			<form id="formExemplo" data-toggle="validator" role="form" method="post" action="CadVeiculoControl" enctype="multipart/form-data">
				<div class="row">
				<div class="form-group col-md-4">
					<label for="marca" class="control-label">Marca:</label> 
					<input id="marca" name="marca" class="form-control" placeholder="Digite a marca do Veiculo" type="text"
					  value='<c:out value="${carro.marca}"></c:out>' data-error="Por favor, informe a marca do veiculo." required>
					  <div class="help-block with-errors"></div>
				</div>
				
				<div class="form-group col-md-4 ">
					<label for="modelo" class="control-label">Modelo:</label>
					<input id="modelo" name="modelo" class="form-control" type="text" placeholder="Digite, modelo do Veiculo"
				 	   required="required" value='<c:out value="${carro.modelo}"></c:out>'  >
				</div>
				
				<div class="form-group col-md-4 ">
					<label for="categoria" class="control-label">Categoria:</label>
					<input id="categoria" name="categoria" class="form-control" type="text" placeholder="Digite, categoria do Veiculo"
				 	   required="required" value='<c:out value="${carro.categoria}"></c:out>'  >
				</div>
				
				</div>
				<div class="row">
				<div class="form-group col-md-3">
					<label for="placa" class="control-label">Placa:</label>
					<input id="placa" name="placa" class="form-control mixed" type="text" placeholder="Digite, a placa do Veiculo"
				 	   required="required" value='<c:out value="${carro.placa}"></c:out>'  >
				</div>
				
				<div class="form-group col-md-3">
					<label for="ano" class="control-label">Ano:</label>
					<input id="ano" name="ano" class="form-control mixed2" type="text" placeholder="Digite, O ano do Veiculo"
				 	   required="required" value='<c:out value="${carro.ano}"></c:out>'  >
				</div>
				
				<div class="form-group col-md-6">
					<label for="foto" class="control-label">Foto:</label>
					<input id="img" name="foto" class="form-control " type="file" placeholder="Upload da foto do Veiculo"
				 	     onchange="uploadFile();" value='<c:out value="${carro.foto}"></c:out>' >
				</div>
				
				<div class="form-group" id=”foto”>
				
					<img alt="Imagem" src="" id="target" width="200" height="200" style=”display:none”>
				
				</div>
				
				</div>
				
				<button type="submit" class="btn btn-primary">Cadastrar</button>
				
			</form>
	</div>
</div>
<!-- end Container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="./js/jquery.min.js"><\/script>')</script>
    <script src="./js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

	<script src="./js/validator.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.min.js"></script>
	<script type="text/javascript" src="./js/jquery.mask.min.js"></script>
	
	<link rel="stylesheet" href="./css/jquery-ui.css">
	<script src="./js/jquery.js"></script>
	<script src="./js/jquery-ui.js"></script>
		
	<script>
	$(document).ready(function(){
		$('.mixed').mask('AAA-9999');
		$('.mixed2').mask('9999');
		
  } );
  </script>
 <script type="text/javascript">
	
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
</script>


</body>
</html>