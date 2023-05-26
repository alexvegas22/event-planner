<%-- 
    Document   : evenement_Form
    Created on : 2023-05-06, 14:48:07
    Author     : Djemaoune Aimen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Log in Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
        <script src="js/validationFormulaire.js"></script>
        
        
    </head>
    <body>
        <h1> Création d'un évènement</h1> 
        <form action='controllerEvenement' method='post'> 
        <div id = 'login-grid' class='login-grid'>
            <label for='fname'>Nom de l'évènement: </label>
            <input type='fname' placeholder="Entrez le nom de l'évènement" name='nom' required>
            
            <label for='lieu'>Lieu de l'évènement </label>
            <input type='text' placeholder="Entrez le lieu de l'évènement" name='lieu' required>
            
            <label for='debut'>Heure du début </label>
            <input type='time'  name='fin' required>
            
            <label for='fin'>Heure de fin</label>
            <input type='time'  name='fin' required>
            
            <label for='description'>Description</label>
            <input type='text' placeholder="Description de l'évènement" name='description' required>
         
            
             <br>
                        
                         
                            
            <button type='submit'> Connexion </button> 
          
        </div> <br>
        
      </form>
    </body>
</html>

