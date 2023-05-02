<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Log in Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
        
        
    </head>
    <body>
        <form action='controllerInscription' method='post'> 
        <div id = 'login-grid' class='login-grid'>
            <label for='fname'>First name: </label>
            <input type='text' placeholder='Enter your fast name' name='nom' required>
            
            <label for='lname'>Last name: </label>
            <input type='text' placeholder='Enter your last name' name='prenom' required>
            
            <label for='email'>Email:</label>
            <input type='text' placeholder='Enter enter your email' name='email' required>
            
            <label for='phone'>Phone number:</label>
            <input type='text' placeholder='Enter enter your phone number' name='phone' required>
            
            <label for='psw'>Password:</label>
            <input type='password' placeholder='Enter your password' name='psw' required>
            
        
            <label for='Confirm_psw'> Confirm Password: </label>
            <input type='password' placeholder='Confirm your password' name='psw' required>
            
            <label for='bio'> Biographie </label>
            <input type='text' placeholder='Description' name='bio' required>
            
            <label  class="col-sm-4 control-label" for="photo">Photo : </label>
                              
                            <input type="file"
                                   name="photo" id="photo" title ="La photo est obligatoire"/> <br>
                        
                            <a href="home.jsp" style="margin: auto">Register </a> <br>
                            
            <button type='submit'> Connexion </button> 
          
        </div> <br>
        
      </form>
        <script src="js/formValidation.js"></script>
    </body>
</html>
