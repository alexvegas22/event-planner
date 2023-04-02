<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Log in Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
    </head>
    <body>
        <form action='' method='post'> 
        <div id = 'login-grid' class='login-grid'>
            <label for='email'>Username</label>
            <input type='text' placeholder='Enter your username' name='uname' required>
        
            <label for='psw'>Password</label>
            <input type='password' placeholder='Enter your password' name='psw' required> <br> 
            <a href="home.jsp" >  Connexion </a>
            <button type='submit'> Connexion </button>
          
        </div>
        
      </form>
    </body>
</html>
