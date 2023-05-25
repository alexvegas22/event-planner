<%-- 
    Document   : modificationUtilisateur
    Created on : 2023-05-07, 17:58:19
    Author     : Djemaoune Aimen
--%>

<%@page import="com.model.entites.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
 
     Utilisateur  utilisateur = (Utilisateur)request.getAttribute("utilisateur");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modification Utilisateur</title>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/index.css" type="text/css"/>
    </head>
    <body>
        <div>
            <div>
                <h2 align="center">Modification des informations</h2>
                <p align="center"> Nom de l'abonné :<strong><%=(utilisateur != null ? utilisateur.getNom() : "")%> </strong> <strong><%=(utilisateur != null ? utilisateur.getPrenom() : "")%> </strong> </p>
            </div>
                <div class ="formulaireModifUser">
                <form id="signupForm" method="get" action="controllerModificationUtilisateur">
                    <div class="col-sm-5">
                        <input type="hidden" class="form-control" id="id" name="id"  hidden=""value="<%=(utilisateur != null ? utilisateur.getIdUser() : "")%>" />
                    </div>
                    <div>
                        <label  for="nom">Nom :</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="nom" name="nom" value="<%=(utilisateur != null ? utilisateur.getNom(): "")%>" />
                        </div>
                    </div>
                    <div>
                        <label  for="prenom">Prénom :</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="prenom" name="prenom" value="<%=(utilisateur != null ? utilisateur.getPrenom(): "")%>" />
                        </div>
                    </div>
                    <div>
                        <label  for="email">Email :</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="email" name="email" value="<%=(utilisateur != null ? utilisateur.getEmail() : "")%>" />
                        </div>
                    </div>
                    <div>
                        <label  for="telephone">Téléphone :</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control" id="telephone" name="telephone" value="<%=(utilisateur != null ? utilisateur.getTelephone(): "")%>" />
                        </div>
                    </div>
                    <div>
                        <label  for="password">Mot de passe :</label>
                        <div class="col-sm-5">
                            <input type="password"  id="password" name="password" value="<%=(utilisateur != null ? utilisateur.getPassword(): "")%>" />
                        </div>
                    </div>
                    <div >
                        <button class="boutton" type='submit'> Modifier le profil</button>
                    </div>
                </form>
            </div>
            </div>
    </body>
</html>
