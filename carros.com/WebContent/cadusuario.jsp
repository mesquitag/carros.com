<%@page import="com.carros.Models.EnumEstado"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:include page="menuindex.jsp" />

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
					<select class="form-control" id="enumEstado" name="enumEstados">
						<c:set var="enumEstados" value="<%=EnumEstado.values() %>" />
						<c:forEach items="${enumEstados}" var="enumEstado">
                             <option value="${enumEstado}" label="${enumEstado.descricao}" />
                        </c:forEach>			
					</select>

					</div>
					
					<div class="form-group col-md-6" >
					<label for="telefone" class="control-label">telefone</label>
					<input id="telefone" name="telefone" class="form-control phone_with_ddd" type="tel"
				 	   required="required" value='<c:out value="${telefone.telefone}"></c:out>'  >
					</div>
					
				</div>				
					
				<button type="submit" class="btn btn-primary">Salvar</button>
				
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