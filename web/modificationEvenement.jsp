<%-- 
    Document   : modificationEvenement
    Created on : 2023-05-07, 18:36:36
    Author     : djemaoune aimen
--%>


<%@page import="com.model.entites.Evenement"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
 
     Evenement  evenement = (Evenement)request.getAttribute("utilisateur");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Midification Evenement</title>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/index.css" type="text/css"/>
    </head>
    <body>
                <div>
                  <div>
                <h2 align="center">Modification des informations</h2>
                <p align="center"> De le l'évenement :<strong><%=(evenement != null ? evenement.getNomEvent() : "")%> </strong>  </p>

            </div>
                <form id="signupForm" method="post" 
                      action="modificationEvenementController">
                    <div>
                     
                        <div>
                            <input type="hidden"  id="id"
                                   name="id"  hidden=""value="<%=(evenement != null ? evenement.getIdEvent() : "")%>" />
                        </div>
                    </div>
                    <div>
                        <label  for="lieu">Lieux de l'évènement :</label>
                        <div >
                            <input type="text"  id="nom"
                                   name="lieu" value="<%=(evenement != null ? evenement.getLieux(): "")%>" />
                        </div>
                    </div>
                  
                    <div >
                        <label  for="time">Début de l'évènement :</label>
                        <div class="col-sm-5">
                          
                             <input type="time"  id="debut"
                                   name="debut" value="<%=(evenement != null ? evenement.getHeureDebut(): "")%>" />
                        </div>
                    </div>
                        
                    <div >
                        <label  for="time">Fin de l'évènement :</label>
                        <div class="col-sm-5">
                          
                             <input type="time"  id="fin"
                                   name="debut" value="<%=(evenement != null ? evenement.getHeureDebut(): "")%>" />
                        </div>
                    </div>

                    <div >
                        <div >

                             
                                  <input type="submit"   
                                   value="ModificationEvenement"  id="submit"  />

                        </div>
                    </div>
                </form>
            </div>
    </body>
</html>
