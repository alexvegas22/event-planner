package com.controllers;

import com.model.entites.Evenement;
import com.model.entites.Utilisateur;
import com.service.EvenementService;
import com.service.UtilisateurService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author alexr
 */
public class controllerConnexion extends HttpServlet {

    private List<Utilisateur> listeUtilisateurs;
    Utilisateur utilisateur = null;
    UtilisateurService service = new UtilisateurService();

    List<Evenement> listeEvenementUser;
    Evenement evenement = null;
    EvenementService eventService = new EvenementService();

    String url = "index.jsp";

    @Override
    public void init() throws ServletException {
        listeUtilisateurs = service.afficherLesUtilisateurs();

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        boolean connexion = false;
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        System.out.println("email " + email);
        String password = request.getParameter("psw");
        utilisateur = service.verifierEmailMotDePasse(email, password);
        String sauvegarde = request.getParameter("sauvegarde");
        if (utilisateur != null) {
            listeEvenementUser =eventService.chercherEvenementParUserID(utilisateur.getIdUser());
            
            request.setAttribute("userId", utilisateur.getIdUser());
            
            connexion = true;
            HttpSession session = request.getSession(true);
            ((HttpSession) session).setAttribute("nom", utilisateur.getNom());
            
            ((HttpSession) session).setAttribute("userId", utilisateur.getIdUser());
            session.setAttribute("prenom", utilisateur.getPrenom());

            request.setAttribute("listeEvenement", listeEvenementUser);

            
            request.setAttribute("utilisateur", utilisateur);
            request.setAttribute("listeUtilisateurs", listeUtilisateurs);
            
            url = "home.jsp";
            if (email.equals("admin@admin.com")) {

                url = "administration.jsp";
            }
        }

        if (sauvegarde != null) {
            if (sauvegarde.equals("yes")) {
                Cookie monCookie = new Cookie("email", email);
                Cookie passwordCookie = new Cookie("password", password);
                System.out.println("ajout des cookies");
                monCookie.setMaxAge(60 * 60);
                response.addCookie(monCookie);
                response.addCookie(passwordCookie);
            }
        }

        if (!connexion) {
            request.setAttribute("invalide", "L'email ou mot de passe est invalide");
        }
        System.out.println("url : " + url);
        request.getRequestDispatcher(url).include(request, response);
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
