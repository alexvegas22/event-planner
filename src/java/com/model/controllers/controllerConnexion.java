/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.model.controllers;
import com.model.entites.Utilisateur;
import com.model.service.UtilisateurService;

import java.io.IOException;
import java.io.PrintWriter;
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
    public void init() throws ServletException{
        listeUtilisateurs =  service.afficherLesUtilisateurs();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        boolean connexion = false;
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        System.out.println("email " + email);
        String password = request.getParameter("psw");
        String sauvegarde = request.getParameter("sauvegarde");
        utilisateur = service.verifierEmailMotDePasse(email, password);


        if (utilisateur != null) {

            connexion = true;
            HttpSession session = request.getSession(true);
            ((HttpSession) session).setAttribute("nom", utilisateur.getNom());
            session.setAttribute("prenom", utilisateur.getPrenom());

            if (sauvegarde != null) {
                if (sauvegarde.equals("yes")) {
                    Cookie monCookie = new Cookie("email", email);
                    Cookie passwordCookie = new Cookie("password", password);
                    System.out.println("ajouter des cookies");
                    passwordCookie.setMaxAge(60 * 60);
                    monCookie.setMaxAge(60 * 60);
                    response.addCookie(monCookie);
                    response.addCookie(passwordCookie);
                }
            }
            request.getRequestDispatcher("index.jsp").forward(request, response);


        }

    }
}