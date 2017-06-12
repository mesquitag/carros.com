<jsp:include page="menuusuario.jsp" />
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
					
					<div class="col-md-12">
        			<div class="input-group h2">
            			<input name="nomePesquisa" class="form-control" id="search" type="text" placeholder="Pesquise pelo nome do Cliente ou clique em pesquisar para listar todos">
            				<span class="input-group-btn">
								<a href="AdminClienteControl?action=pesquisa&nomePesquisa=<c:out value="${nomePesquisa}"/>" class="glyphicon glyphicon-search btn btn-primary bottom" ></a>
                   				 <span class="glyphicon glyphicon-search"></span>
            				</span>
       			   </div>
       			   </div>
					</div>
				</form>
			</div>
			
			<div class="form-group tabela">
			<table class="table table-hover tablela">
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
					<c:forEach items="${clientes}" var="pessoa">
						<tr>
							<td><c:out value="${pessoa.id}" /></td>
							<td><c:out value="${pessoa.nome}" /></td>
							<td><c:out value="${pessoa.email}" /></td>
							<td><c:out value="${pessoa.cpf}" /></td>
							<td><a href="AdminClienteControl?action=edit&id=<c:out value="${pessoa.id}"/>" class="btn btn-warning" >Update</a></td>
                    		<td><a href="AdminClienteControl?action=remover&id=<c:out value="${pessoa.id}"/>" class="btn btn-danger">Delete</a></td>
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
	<script src="./js/tabela.js"></script>
</body>
</html>