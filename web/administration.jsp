<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.entites.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.entites.Utilisateur"%>
<!doctype html>
<html>
    <head>
        <title>Page d'administration</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/header.css"/>
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="stylesheet" href="css/administration.css"/>
        <script src="javascript/administration.js" defer></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>

        <header class='header'>
            <nav class='navbar'>
                <ul class='nav-menu'>
                    <li class='nav-item'>
                        <a href="index.jsp"><h1>Planner</h1></a>
                    </li>
                </ul>
            </nav>
        </header>

        <div class='search'>
            <form  method="get" action="controllerRechercheAdmin">
                <div class="radiogroup">
                    <div class="wrapper">
                        <input class="state" type="radio" name="recherche" id="utilisateurs" value="utilisateurs" checked >
                        <label class="label" for="utilisateurs">
                            <div class="indicator"></div>
                            <span class="text">Utilisateurs</span>
                        </label>
                    </div>
                    <div class="wrapper">
                        <input class="state" type="radio" name="recherche" id="evenements" value="evenements" >
                        <label class="label" for="evenements">
                            <div class="indicator"></div>
                            <span class="text">Événements</span>
                        </label>
                    </div>
                </div>
                <input  type="search" placeholder="Rechercher " aria-label="Search" name="barreDeRecherche"> <br><br>
                <button  type="submit">Rechercher </button>
            </form>
            <div class="wrapper">
                <form action="controllerRechercheAdmin">
                    <input type="hidden" name="afficher" id="allUtilisateurs" value="allUtilisateurs">
                    <button>Afficher tous les utilisateurs</button>
                </form>
                <br>
                <form action="controllerRechercheAdmin">
                    <input type="hidden" name="afficher"  id="allEvenements" value="allEvenements">
                    <button>Afficher tous les événements</button>
                </form>
            </div>
        </div>
        <c:set var="message" value='${param.afficher}' />

        <c:set var="bdr" value='${param.barreDeRecherche}' />

        <c:choose>
            <c:when test = "${message == 'allEvenements'}">
                <%@include file="jspf/listeEvenements.jspf" %>
            </c:when>
            <c:when test = "${message == 'allUtilisateurs'}">
                <%@include file="jspf/listeUtilisateurs.jspf" %>
            </c:when>
            <c:when test = "${bdr != ''}">
                <%@include file="jspf/resultatsDeRecherche.jspf" %>
            </c:when>
        </c:choose>
    </body>
</html>


