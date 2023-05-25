<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page session="true"%>

<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <script src="jquery-3.6.4.min.js"></script>


        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/home.css" type="text/css"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200">
        <link rel="stylesheet" href="css/calendrier.css">
        <link rel="stylesheet" href="css/semaine.css">
        <link rel="stylesheet" href="css/header.css">
        <script src="javascript/calendrier.js" defer></script>
        <script src="javascript/evenement.js" defer></script>

    </head>
    <body>
        <%@ include file="jspf/header.jspf" %>  
        <div class="home-section">
            <%@ include file="jspf/evenement.jspf" %>  


            
                <button class="icon-button" id='add'>
                                <img width="24" height="24" src="https://img.icons8.com/ios/50/plus-math--v1.png" alt="plus-math--v1"/>
                            </button>
                
                
                        <div class='right-section' id='right-section'>
                
                    <article class="event-section planificateur">
                        
                        
                                <div id = 'login-grid' class='login-grid'>
                                    <form action='controllerEvenement' method='post' class=""> 
                                                                              
                                    <label for='fname'>Nom de l'évènement: </label>
                                    <input type='text' placeholder="Entrez le nom de l'évènement" name='nom' required> <br>
                                    <label for='lieu'>Lieu de l'évènement </label>
                                    <input type='text' placeholder="Entrez le lieu de l'évènement" name='lieu' required> <br>
                                    <label for='debut'>Heure du début </label>
                                    <input type='datetime-local'  name='debut' required> <br>
                                    <label for='fin'>Heure de fin</label> <br>
                                    <input type='datetime-local'  name='fin' required>
                                    <label for='description'>Description</label>
                                    <input type='text' placeholder="Description de l'évènement" name='description' required> 
                                    <br>
                                    <br>
                                    <button type='submit' id='create'> Créer </button> 
                                    </form>
                                     
                                </div>
                        <button  id='back' class='annuler'> Annuler </button>
                            
                        
                    </article>
            </div>            
        </div>
    </body>
</html>
