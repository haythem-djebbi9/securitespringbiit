<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier une Marque</title>
</head>
<body>
<div class="container mt-5">
<div class="card-body">
<form action="updateMarque" method="post">
 <div class="form-group">
 <label class="control-label">ID Marque :</label>
 <input type="text" name="idMarque" value="${marque.idMarque}"
readonly class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Nom de la Marque :</label>
 <input type="text" name="nomMarque" value="${marque.nomMarque}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Chiffre d'affaires :</label>
 <input type="text" name="chiffreaffaire" value="${marque.chiffreaffaire}"
class="form-control"/>
 </div> 
 <div class="form-group">
 <label class="control-label">Date validation :</label>
 <fmt:formatDate pattern="yyyy-MM-dd" value="${marque.dateValidation}"
var="formatDate" />
 <input type="date" name="date" value="${formatDate}" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Secteur d'activité :</label>
 <input type="text" name="secteurActivite" value="${marque.secteurActivite}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Slogan :</label>
 <input type="text" name="slogan" value="${marque.slogan}"
class="form-control"/>
 </div>
 <div>
 <button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="listeMarques">Liste Marques</a>
</div>
</body>
</html>