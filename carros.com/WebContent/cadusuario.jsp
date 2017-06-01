<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="./img/favicon.png">

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <link href="./css/login.css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="./css/navbar-fixed-top.css" rel="stylesheet">
    
    
    <!--JqueryUi -->
	<link rel="stylesheet" href="./css/jquery-ui.css">
	<script src="./js/jquery.js"></script>
	<script src="./js/jquery-ui.js"></script>
	
		<!-- TimePiker Jquery -->
	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<script type="text/javascript" src="./js/jquery.timepicker.js"></script>
	<link rel="stylesheet" type="text/css" href="./css/jquery.timepicker.css" />
	<script type="text/javascript" src="./js/bootstrap-datepicker.js"></script>
	<link rel="stylesheet" type="text/css" href="./css/bootstrap-datepicker.css" />
	<script type="text/javascript" src="./js/site.js"></script>
	<link rel="stylesheet" type="text/css" href="./css/site.css" />
	
	
<title>Carros.com</title>
</head>
<body>
 <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Carros.com</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.jsp">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header">Nav header</li>
                <li><a href="#">Separated link</a></li>
                <li><a href="#">One more separated link</a></li>
              </ul>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
           <li><p class="navbar-text">Você já tem uma conta !? </p></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Entrar</b> <span class="caret"></span></a>
			<ul id="login-dp" class="dropdown-menu">
				<li>
					 <div class="row">
							<div class="col-md-12">
								Login via
								<div class="social-buttons">
									<a href="#" class="btn btn-fb"><i class="fa fa-facebook"></i> Facebook</a>
									<a href="#" class="btn btn-tw"><i class="fa fa-twitter"></i> Twitter</a>
								</div>
                                OU
								 <form class="form" role="form" method="post" action="login" accept-charset="UTF-8" id="login-nav">
										<div class="form-group">
											 <label class="sr-only" for="exampleInputEmail2">Endereço de Email</label>
											 <input type="email" class="form-control" id="exampleInputEmail2" placeholder="Email" required>
										</div>
										<div class="form-group">
											 <label class="sr-only" for="exampleInputPassword2">Senha</label>
											 <input type="password" class="form-control" id="exampleInputPassword2" placeholder="Senha" required>
                                             <div class="help-block text-right"><a href="">Esqueceu a senha ?</a></div>
										</div>
										<div class="form-group">
											 <button type="submit" class="btn btn-primary btn-block">Entrar</button>
										</div>
										<div class="checkbox">
											 <label>
											 <input type="checkbox"> Me mantenha Logado!
											 </label>
										</div>
								 </form>
							</div>
							<div class="bottom text-center">
								Novo por aqui ? <a href="#"><b>Cadastro!</b></a>
							</div>
					 </div>
				</li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

		<div class="container">

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
		<br>        
        <h2>Novo Usuario</h2>

			<form id="formExemplo" data-toggle="validator" role="form" method="post" action="UsuarioControl">
				<div class="form-group">
					<label for="email" class="control-label">Email</label> 
					<input id="email" name="email" class="form-control" placeholder="Digite seu E-mail" type="email"
					  value='<c:out value="${cliente.email}"></c:out>' data-error="Por favor, informe um e-mail correto." required>
					  <div class="help-block with-errors"></div>
				</div>

				<div class="form-group">
					<label for="senha" class="control-label">Senha</label> 
					<input type="password" class="form-control" id="inputPassword" placeholder="Digite sua Senha..."
					   name="senha" value='<c:out value="${cliente.senha}"></c:out>'  data-minlength="6" required >
					   <span class="help-block" > A senha deve de ser no minimo seis(6) digitos</span>
				</div>
				
				
				<hr class="dl-horizontal">
				
				<div class="form-group">
					<label for="nome" class="control-label">Nome:</label> 
					<input id="nome" name="nome" class="form-control" placeholder="Digite seu Nome..." type="text" 
					  value='<c:out value="${cliente.nome}"></c:out>'  required="required">
				</div>
				
				<div class="row">
				<div class="form-group col-md-4 ">
					<label for="dataNascimento" class="control-label">Data de Nascimento</label>
					<input id="nome" name="dataNascimento" class="form-control" type="date"
					   value='<fmt:formatDate pattern="dd-MM-yyyy" value="${cliente.dataNascimetno}"/>' required="required">
				</div>
				
				<div class="form-group col-md-4 ">
					<label for="cpf" class="control-label">CPF</label>
					<input id="cpf" name="cpf" class="form-control cpf" type="text"
				 	   maxlength="14" required="required" value='<c:out value="${cliente.cpf}"></c:out>'  >
				</div>
				
				<div class="form-group col-md-4 ">
					<label for="rg" class="control-label">RG</label>
					<input id="rg" name="rg" class="form-control" type="text"
				 	   maxlength="14" required="required" value='<c:out value="${cliente.rg}"></c:out>'  >
				</div>
				</div>
				
				<hr class="dl-horizontal">
				<h2>Endereço / Contato</h2>
				
				<div class="row">
					<div class="form-group col-md-8 ">
					<label for="logradouro" class="control-label">logradouro</label>
					<input id="logradouro" name="logradouro" class="form-control" type="text"
				 	    required="required" value='<c:out value="${endereco.logradouro}"></c:out>'  >
					</div>
					
					<div class="form-group col-md-4 ">
					<label for="numero" class="control-label">Numero</label>
					<input id="numero" name="numero" class="form-control" type="text"
				 	   value='<c:out value="${endereco.numero}"></c:out>'  >
					</div>
				</div>
				
				<div class="form-group" >
					<label for="complemento" class="control-label">complemento</label>
					<input id="complemento" name="complemento" class="form-control" type="text"
				 	   value='<c:out value="${endereco.complemento}"></c:out>'  >
				</div>
				
				<div class="row">
					<div class="form-group col-md-4" >
					<label for="cep" class="control-label">CEP</label>
					<input id="cep" name="cep" class="form-control cep_with_callback" type="text"
				 	   required="required" value='<c:out value="${endereco.cep}"></c:out>'  >
					</div>
					
					<div class="form-group col-md-2" >
					<label for="uf" class="control-label">UF</label> 
					<select class="form-control" id="sel1" name="enumUf">
						<c:forEach items="${enumUfs}" var="enumUf">
                             <option value="${enumUf.enumUf}">${enumUf}</option>
                        </c:forEach>			
					</select>

					</div>
					
					<div class="form-group col-md-6" >
					<label for="telefone" class="control-label">telefone</label>
					<input id="telefone" name="telefone" class="form-control phone_with_ddd" type="tel"
				 	   required="required" value='<c:out value="${telefone.telefone}"></c:out>'  >
					</div>
					
				</div>				
					
				<button type="submit" class="btn btn-primary">Enviar</button>
				
			</form>

		</div>

    </div> <!-- /container -->
		
	<!-- /container -->

	<hr class="dl-horizontal">
	
	<!-- Inicio conteiner -->
	<div class="container">
		
	
	</div>
		<!-- End Conteiner -->




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
	
	
	<script>
	$(document).ready(function(){
  	$('.cpf').mask('000.000.000-00', {reverse: true});

    $('.cep_with_callback').mask('00000-000', {onComplete: function(cep) {
        console.log('Mask is done!:', cep);
      },
       onKeyPress: function(cep, event, currentField, options){
        console.log('An key was pressed!:', cep, ' event: ', event, 'currentField: ', currentField.attr('class'), ' options: ', options);
      },
      onInvalid: function(val, e, field, invalid, options){
        var error = invalid[0];
        console.log ("Digit: ", error.v, " is invalid for the position: ", error.p, ". We expect something like: ", error.e);
      }
    });
    $('.phone_with_ddd').mask('(00) 0000-0000');	
  } );
  </script>
  <!-- Timepicker -->
	
	 <script>
                $(function() {
                    $('#horaInicio').timepicker();
                });
            </script>
</body>
</html>