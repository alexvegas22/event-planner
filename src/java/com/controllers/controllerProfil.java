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
public class controllerProfil extends HttpServlet {

    private List<Utilisateur> listeUtilisateurs;
    UtilisateurService utilisateurService = new UtilisateurService();
    Utilisateur utilisateur = null;
    boolean retour = false;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String email = request.getParameter("email");
            String telephone = request.getParameter("telephone");
            String bio = request.getParameter("bio");
            String photo = request.getParameter("photo");
            String id = request.getParameter("id");
            String password = request.getParameter("psw");
            int userId = 4;

            utilisateur = utilisateurService.chercherUtilisateurParID(userId);
            utilisateur.setNom(nom);
            utilisateur.setPrenom(prenom);
            utilisateur.setEmail(email);
            utilisateur.setTelephone(telephone);
            utilisateur.setBio(bio);
            utilisateur.setPhotoProfil(photo);
            utilisateur.setPassword(password);

            retour = utilisateurService.modifierUnUtilisateur(utilisateur);
            if (retour) {
                String message = "l'abonné  " + utilisateur.getNom() + " " + utilisateur.getPrenom() + " a été modifié avec success ";
                listeUtilisateurs = utilisateurService.afficherLesUtilisateurs();
                request.setAttribute("message", message);
                request.setAttribute("listeUtilisateurs", listeUtilisateurs);
                
                request.getRequestDispatcher("home.jsp").forward(request, response);
            }
            request.getRequestDispatcher("home.jsp").forward(request, response);
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
