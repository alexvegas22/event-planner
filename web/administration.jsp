<%-- 
    Document   : administration
    Created on : 2023-04-22, 00:17:27
    Author     : djemaoune aimen
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.entites.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="java.util.ArrayList"%>
<%@page import="com.model.entites.Utilisateur"%>
<html>
    <head>
  <title>Barre de recherche Bootstrap</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <<link rel="stylesheet" href="css/style.css"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<%@include file="listeUtilisateurs.jspf" %>
  <div class="container mt-4">
    <form class="form-inline" method="get" action="controllerRecherche">
      <input class="form-control mr-sm-2" type="search" placeholder="Recherche" aria-label="Search" name="nom">
      <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Rechercher</button>
    </form>
  </div>
</body>
    
</html>
