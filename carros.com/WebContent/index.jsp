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
				<div  class="jumbotron center-block">
						<div class="tituloBusca" >
            <img src="img/tituloBusca.png" >
        </div>
					
					<form id="chekout" action="ReservaController" method="post" name="frmReserva" class="form-inline">
					
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
			<!-- fim do CHeckout -->
			<br>
			<br>
			<br>
			
			 <div class="container-fluid" style="background-color: #f1f2f2; min-height: 600px;">
        <div  id="text-center" class="container">
            <div class="col-md-8">
                <div class="textoInterna">
                    <p>Antes de alugar seu veículo, consulte os diferenciais da <strong>Carro.com</strong> e as principais condições de contratação.</p>
                    <div class="container">
                        <div class="row">
			 <div class="col-md-7">
                                               <div class="col-md-4 col-sm-6 col-xs-12">
                                            <div class="iconeInformacao">
                                                <img src="img/icones_consumo.png" alt=""/>
                                            </div>
                                            <div class="tituloInformacao">
                                                Consumo                                            </div>
                                            <div class="descricaoInformacao">
                                                <p>Aqui você devolve o carro com a quantidade de combustível que recebeu.</p>
                                            </div>
                                        </div>
                                                                                                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                            <div class="iconeInformacao">
                                                <img src="img/icones_assistencia24h.png" alt=""/>
                                            </div>
                                            <div class="tituloInformacao">
                                                Revisão                                            </div>
                                            <div class="descricaoInformacao">
                                                <p>Para sua máxima segurança e conforto, todos os veículos da <b>Carro.com</b> são periodicamente revisados com precisão e qualidade.</p>
                                            </div>
                                        </div>
                                                                                                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                            <div class="iconeInformacao">
                                                <img src="img/icones_multas.png" alt=""/>
                                            </div>
                                            <div class="tituloInformacao">
                                                Multas                                            </div>
                                            <div class="descricaoInformacao">
                                                <p>O pagamento das multas é de responsabilidade única do contratante.</p>
                                            </div>
                                        </div>
                                                                                                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                            <div class="iconeInformacao">
                                                <img src="img/icones_diaria.png" alt=""/>
                                            </div>
                                            <div class="tituloInformacao">
                                                Diária                                            </div>
                                            <div class="descricaoInformacao">
                                                <p>A diária de veículos é de 24 horas, com 1 hora de tolerância. A partir da 25ª hora, será cobrada hora extra (1/6 do valor da diária para cada hora extra), inclusive a hora de tolerância. A diária das coberturas de risco é de 24 horas, com 1 hora de tolerância.</p>
                                            </div>
                                        </div>
                                                                                                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                            <div class="iconeInformacao">
                                                <img src="img/icone_contratante.png" alt=""/>
                                            </div>
                                            <div class="tituloInformacao">
                                                Contratante                                            </div>
                                            <div class="descricaoInformacao">
                                                <p>A idade mínima do contratante é de 21 anos. No momento da entrega do veículo deve portar Carteira de Habilitação (CNH) emitida há pelo menos dois anos.</p>
                                            </div>
                                        </div>
                                                                                                                    <div class="col-md-4 col-sm-6 col-xs-12">
                                            <div class="iconeInformacao">
                                                <img src="img/icone_preautorizacao.png" alt=""/>
                                            </div>
                                            <div class="tituloInformacao">
                                                Pré-Autorização                                            </div>
                                            <div class="descricaoInformacao">
                                                <p>Para locação é necessário emitir uma pré-autorização no cartão de crédito que esteja em nome do contratante. O valor varia de acordo com a categoria e, no caso de não haver pendências, é cancelado ao final do contrato.</p>
                                            </div>
                                        </div>
                                                                                                </div>
                                                                                                </div>
                                                                                                </div>
                                                                                                </div>
                                                                                                </div>
                                                                                                </div>
                                                                                                </div>
                                                                                                
                                                                                                
			
	<jsp:include page="rodape.jsp" />		
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./js/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/themes/smoothness/jquery-ui.min.css" rel="stylesheet" type="text/css" />
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
   <script src="./js/validator.min.js"></script>
 
  <!--Start Inicio do chat online Script-->
<script type="text/javascript">
var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();
(function(){
var s1=document.createElement("script"),s0=document.getElementsByTagName("script")[0];
s1.async=true;
s1.src='https://embed.tawk.to/5940a31db3d02e11ecc69d0f/default';
s1.charset='UTF-8';
s1.setAttribute('crossorigin','*');
s0.parentNode.insertBefore(s1,s0);
})();
</script>
<!--End do Chat online Script-->

</body>

</html>