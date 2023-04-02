/*  bY Aimen
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model.dao;

import com.model.dao.Utilisateur.UtilisateurImpDao;
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
    private static final String SQL_SELECT_EVENEMENTS_PAR_HEURE_FIN = "select * from projetsession.evenements where fin = ?";
    private static final String SQL_SELECT_EVENEMENTS_PAR_LIEUX = "select * from projetsession.evenements where lieux = ?";
     
    private static final String SQL_UPDATE = "update evenements set nom=?, lieux= ?, debut= ?, fin = ?, description=? where id = ?";
   
    private static final String SQL_DELETE = "delete from evenements where id = ?";
    
    private static final String SQL_INSERT_EVENEMENT = "insert into utilisateurs(,nom,lieux,debut,fin,description) value(?,?,?,?,?)";

    @Override
    public List<Evenement> fidAll() {
      List<Evenement> listeEvenement = null;
        try {

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENTS);
            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
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

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENT_PAR_ID);
            // on initialise la propriete nom du l'ulisateur avec sa premiere valeur
            ps.setInt(1, id);

            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
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

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENT_PAR_NOM);
            // on initialise la propriete nom du l'ulisateur avec sa premiere valeur
            ps.setString(1, nom);

            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
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

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENTS_PAR_HEURE_DEBUT);
            // on initialise la propriete nom du l'ulisateur avec sa premiere valeur
            ps.setString(1, heureD);
            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
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

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENTS_PAR_HEURE_FIN);
            // on initialise la propriete nom du l'ulisateur avec sa premiere valeur
            ps.setString(1, heureF);
            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
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

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_EVENEMENTS_PAR_LIEUX);
            // on initialise la propriete nom du l'ulisateur avec sa premiere valeur
            ps.setString(1, lieux);
            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
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

            // Supprimer les lignes dans la table intermédiaire qui dépendent de la ligne parente
            ps1.setInt(1, id);
            ps1.executeUpdate();
            // Supprimer les lignes enfants dans les deux tables qui dépendent de la ligne parente
            ps2.setInt(1, id);
            ps2.executeUpdate();
            ps3.setInt(1, id);
            ps3.executeUpdate();

            // Supprimer la ligne parent
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
            // TODO Auto-generated catch block
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, e);
        }

//		System.out.println("nb ligne " + nbLigne);
        if (nbLigne > 0) {
            retour = true;
        }
        ConnexionBD.closeConnection();
        return retour;
    }
    
}
