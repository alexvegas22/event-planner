
package com.controllers;

import com.model.entites.Utilisateur;
import com.service.UtilisateurService;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alexr
 */
public class controllerInscription extends HttpServlet {
    private List<Utilisateur> listeUtilisateurs;
    UtilisateurService utiliServ = new UtilisateurService();
    Utilisateur utilisateur = null;
    boolean retour = false;
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String nom = request.getParameter("nom");
        String email = request.getParameter("email");

        String prenom = request.getParameter("prenom");
        String telephone = request.getParameter("phone");
        String password = request.getParameter("psw");
        String bio = request.getParameter("bio");
        String photo = request.getParameter("photo");

        
        utilisateur = new Utilisateur (nom,prenom, password,email, telephone,bio,photo);
        retour = utiliServ.ajouterUnUtilisateur(utilisateur);
       
        if (retour){
            String message = "L'utilisateur" + nom + "" + " a été ajouté avec success";
            listeUtilisateurs = utiliServ.afficherLesUtilisateurs();
            request.setAttribute("message", message);
            request.setAttribute("listeUtilisateurs", listeUtilisateurs);
            HttpSession session = request.getSession(true);
            ((HttpSession) session).setAttribute("nom", utilisateur.getNom());
            session.setAttribute("prenom", utilisateur.getPrenom());
            request.setAttribute("utilisateur", utilisateur);
            request.setAttribute("listeUtilisateurs", listeUtilisateurs);
            request.getRequestDispatcher("home.jsp").forward(request, response);
            
            
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
