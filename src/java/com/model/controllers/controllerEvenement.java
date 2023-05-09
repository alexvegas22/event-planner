/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.model.controllers;

import com.model.entites.Evenement;
import com.model.service.EvenementService;
import com.model.service.UtilisateurService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author djeai
 */
public class controllerEvenement extends HttpServlet {

    private List<Evenement> listeEvenements;
    EvenementService eventService = new EvenementService();
    Evenement evenement = null;
    boolean retour = false;
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nom = request.getParameter("nom");
        String lieu = request.getParameter("lieu");
       

        String debut = request.getParameter("debut");
        String fin = request.getParameter("fin");
        
        String description = request.getParameter("description");
        

        Time d = Time.valueOf(debut);
        Time f = Time.valueOf(fin);
        evenement = new Evenement (nom,lieu, d,f, description);
        retour = eventService.ajouterUnEvenement(evenement);
       
        if (retour){
            String message = "L'évènement " + nom + "" + " a été ajouté avec success";
            listeEvenements = eventService.afficherLesEvenement();
            request.setAttribute("message", message);
            request.setAttribute("listeEvenements", listeEvenements);
            request.getRequestDispatcher("evenement.jsp").forward(request, response);
            
            
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
