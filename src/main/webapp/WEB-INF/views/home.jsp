<%@ page language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="<c:url value="/js/home.js" />"></script> 
	
	<title>Curso Spring :: Página de Inicio</title>
</head>
<body>
	<div class="container">
		
		<div class="row mt-2">
			<div>
				<a class="btn btn-danger" href="<c:url value="/" />">Inicio</a>
				<a class="btn btn-success" href="<c:url value="/" />">Ejemplo</a>
			</div>	 
			<h1 class="ml-2">Curso de Spring &rarr; Página de Inicio</h1>
		</div>	

		<div class="row alert alert-success" role="alert"">
			<span class="col-sm-3"><c:out value="${result}" /></span>
		</div>

		<div class="row">
			<div class="col-sm-12 text-center">
				<img id="image" src="img/lion.jpg" alt="León" />
			</div>
		</div>

		<div class="row">
			<div class="col-sm-12 text-right">
				<form name="send-commentform" method="post"
					action="<c:url value="/form" />">
					<label class="for="comment"><strong>Comentario:</strong></label>
					<input class="col-sm-10 mt-2" id="comment" name="comment" type="text" /> <input type="submit" class="btn btn-success" value="Enviar" />
				</form>
			</div>
		</div>

	</div>
</body>
</html>