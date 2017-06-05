<jsp:include page="menuindex.jsp" />



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