<%@page import="java.util.ArrayList"%>
<%@page import="com.model.entites.Evenement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
    ArrayList<Evenement> listeEvenements = (ArrayList)request.getAttribute("listeEvenements");
    Evenement  evenement = (Evenement)request.getAttribute("evenement");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evenements</title>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/index.css" type="text/css"/>
    </head>
    <body>
        <br>
        <h1>Voici Tous les évènements existans</h1>
        <% if( request.getAttribute("message")!=null) { %>
         <center><b><font color=green> <%=request.getAttribute("message")  %></font><b></center>
        <%}%>
        <br> 
          <table style="width:80%">
    <tr>
      <th>Id de l'évènement</th>
      <th>Nom de l'évènement</th>
      <th>Lieu de l'évènement</th>
      <th>Début de l'évènement</th>
      <th>Fin de l'évènement</th>
      <th>Description</th>
    </tr>
    
    <%if(evenement!=null) {%>
       <tr>
      <td> <%=evenement.getIdEvent()%> </td>
     
      <td> <%=evenement.getNomEvent() %> </td>
     <td> <%=evenement.getLieux() %> </td>
      <td> <%=evenement.getHeureDebut() %> </td>
      <td> <%=evenement.getHeureFin()%> </td>
      <td> <%=evenement.getDescription()%> </td>
   
     </tr>
    <% }else { 
     for(Evenement event : listeEvenements){%>
      <tr>
      <td> <%=event.getIdEvent() %> </td>
     
      <td> <%=event.getNomEvent() %> </td>
     <td> <%=event.getLieux()%> </td>
      <td> <%=event.getHeureDebut() %> </td>
      <td> <%=event.getHeureFin() %> </td>
    
       <td> <%=event.getDescription()%> </td>
       
     </tr>
   
   <% } } %>
   
   
        
        
    </body>
</html>
