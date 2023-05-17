/*  bY Aimen Djemaoune
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model.dao;

import com.model.entites.Evenement;
import com.model.singleton.ConnexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EvenementDaoImpl implements EvenementDao {
    
    private static final String SQL_SELECT_EVENEMENTS = "select * from evenements";
    private static final String SQL_SELECT_EVENEMENT_PAR_ID = "select * from evenements where id=?";
    private static final String SQL_SELECT_EVENEMENT_PAR_NOM = "select * from evenements where nom=?";
    private static final String SQL_SELECT_EVENEMENTS_PAR_HEURE_DEBUT = "select * from evenements where debut=?";
    private static final String SQL_SELECT_EVENEMENTS_PAR_HEURE_FIN = "select * from planner.evenements where fin = ?";
    private static final String SQL_SELECT_EVENEMENTS_PAR_LIEUX = "select * from planner.evenements where lieux = ?";
     
    private static final String SQL_UPDATE = "update evenements set nom=?, lieux= ?, debut= ?, fin = ?, description=? where id = ?";
   
    private static final String SQL_DELETE = "delete from evenements where id = ?";
    
    private static final String SQL_INSERT_EVENEMENT = "insert into  evenements (nom,lieux,debut,fin,description) value(?,?,?,?,?)";

    @Override
    public List<Evenement> findAll() {
      List<Evenement> listeEvenement = null;
        try {

            
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENTS);
            
            ResultSet result = ps.executeQuery();

          
            listeEvenement = new ArrayList();
            while (result.next()) {
                Evenement evenement = new Evenement();
                evenement.setIdEvent(result.getInt("id"));
                evenement.setNomEvent(result.getString("nom"));
                evenement.setLieux(result.getString("lieux"));
                evenement.setHeureDebut(result.getTime("debut"));
                evenement.setHeureFin(result.getTime("fin"));
                evenement.setDescription(result.getString("description"));
                listeEvenement.add(evenement);
            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listeEvenement;
    }

    @Override
    public Evenement findById(int id) {
        Evenement evenement = null;
        try {

            
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENT_PAR_ID);
  
            ps.setInt(1, id);

     
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                evenement = new Evenement();
                evenement.setIdEvent(result.getInt("id"));
                evenement.setNomEvent(result.getString("nom"));
                evenement.setLieux(result.getString("lieux"));
                evenement.setHeureDebut(result.getTime("debut"));
                evenement.setHeureFin(result.getTime("fin"));
                evenement.setDescription(result.getString("description"));

            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return evenement;
    }

    @Override
    public Evenement findByName(String nom) {
        Evenement evenement = null;
        try {

            
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENT_PAR_NOM);
           
            ps.setString(1, nom);

           
            ResultSet result = ps.executeQuery();

            
            while (result.next()) {
                evenement = new Evenement();
                evenement.setIdEvent(result.getInt("id"));
                evenement.setNomEvent(result.getString("nom"));
                evenement.setLieux(result.getString("lieux"));
                evenement.setHeureDebut(result.getTime("debut"));
                evenement.setHeureFin(result.getTime("fin"));
                evenement.setDescription(result.getString("description"));

            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return evenement;
       
    }

    @Override
    public List<Evenement> findByHeureDebut(String heureD) {
        List<Evenement> listeEvenement = null;
        try {

          
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENTS_PAR_HEURE_DEBUT);
       
            ps.setString(1, heureD);
         
            ResultSet result = ps.executeQuery();

         
            listeEvenement = new ArrayList();
            while (result.next()) {
                Evenement evenement = new Evenement();
                evenement.setIdEvent(result.getInt("id"));
                evenement.setNomEvent(result.getString("nom"));
                evenement.setLieux(result.getString("lieux"));
                evenement.setHeureDebut(result.getTime("debut"));
                evenement.setHeureFin(result.getTime("fin"));
                evenement.setDescription(result.getString("description"));
                listeEvenement.add(evenement);
            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listeEvenement;
        
    }

    @Override
    public List<Evenement> findByHeureFin(String heureF) {
        List<Evenement> listeEvenement = null;
        try {

            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENTS_PAR_HEURE_FIN);
            
            ps.setString(1, heureF);
       
            ResultSet result = ps.executeQuery();

            
            listeEvenement = new ArrayList();
            while (result.next()) {
                Evenement evenement = new Evenement();
                evenement.setIdEvent(result.getInt("id"));
                evenement.setNomEvent(result.getString("nom"));
                evenement.setLieux(result.getString("lieux"));
                evenement.setHeureDebut(result.getTime("debut"));
                evenement.setHeureFin(result.getTime("fin"));
                evenement.setDescription(result.getString("description"));
                listeEvenement.add(evenement);
            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listeEvenement;
      
    }

    @Override
    public List<Evenement> findByLieux(String lieux) {
        List<Evenement> listeEvenement = null;
        try {

            
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENTS_PAR_LIEUX);
            
            ps.setString(1, lieux);
         
            ResultSet result = ps.executeQuery();

            
            listeEvenement = new ArrayList();
            while (result.next()) {
                Evenement evenement = new Evenement();
                evenement.setIdEvent(result.getInt("id"));
                evenement.setNomEvent(result.getString("nom"));
                evenement.setLieux(result.getString("lieux"));
                evenement.setHeureDebut(result.getTime("debut"));
                evenement.setHeureFin(result.getTime("fin"));
                evenement.setDescription(result.getString("description"));
                listeEvenement.add(evenement);
            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listeEvenement;
        
    }

    @Override
    public boolean delete(int id) {
        boolean retour = false;
        int nbLigne = 0;

        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;
        PreparedStatement ps;

        try {
            

            ps = ConnexionBD.getConnection().prepareStatement(SQL_DELETE);

            
            ps1.setInt(1, id);
            ps1.executeUpdate();
           
            ps2.setInt(1, id);
            ps2.executeUpdate();
            ps3.setInt(1, id);
            ps3.executeUpdate();

           
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (nbLigne > 0) {
            retour = true;
        }
        ConnexionBD.closeConnection();
        return retour;
    }

    @Override
    public boolean create(Evenement event) {
        int nbLign = 0;
        boolean retour = false;
        PreparedStatement ps;
        try {
            ps = ConnexionBD.getConnection().prepareStatement(SQL_INSERT_EVENEMENT);
            ps.setString(1, event.getNomEvent());
            ps.setString(2, event.getLieux());
            ps.setTime(3, event.getHeureDebut());
            ps.setTime(4, event.getHeureFin());
            ps.setString(5, event.getDescription());
            nbLign = ps.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(nbLign>0){
                retour = true;
            }
        ConnexionBD.closeConnection();
        return retour;
       
    }

    @Override
    public boolean update(Evenement event) {
      boolean retour = false;
        int nbLigne = 0;
        PreparedStatement ps;

        try {

            ps = ConnexionBD.getConnection().prepareStatement(SQL_UPDATE);
            ps.setString(1, event.getNomEvent());

            ps.setString(2, event.getLieux());

            ps.setInt(3, event.getIdEvent());
            
            ps.setTime(4, event.getHeureDebut());
            
            ps.setTime(5, event.getHeureFin());
            
            ps.setString(6, event.getDescription());

            nbLigne = ps.executeUpdate();

        } catch (SQLException e) {
      
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, e);
        }


        if (nbLigne > 0) {
            retour = true;
        }
        ConnexionBD.closeConnection();
        return retour;
    }
    
}
