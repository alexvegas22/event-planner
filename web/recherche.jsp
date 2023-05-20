<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>  
<html>
    <head>
        <title>Recherche</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/recherche.css" type="text/css"/>
        <link rel="stylesheet" href="css/home.css" type="text/css"/>
    </head>
 
    <body>
          <%@ include file="jspf/header.jspf" %> 
        <div class="home-section"><h1>Résultats pour : <p id='recherche'><%= request.getParameter("search") %> </p></h1>
        
        </div>
    </body>
</html>
