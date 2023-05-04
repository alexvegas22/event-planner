<%-- 
    Document   : administration
    Created on : 2023-04-22, 00:17:27
    Author     : djemaoune aimen
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.entites.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
    ArrayList<Utilisateur> listeUtilisateurs = (ArrayList)request.getAttribute("listeUtilisateurs");
     Utilisateur  utilisateur = (Utilisateur)request.getAttribute("utilisateur");
%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administration</title>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/index.css" type="text/css"/>
    </head>
    <body>
        <h1>Page d'administration</h1>
        <%@ include file="listeUtilisateur.jspf" %>
    </body>
</html>
