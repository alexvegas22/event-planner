/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.controllers;

import com.model.entites.Utilisateur;
import com.service.UtilisateurService;
import com.model.entites.Evenement;
import com.service.EvenementService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controllerAdministration extends HttpServlet {

    private List<Utilisateur> listeUtilisateurs;
    Utilisateur utilisateur = null;
    boolean retourU = false;
    UtilisateurService utilisateurService = new UtilisateurService();
    
    private List<Evenement> listeEvenements;
    Evenement evenement = null;
    boolean retourE = false;
    EvenementService evenementService = new EvenementService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            
            String operation = request.getParameter("operation");
            
            switch (operation) {
            case "modifierUser":
                {
                    String id = request.getParameter("idUser");
                    
                    System.out.println("modificationUser: ");
                    int userId = Integer.parseInt(id);
                    utilisateur = utilisateurService.chercherUtilisateurParID(userId);
                    request.setAttribute("utilisateur", utilisateur);
                    request.getRequestDispatcher("modificationUtilisateur.jsp").forward(request, response);
                    
                    break;
                }
            case "supprimerUser":
                {
                    String id = request.getParameter("idUser");
                    
                    String message = "l'utilisateur dont l'id est " + id + " a été supprimé";
                    int userId = Integer.parseInt(id);
                    retourU = utilisateurService.supprimerUnUtilisateur(userId);
                    if(retourU){
                        System.out.println("suppressionUser: ");
                        request.setAttribute("message", message);
                        
                        listeUtilisateurs = utilisateurService.afficherLesUtilisateurs();
                        request.setAttribute("listeUtilisateurs", listeUtilisateurs);
                        listeEvenements = evenementService.afficherLesEvenement();
                        request.setAttribute("listeEvenements", listeEvenements);
                        
                        request.getRequestDispatcher("administration.jsp").forward(request, response);
                }
                    
                    break;
                }
            case "modifierEvent":
                {
                    String id = request.getParameter("idEvent");
                    
                    System.out.println("modificationEvent: ");
                    int eventId = Integer.parseInt(id);
                    evenement = evenementService.chercherEvenementParID(eventId);
                    request.setAttribute("evenement", evenement);
                    request.getRequestDispatcher("modificationEvenement.jsp").forward(request, response);
                    
                    break;
                }
              
            case "supprimerEvent":
                {
                    String id = request.getParameter("idEvent");
                     String message = "l'evenement dont l'id est " + id + " a été supprimé";
                    int eventId = Integer.parseInt(id);
                    retourE = evenementService.supprimerUnEvenement(eventId);
                    if(retourE){
                        System.out.println("suppressionEvent: ");
                        request.setAttribute("message", message);
                        
                        listeUtilisateurs = utilisateurService.afficherLesUtilisateurs();
                        request.setAttribute("listeUtilisateurs", listeUtilisateurs);
                        listeEvenements = evenementService.afficherLesEvenement();
                        request.setAttribute("listeEvenements", listeEvenements);
                        
                        request.getRequestDispatcher("administration.jsp").forward(request, response);
                }
                    break;
                }
            default:
                listeUtilisateurs = utilisateurService.afficherLesUtilisateurs();
                request.setAttribute("listeUtilisateurs", listeUtilisateurs);
                request.getRequestDispatcher("administration.jsp").forward(request, response);
                break;
        }
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
