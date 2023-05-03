<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Ajouter Marque</title>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-5" >
<div class="card-body">
<form action="saveMarque" method="post">
 <div class="form-group">
 <label class="control-label">Nom Marque :</label>
 <input type="text" name="nomMarque" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Chiffre d'affaire :</label>
 <input type="text" name="chiffreaffaire" class="form-control"/>
 </div> 
 <div class="form-group">
 <label class="control-label">Date Validation :</label>
 <input type="date" name="dateValidation" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Secteur d'activité :</label>
 <input type="text" name="secteurActivite" class="form-control"/>
 </div> 
 <div class="form-group">
 <label class="control-label">Slogan :</label>
 <input type="text" name="slogan" class="form-control"/>
 </div> 
 <div>
 <button type="submit" class="btn btn-primary">Ajouter</button>
</div>
</form>
</div>
${msg}
<br/>
<br/>
<a href="listeMarques">Liste Marques</a>
</div>
</body>
</html>
