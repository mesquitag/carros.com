<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="./img/favicon.png">

<!--JqueryUi -->
<link rel="stylesheet" href="./css/jquery-ui.css">
<script src="./js/jquery.js"></script>
<script src="./js/jquery-ui.js"></script>

<!-- TimePiker Jquery -->
<script type="text/javascript" src="./js/jquery.min.js"></script>
<link rel="stylesheet" type="text/css"	href="./css/jquery.timepicker.css" />
<script type="text/javascript" src="./js/datepicker.js"></script>
<link rel="stylesheet" type="text/css"	href="./css/bootstrap-datepicker.css" />
<script type="text/javascript" src="./js/site.js"></script>
<link rel="stylesheet" type="text/css" href="./css/site.css" />

<!-- Bootstrap core CSS -->
<link href="./css/bootstrap.min.css" rel="stylesheet">
<link href="./css/navbar-fixed-top.css" rel="stylesheet">
<link href="./css/login.css" rel="stylesheet">
<link href="./css/main.css" rel="stylesheet">
<link href="./css/datepicker.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">




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
          <a class="navbar-brand" href="#" style="margin-right: -15%;"></a>
          
           <img class="img-responsive" style="margin-top: 1.9%;"
                                 src="img/logo.png"/>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.jsp">Home</a></li>
            <li><a href="sobre.jsp">a Carros.com</a></li>
            <li><a href="https://goo.gl/Q8QrgY" target="_blank">Contato</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Serviços <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">Reservas</a></li>
                <li><a href="#">Aluguel do Carro</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header text-center">Outros</li>
                <li><a href="#">Indicação de Carro</a></li>
                <li><a href="diferencial.jsp">Diferenciais</a></li>
               </ul>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
           <li><p class="navbar-text">Faça seu login ou cadastre-se </p></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Entrar</b> <span class="caret"></span></a>
			<ul id="login-dp" class="dropdown-menu">
				<li>
					 <div class="row">
							<div class="col-md-12">
								Entrar com
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
								Novo por aqui ? <a href="cadusuario.jsp"><b>Cadastro!</b></a>
							</div>
					 </div>
				</li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
