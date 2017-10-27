<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache"> 
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
    
    <title>Inicio</title>
    
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
     <link href="resources/css/style.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Livros</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="novo-livro">Novo livro</a></li>
					<li><a href="todos-livros">Todos livros</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Seja-vinddo livros</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_TASKS'}">
			<div class="container text-center" id="livrosDiv">
				<h3>Meus livros</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>							
								<th>Título</th>
								<th>Autor</th>
								<th>Descri&ccedil;&atilde;o</th>
								<th>Pre&ccedil;o</th>
								<th>ISBN</th>
								<th>Data e Hora</th>
								<th>A&ccedil;&atilde;o</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="livro" items="${livros}">
								<tr>				
									<td>${livro.livroTitulo}</td>
									<td>${livro.autorNome}</td>
									<td>${livro.livroDescricao}</td>
									<td>${livro.livroPreco}</td>
									<td>${livro.isbn}</td>
									<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${livro.criarData}"/></td>									
									<td><a href="atualizar-livro?id=${livro.id}"><span class="glyphicon glyphicon-pencil"></span></a>
									<a href="excluir-livro?id=${livro.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Livros</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="salvar-livro">
					<input type="hidden" name="id" value="${livro.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">Título</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="livroTitulo" value="${livro.livroTitulo}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Autor</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="autorNome" value="${livro.autorNome}"/>
						</div>				
					</div>
						<div class="form-group">
						<label class="control-label col-md-3">Descricao</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="livroDescricao" value="${livro.livroDescricao}"/>
						</div>				
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Preço</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="livroPreco" value="${livro.livroPreco}"/>
						</div>				
					</div>		
					<div class="form-group">
						<label class="control-label col-md-3">ISBN</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="isbn" value="${livro.isbn}"/>
						</div>				
					</div>		
								
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Salvar"/>
					</div>
				</form>
			</div>
		</c:when>		
	</c:choose>

	<script src="resources/js/jquery-1.11.1.min.js"></script>    
    <script src="resources/js/bootstrap.min.js"></script>
</body>
</html>