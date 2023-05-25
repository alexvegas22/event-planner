<%@page import="com.model.entites.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
 
     Utilisateur  utilisateur = (Utilisateur)request.getAttribute("utilisateur");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votre profil</title>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/index.css" type="text/css"/>
        <link rel="stylesheet" href="css/administration.css" type="text/css"/>
    </head>
    <body>
        <div>
            <div>
                <h1 align="center"> <strong>Bienvenue <%=session.getAttribute("prenom")%> <%=session.getAttribute("nom")%> </strong> </h1>
            </div>
            <div class ="radiogroup">
                <br>
                <h3 align="center">Votre profil</h3>
                <p><%=session.getAttribute("photo")%></p>
                <p>Prénom : <%=session.getAttribute("prenom")%></p>
                <p>Nom : <%=session.getAttribute("nom")%></p>
                <p>Email : <%=session.getAttribute("email")%></p>
                <p>Telephone : <%=session.getAttribute("telephone")%></p>
                <p>Bio : <%=session.getAttribute("bio")%></p>
            </div>
            <div class ="formulaireModifUser">
                <form id="signupForm" method="get" action="controllerProfil">
                    <div>
                        <label  for="nom">Votre nom :</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="nom" name="nom" value="<%=(utilisateur != null ? utilisateur.getNom(): "")%> <%=session.getAttribute("nom")%>" />
                        </div>
                    </div>
                    <div>
                        <label  for="prenom">Votre prénom :</label>
                        <div class="col-sm-5">
                                <input type="text" class="form-control" id="prenom" name="prenom" value="<%=(utilisateur != null ? utilisateur.getPrenom(): "")%> <%=session.getAttribute("prenom")%>" />
                        </div>
                    </div>
                    <div>
                        <label  for="email">Votre email :</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="email" name="email" value="<%=(utilisateur != null ? utilisateur.getEmail() : "")%> <%=session.getAttribute("email")%>" />
                        </div>
                    </div>
                    <div>
                        <label  for="telephone">Votre numéro de téléphone :</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="telephone" name="telephone" value="<%=(utilisateur != null ? utilisateur.getTelephone(): "")%>" <%=session.getAttribute("telephone")%>/>
                        </div>
                    </div>
                    <div>
                        <label  for="bio">Votre bio :</label>
                        <div class="col-sm-5">
                            <input type="textarea" class="form-control" id="bio" name="bio" value="<%=(utilisateur != null ? utilisateur.getBio(): "")%>" <%=session.getAttribute("bio")%>/>
                        </div>
                    </div>
                    <div>
                        <label  for="password">Mot de passe :</label>
                        <div class="col-sm-5">
                            <input type="password"  id="password" name="password" value="<%=(utilisateur != null ? utilisateur.getPassword(): "")%>" <%=session.getAttribute("password")%>/>
                        </div>
                    </div>
                    <div >
                        <input type="submit"  class="btn btn-primary btn-lg" value="Modifier"  id="submit"  />
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
