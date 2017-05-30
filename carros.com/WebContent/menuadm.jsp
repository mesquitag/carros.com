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
    <link href="./css/navbar-fixed-top.css" rel="stylesheet">
    <link href="./css/login.css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    
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
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">Reservas</a></li>
            <li><a href="#contact">Aluguel</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cadastros<span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">Carros</a></li>
                <li><a href="#">Aluguel</a></li>
                <li><a href="#">TESTE</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header">ADM Pessoas</li>
                <li><a href="#">Funcionario</a></li>
                <li><a href="#">Pessoas</a></li>
              </ul>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
           <li><p class="navbar-text">Logado como : </p>    <!-- Colocar usuario logado aqui -->    </li>
        
        
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Opções</b> <span class="caret"></span></a>
			<ul id="login-dp" class="dropdown-menu">
				<li>
					 <div class="row">
							<div class="col-md-12">
									Login via : 
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
		<div class="row">
			<div class="col-xs-12 col-sm-7 col-md-8">
				<div class="jumbotron center-block">
						<h2>Aluguel de Carros</h2>
					<hr class="dl-horizontal">
						<p> outro texto aqui</p>
					<form action="ReservaController" method="post" name="frmReserva" class="form-inline">
						
							<div class="form-group">
								<label for="dataInicio">Retirada</label>
								<input type="text" id="dataInicio" name="dataInicio" class="form-control"  value='<c:out value="${reserva.dataInicio}"></c:out>'>
							
							
								<label for="horaSaida">Horas</label>
								<input type="text" class="form-control" id="horaInicio" placeholder="inicio" value='<c:out value="${reserva.horaInicio}"></c:out>'>
							</div>
					</form>
				</div>
			</div>
		<div class="col-xs-12 col-sm-5 col-md-6">
				<div class="jumbotron">
					<div class="separated">
						<h1>Banner aqui</h1>
					</div>
					<form></form>
				</div>
			</div>

		</div>
		<!-- End div Row -->


	</div>
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
	<!-- DataPikes script -->
	
	<script>
  	$( function() {
    var dateFormat = "dd/MM/yyyy",
      from = $( "#dataInicio" )
        .datepicker({
          defaultDate: "+1w",
          changeMonth: true,
          numberOfMonths: 3
        })
        .on( "change", function() {
          to.datepicker( "option", "minDate", getDate( this ) );
        }),
      to = $( "#dataFim" ).datepicker({
        defaultDate: "+1w",
        changeMonth: true,
        numberOfMonths: 3
      })
      .on( "change", function() {
        from.datepicker( "option", "maxDate", getDate( this ) );
      });
 
    function getDate( element ) {
      var date;
      try {
        date = $.datepicker.parseDate( dateFormat, element.value );
      } catch( error ) {
        date = null;
      }
 
      return date;
    }
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
    
    
    