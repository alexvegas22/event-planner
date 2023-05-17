<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/home.css" type="text/css"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200">
        <link rel="stylesheet" href="css/calendrier.css">
        <link rel="stylesheet" href="css/semaine.css">
        <script src="javascript/calendrier.js" defer></script>
        <script src="javascript/jour.js" defer></script>

    </head>
    <body>
        <%@ include file="header.jspf" %>  
        <div class="home-section">
           <%@ include file="semaine.jspf" %>  
           <%@ include file="calendrier.jspf" %> 
        </div>
    </body>
</html>
