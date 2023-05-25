package com.controllers;

import com.model.dao.UtilisateurImpDao;
import com.model.dao.EvenementDaoImpl;
import com.model.entites.Evenement;
import com.model.entites.Utilisateur;
import com.service.EvenementService;
import com.service.UtilisateurService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexr
 */
public class controllerRechercheAdmin extends HttpServlet {

    private List<Utilisateur> listeUtilisateurs;
    Utilisateur utilisateur = null;
    UtilisateurService service = new UtilisateurService();

    private List<Evenement> listeEvenements;
    EvenementService eventService = new EvenementService();
    Evenement evenement = null;
    
    boolean retour = false;

    @Override
    public void init() throws ServletException {
        listeUtilisateurs = service.afficherLesUtilisateurs();
        listeEvenements = eventService.afficherLesEvenement();
        
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //UtilisateurImpDao daoUser = new UtilisateurImpDao(); 
        //EvenementDaoImpl daoEvent = new EvenementDaoImpl(); 
        ArrayList<Utilisateur> listeUserRecherche = new ArrayList<Utilisateur>();
        ArrayList<Evenement> listeEventRecherche = new ArrayList<Evenement>();
        
        
        request.setAttribute("listeUtilisateurs", listeUtilisateurs);
        request.setAttribute("listeEvenements", listeEvenements);
        
   
        utilisateur = service.chercherUtilisateurParID(1);
        request.setAttribute("utilisateur", utilisateur);
        
        
        
        if (request.getParameter("recherche") == "utilisateurs") {
            
            utilisateur=(service.chercherUtilisateurParNom("admin"));
           
            try {
                int id = Integer.parseInt((String)request.getParameter("barreDeRecherche"));
                utilisateur = (service.chercherUtilisateurParID(id));
                
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
            try {
                 utilisateur=(service.chercherUtilisateurParNom((String)request.getParameter("barreDeRecherche")));
            } catch (NumberFormatException e) {
                System.out.println("aucun utilisateur avec ce nom");
            }
            try {
                 listeUserRecherche.add(service.chercherUtilisateurParEmail((String)request.getParameter("barreDeRecherche")));
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
            request.setAttribute("", listeUserRecherche);
            request.setAttribute("utilisateur", utilisateur);
            
        }
        if (request.getParameter("recherche") == "évenéments") {
               System.out.println("evenements");
        }

        request.getRequestDispatcher("administration.jsp").include(request, response);

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
