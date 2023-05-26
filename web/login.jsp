<%@ page session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  --%>
<!DOCTYPE html>

<html>
    <head>
        <title>Connexion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <script src="js/validationFormulaire.js"></script>

    </head>
    <body>
        <form  action='controllerConnexion' method='post'> 
            <div id = 'login-grid' class='login-grid box'>
                <div> <H1> Tu es de retour!</H1> </div>

                <label for='email'>Email</label>
                <input type='email' placeholder='Enter your username' name='email' required>

                <label for='psw'>Password</label>
                <input type='password' placeholder='Enter your password' name='psw' required> <br> 

                <button type='submit' class="boutton"> Connexion </button>
                <label class="label">
                    <div class="toggle" >
                        <input class="toggle-state" type="checkbox" name="check" value="sauvegarde" />
                        <div class="indicator"></div>
                    </div>
                    <div class="label-text"> Sauvegarder les cookies</div>
                </label>
            </div>

        </form>
    </body>
</html>
