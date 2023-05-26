<%-- 
    Document   : modificationEvenement
    Created on : 2023-05-07, 18:36:36
    Author     : djemaoune aimen
--%>


<%@page import="com.model.entites.Evenement"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
 
     Evenement  evenement = (Evenement)request.getAttribute("evenement");
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

            </div>
                <form id="signupForm" method="post" 
                      action="controllerModificationEvenements">
                    <div>
                     
                        <div>
                            <input type="hidden"  id="id"
                                   name="id"  value="<%= evenement.getIdEvent()%>" />
                        </div>
                        <div>
                            <input type="hidden"  id="idUser" name="idUser"  value="5" />
                        </div>
                    </div>
                        <div>
                        <label  for="lieu">Nom de l'évènement :</label>
                        <div >
                            <input type="text"  id="nom"
                                   name="nom" value="<%=(evenement != null ? evenement.getNomEvent() : "")%>" />
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
                        <label  for="debut">Début de l'évènement :</label>
                        <div class="col-sm-5">
                          
                             <input type="datetime-local" value="2000-07-01T12:00" id="debut" name="debut" />
                        </div>
                    </div>
                        
                    <div >
                        <label  for="fin">Fin de l'évènement :</label>
                        <div class="col-sm-5">
                          
                             <input type="datetime-local" value="2000-07-01T12:00" id="fin" name="fin" />
                        </div>
                    </div>
                        <div >
                        <label  for="time">Description :</label>
                        <div class="col-sm-5">
                          
                             <input type="text"  id="description"
                                   name="description" />
                        </div>
                    </div>

                    <div >
                        <div >
                            <button type="submit" value="ModificationEvenement"  id="submit"  >
                                Modifier l'événement
                            </button>

                        </div>
                    </div>
                </form>
            </div>
    </body>
</html>
