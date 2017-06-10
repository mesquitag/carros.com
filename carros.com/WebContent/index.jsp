<jsp:include page="menuindex.jsp" />




<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">

  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
  
    <div class="item active">
      <img src="img/banner1-2.jpg" alt="Carros.com">
      <div class="carousel-caption">
       <h3>Tudo o que você precisa</h3>
        <p>Antes de alugar seu carro, confira as principais informações sobre nossos serviços</p>
      
      </div>
    </div>
    <div class="item">
      <img src="img/banner3-2.jpg" alt="Carros.com">
      <div class="carousel-caption">
      <h3>Alugando com a Carro.com</h3>
        <p>Conheça nossos diferenciais e aproveite o melhor custo benefício da cidade</p>
      </div>
    </div>
    <div class="item">
      <img src="img/banner2-2.jpg" alt="Carros.com">
      <div class="carousel-caption">
      <h3>Carro.com trasendo um Diferencial na sua voda</h3>
        
      </div>
    </div>
    <div class="item">
      <img src="img/banner4-2.jpg" alt="Carros.com">
      <div class="carousel-caption">
      <h3>Carro.com sempre inovando para melhor atendelo</h3>
        
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>


 


	<div id="tamanhoContainer" class="container">
		<div class="row">
			<div id="mediaDataRetirada" class="col-xs-12 col-sm-7 col-md-8">
				<div class="jumbotron center-block">
						<div class="tituloBusca">
            <img class="text-center" src="img/tituloBusca.png">
        </div>
					
					<form action="ReservaController" method="post" name="frmReserva" class="form-inline">
						<!-- 
						-------------------------------------------------
						  <div class="form-group">
								<label for="dataInicio">Retirada</label>
								<input type="text" id="dataInicio" name="dataInicio" class="form-control"  value="<c:out value="${reserva.dataInicio}"/>" />
								
																										   
							
								<label for="horaSaida">Horas</label>
								<input type="text" class="form-control" id="horaInicio" placeholder="inicio" value="<c:out value="${reserva.horaInicio}"/>"/>
							</div>
						--------------------------------------------------------------	
							 -->
							<div id="boxBuscaDesk" class=" box-data-reserva">
							 <!-- Deixa o fundo do campo de data em branco  -->
        
                
                    <div class="form-group">
                        <label id="labelDataRetirada" for="dataInicio">Data de Retirada</label>
                        <input type="text" id="txtCheckin" class="campoDataRetirada" name="dataInicio"  style="width: 90px;"  value="" />
                        <span>
                            <img class="iconeCalRetirada" style="cursor:pointer;" src="img/iconeCalendario.png">
                        </span>
                    </div>
                
                
                    <div class="form-group">
                        <label id="labelDataRetirada" for="dataRetorno">Data de Retorno</label>
                        <input type="text" id="txtCheckout" class="campoDataRetorno" name="dataRetorno" value="" style="width: 90px;">
                        <span>
                            <img class="iconeCalRetorno" style="cursor:pointer;" src="img/iconeCalendario.png">
                        </span>
                    </div>
               
                
                    <div class="form-group">
                        <label id="labelDataRetirada" for="horaRetirada">Hora de Retirada</label>
                        <input type="text" id="horaInicio" class="campoHora" name="horaRetirada" value="" style="width: 90px;">
                        <span>
                            <img class="iconeHoraRetirada" style="cursor:pointer;" src="img/iconeRelogio.png">
                        </span>
                    </div>
                
               
                    <div class="form-group">
                        <label id="labelDataRetirada" for="horaRetorno">Hora de Retorno</label>
                        <input  type="text" class="campoHora" name="horaRetorno" value="" style="width: 90px;">
                        <span>
                            <img class="iconeHoraRetorno" style="cursor:pointer;" src="img/iconeRelogio.png">
                        </span>
                    </div>
                 <div class="form-group">
                        <label id="labelDataRetirada" for="localRetirada">Local de Retirada</label>
                        <span class="iconeLocalRetirada clique"></span>
                        <input type="text" class="campoLocal" name="localRetirada" value="" style="width: 233px;"/>
                        <input id="vLocalRetirada" type="hidden" name="vLocalRetirada" value=""/>
                        <span>
                            <img class="iconeLocalRetirada" src="img/iconePin.png"/>
                        </span>
                    </div>
                    <div class="form-group">
                        <label id="labelDataRetirada" for="localRetorno">Local do Retorno</label>
                        <span class="iconeLocalRetorno clique"></span>
                        <input  type="text" class="campoLocal" name="localRetorno" value="" style="width: 233px;"/>
                        <input type="hidden" name="vLocalRetorno" value=""/>
                        <span>
                            <img class="iconeLocalRetorno" src="img/iconePin.png"/>
                        </span>
                    </div>
        </div>

        <button id="btn-proximo-passo" type="button" style="width: 100%; margin-top: 25px;" class="btn btn-danger ">
            PRÓXIMO PASSO<br>
            <span style="font-size: 9px; font-family: 'AvenirLTStd65Medium';">ESCOLHA DO VEÍCULO</span>
        </button>
    </form>
</div>	
</div>
			</div>
			</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./js/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/themes/smoothness/jquery-ui.min.css" rel="stylesheet" type="text/css" />
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
  

</body>

</html>