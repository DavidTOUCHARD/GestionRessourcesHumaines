<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Creation client</title>
</head>
<body>
	<h1>Page de cr�ation de client</h1>
	<div class="container">
	<c:if test="${ not empty message}">
		<div class="alert alert-${isError ? 'error' : 'success'} alert-dismissible fade show" role="alert">
			${message}
		  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		    <span aria-hidden="true">&times;</span>
		  </button>
		</div>
	</c:if>
		<form method="post">
			<div class="form-group">
			<label for="firstname">Pr�nom</label>
			<input id="firstname" name="prenom" class="form-control">
			</div>
			<div class="form-group">
			<label for="lastname">Nom</label>
			<input id="lastname" name="nom" class="form-control">
			</div>
			<div class="form-group">
			<label for="address">Adresse</label>
			<input id="address" name="adresse" class="form-control">
			</div>
			<div class="form-group">
			<label for="city">Ville</label>
			<input id="city" name="ville" class="form-control">
			</div>
			<div class="form-group">
			<label for="zipCode">Code postal</label>
			<input id="zipCode" name="code" class="form-control">
			</div>
			<div class="form-group">
			<label for="tel">T�l�phone</label>
			<input id="tel" name="tel" class="form-control">
			</div>
			<button class="btn btn-success">Valider</button>
			<button type="reset" class="btn btn-warning">Annuler</button>
		</form>
		
	</div>
</body>
</html>