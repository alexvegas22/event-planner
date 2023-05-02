<%-- 
    Document   : administration
    Created on : 2023-04-22, 00:17:27
    Author     : djemaoune aimen
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.model.entites.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
    ArrayList<Utilisateur> listeUtilisateurs = (ArrayList)request.getAttribute("listeUtilisateurs");
     Utilisateur  utilisateur = (Utilisateur)request.getAttribute("utilisateur");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Utilisateurs</title>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/index.css" type="text/css"/>
    </head>
    <body>
        <br>
        <h1>Voici Tous les utilisateurs existans</h1>
        <% if( request.getAttribute("message")!=null) { %>
         <center><b><font color=green> <%=request.getAttribute("message")  %></font><b></center>
        <%}%>
        <br> 
          <table style="width:79%">
    <tr>
      <th>Id</th>
      <th>Nom</th>
      <th>Prenom</th>
      <th>Email</th>
      <th>Telephone</th>
      <th>Bio</th>
      <th>Photo De Profil</th>
    </tr>
    
    <%if(utilisateur!=null) {%>
       <tr>
      <td> <%=utilisateur.getIdUser()%> </td>
     
      <td> <%=utilisateur.getNom() %> </td>
     <td> <%=utilisateur.getPrenom() %> </td>
      <td> <%=utilisateur.getEmail() %> </td>
      <td> <%=utilisateur.getTelephone()%> </td>
      <td> <%=utilisateur.getBio()%> </td>
   
      <td>
    <img alt="etu image" src="images/<%=utilisateur.getPhotoProfil()%>" height="42" width="50"/> 
    </td> 
       
     </tr>
    <% }else { 
     for(Utilisateur user : listeUtilisateurs){%>
      <tr>
      <td> <%=user.getIdUser() %> </td>
     
      <td> <%=user.getNom() %> </td>
     <td> <%=user.getPrenom() %> </td>
      <td> <%=user.getEmail() %> </td>
      <td> <%=user.getTelephone() %> </td>
    
       <td> <%=user.getBio()%> </td>
       
    <td>
    <img alt="etu image" src="images/<%=user.getPhotoProfil()%>" height="42" width="50"/> 
    </td> 
     </tr>
   
   <% } } %>
   
   
        
        
    </body>
</html>
