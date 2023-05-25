<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Inscription</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
        
        
    </head>
    <body>
        <form action='controllerInscription' method='post'> 
        <div id = 'login-grid' class='login-grid box'>
            <div> <H1> Bienvenue!</H1> </div>
            <label for='fname'>Nom: </label>
            <input type='text' placeholder='Entrez votre nom' name='nom' required>
            
            <label for='lname'>Prénom: </label>
            <input type='text' placeholder='Entrez votre prénom' name='prenom' required>
            
            <label for='email'>Email:</label>
            <input type='text' placeholder='Entrez votre email' name='email' required>
            
            <label for='phone'>Numéro de Téléphone: </label>
            <input type='text' placeholder='Entrez votre numéro de téléphone' name='phone' required>
            
            <label for='psw'>Mot de passe:</label>
            <input type='password' placeholder='Entrez votre mot de passe' name='psw' required>
            
        
            <label for='Confirm_psw'> Confirmez votre mot de passe: </label>
            <input type='password' placeholder='Confirmez votre mot de passe' name='psw' required>
            
            <label for='bio'> Biographie </label>
            <input type='text' placeholder='Description' name='bio' required>
            
            <label  class="col-sm-4 control-label" for="photo">Photo : </label>
                              
                            <input type="text"
                                   name="photo" id="photo" title ="La photo est obligatoire"/> <br>
                        
                         
                            
            <button class="boutton" type='submit'> S'INSCRIRE</button> 
          
        </div> <br>
        
      </form>
        <script src="js/formValidation.js"></script>
    </body>
</html>
