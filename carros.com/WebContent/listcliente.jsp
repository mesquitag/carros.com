<jsp:include page="menuadm.jsp" />
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="container">

	<!-- Main component for a primary marketing message or call to action -->
	<div class="jumbotron">
		<br>
		<h2>Lista de Clientes</h2>
		<br>
		<br>	
			<div class="form-group">
				<form action="AdminClienteControl" id="form-cliente" method="post">
					<div class="row">
						<div class="form-group col-md-5">
							<label for="nome" class="control-label">Nome:</label>
							<input id="nome" name="nome" class="form-control" type="text" placeholder="Nome do clinete"
				 	   	 		value='<c:out value="${cliente.nome}"></c:out>'  >
						</div>
						
						<div class="form-group col-md-5">
							<label for="cpf" class="control-label">CPF:</label>
							<input id="cpf" name="cof" class="form-control" type="text" placeholder="CPF do cliente"
				 	   	 		value='<c:out value="${cliente.cpf}"></c:out>'  >
						</div>
						
						<button type="submit" class="btn btn-primary bottom" style="margin-top: 1.8em"> Pesquisa</button>
					</div>
						
				</form>
			</div>
			
			<div class="form-group">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nome</th>
						<th>Emai</th>
						<th>CPF</th>
						<th colspan="2"> Ação</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pessoas}" var="pessoa">
						<tr>
							<td><c:out value="${pessoa.id}" /></td>
							<td><c:out value="${pessoa.nome}" /></td>
							<td><c:out value="${pessoa.email}" /></td>
							<td><c:out value="${pessoa.cpf}" /></td>
							<td><a href="ClienteControl?action=edit&userId=<c:out value="${pessoa.id}"/>">Update</a></td>
                    		<td><a href="ClienteControl?action=delete&userId=<c:out value="${pessoa.id}"/>">Delete</a></td>
                </tr>
					</c:forEach>
				
				</tbody>
			</table>
			</div>
			
			
			
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
</body>
</html>