/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.controllers;

import com.model.entites.Utilisateur;
import com.service.UtilisateurService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author djeai
 */
public class controllerUtilisateur extends HttpServlet {

    private List<Utilisateur> listeUtilisateurs;
    Utilisateur utilisateur = null;
    boolean retour = false;
    UtilisateurService utilisateurService = new UtilisateurService();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
         String nom = request.getParameter("nom");
         String intention = request.getParameter("intention");
         String id = request.getParameter("id");
         
         
        if(intention!=null){
              if(intention.equals("supprimer")){
                String message = "l'utilisateur contenant l'id est " + id + " a été supprimé avec succès";
                int idAbonne = Integer.parseInt(id);
                System.out.println("operation: " + intention);
                System.out.println("userId: " + idAbonne);
                retour = utilisateurService.supprimerUnUtilisateur(idAbonne);
                 
                if(retour){
                    System.out.println("suppression: ");
                    request.setAttribute("message", message);
                    listeUtilisateurs = utilisateurService.afficherLesUtilisateurs();
                    request.setAttribute("listeUtilisateurs", listeUtilisateurs);
                    request.getRequestDispatcher("administration.jsp").forward(request, response);
                }

              }else{
                    System.out.println("modification: ");
                    int idAbonne = Integer.parseInt(id);
                    utilisateur = utilisateurService.chercherUtilisateurParID(idAbonne);
                    request.setAttribute("utilisateur", utilisateur);
                    request.getRequestDispatcher("modification.jsp").forward(request, response);
                 }
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
