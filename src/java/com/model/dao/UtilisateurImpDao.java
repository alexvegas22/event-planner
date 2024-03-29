
package com.model.dao;

import com.model.entites.Utilisateur;
import com.model.singleton.ConnexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aimen
 */
public class UtilisateurImpDao implements UtilisateurDao {
    
    // Déclaration 
    
    private static final String SQL_SELECT_UTILISATEURS = "select * from utilisateurs";
    private static final String SQL_SELECT_UTILISATEUR_PAR_ID = "select * from utilisateurs where id=?";
    private static final String SQL_SELECT_UTILISATEUR_PAR_NOM = "select * from utilisateurs where nom=?";
    private static final String SQL_SELECT_UTILISATEUR_PAR_EMAIL = "select * from utilisateurs where email=?";
    private static final String SQL_SELECT_UTILISATEUR_PAR_EMAIL_MOTDEPASSE = "select * from planner.utilisateurs where email = ? and password = ?";
     
    private static final String SQL_SELECT_UTILISATEUR_PAR_RECHERCHE= "select * from planner.utilisateurs where nom=? or prenom=?";
    
    private static final String SQL_UPDATE = "update utilisateurs set nom =?, prenom=?, email =?, telephone=?, password = ?  where id = ?";
   
    private static final String SQL_DELETE = "delete from utilisateurs where id = ?";
    
    private static final String SQL_INSERT_UTILISATEUR = "insert into utilisateurs (nom, prenom, email, telephone, password, bio,photo) value(?,?,?,?,?,?,?)";

    @Override
    public List<Utilisateur> findAll() {
       List<Utilisateur> listeUtilisateur = null;
        try {

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_UTILISATEURS);
            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
            listeUtilisateur = new ArrayList();
            while (result.next()) {
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId(result.getInt("id"));
                utilisateur.setNom(result.getString("nom"));
                utilisateur.setPrenom(result.getString("prenom"));
                utilisateur.setEmail(result.getString("email"));
                utilisateur.setPassword(result.getString("password"));
                utilisateur.setBio(result.getString("bio"));
                utilisateur.setPhotoProfil(result.getString("photo"));
                listeUtilisateur.add(utilisateur);
            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listeUtilisateur;
    }

    @Override
    public List<Utilisateur> findSearch(String nom) {
        List<Utilisateur> listeUtilisateur = null;
        try {

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_UTILISATEUR_PAR_RECHERCHE);
            
            ps.setString(1, nom);
            ps.setString(2, nom); 
            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
            listeUtilisateur = new ArrayList();
            while (result.next()) {
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId(result.getInt("id"));
                utilisateur.setNom(result.getString("nom"));
                utilisateur.setPrenom(result.getString("prenom"));
                utilisateur.setEmail(result.getString("email"));
                utilisateur.setPassword(result.getString("password"));
                utilisateur.setBio(result.getString("bio"));
                utilisateur.setPhotoProfil(result.getString("photo"));
                listeUtilisateur.add(utilisateur);
            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listeUtilisateur;
    }
    
    @Override
    public Utilisateur findById(int id) {
        Utilisateur utilisateur = null;
        try {

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_UTILISATEUR_PAR_ID);
            // on initialise la propriete nom du l'ulisateur avec sa premiere valeur
            ps.setInt(1, id);

            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
            while (result.next()) {
                utilisateur = new Utilisateur();
                utilisateur.setId(result.getInt("id"));
                utilisateur.setNom(result.getString("nom"));
                utilisateur.setPrenom(result.getString("prenom"));
                utilisateur.setEmail(result.getString("email"));
                utilisateur.setPassword(result.getString("password"));
                utilisateur.setBio(result.getString("bio"));
                utilisateur.setPhotoProfil(result.getString("photo"));

            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return utilisateur;
    }

    @Override
    public Utilisateur findByName(String nom) {
        Utilisateur utilisateur = null;
        try {

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_UTILISATEUR_PAR_NOM);
            // on initialise la propriete nom du l'ulisateur avec sa premiere valeur
            ps.setString(1, nom);
            
            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
            while (result.next()) {
                utilisateur = new Utilisateur();
                utilisateur.setId(result.getInt("id"));
                utilisateur.setNom(result.getString("nom"));
                utilisateur.setPrenom(result.getString("prenom"));
                utilisateur.setEmail(result.getString("email"));
                utilisateur.setPassword(result.getString("password"));
                utilisateur.setBio(result.getString("bio"));
                utilisateur.setPhotoProfil(result.getString("photo"));
            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utilisateur;
    }

    @Override
    public Utilisateur findByEmail(String email) {
       Utilisateur utilisateur = null;
        try {

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_UTILISATEUR_PAR_EMAIL);
            // on initialise la propriete nom du l'ulisateur avec sa premiere valeur
            ps.setString(1, email);

            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
            while (result.next()) {
                utilisateur = new Utilisateur();
                utilisateur.setId(result.getInt("id"));
                utilisateur.setNom(result.getString("nom"));
                utilisateur.setPrenom(result.getString("prenom"));
                utilisateur.setEmail(result.getString("email"));
                utilisateur.setPassword(result.getString("password"));
                utilisateur.setBio(result.getString("bio"));
                utilisateur.setPhotoProfil(result.getString("photo"));

            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return utilisateur;
    }

    @Override
    public Utilisateur existsByEmailAndPassword(String email, String motDePasse) {
        Utilisateur utilisateur = null;
        try {

            // Initilise la requete préparé de la basé sur la connexion
            // la requete SQL passé en argument pour construire l'objet PreparedStatement
            PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(SQL_SELECT_UTILISATEUR_PAR_EMAIL_MOTDEPASSE);
            // on initialise la propriete nom du l'ulisateur avec sa premiere valeur
            ps.setString(1, email);
            ps.setString(2, motDePasse);

            // on execute la requete  et on recupere les resultats dans la requete
            ResultSet result = ps.executeQuery();

            //initilisation de la listeUtilisateur
            while (result.next()) {
                utilisateur = new Utilisateur();
                utilisateur.setId(result.getInt("id"));
                utilisateur.setNom(result.getString("nom"));
                utilisateur.setPrenom(result.getString("prenom"));
                utilisateur.setEmail(result.getString("email"));
                utilisateur.setPassword(result.getString("password"));
                utilisateur.setBio(result.getString("bio"));
                utilisateur.setPhotoProfil(result.getString("photo"));

            }
            ConnexionBD.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurImpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return utilisateur;
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

            // Supprimer la ligne parente
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
    public boolean create(Utilisateur utilisateur) {
        boolean retour = false;
        int nbLigne = 0;
        PreparedStatement ps;

        try {
            ps = ConnexionBD.getConnection().prepareStatement(SQL_INSERT_UTILISATEUR);
            //   Insérer les données dans la table parente, utilisateurs
            ps.setString(1, utilisateur.getNom());
            ps.setString(2, utilisateur.getPrenom());
            ps.setString(3, utilisateur.getEmail());
            ps.setString(4, utilisateur.getTelephone());
            ps.setString(5, utilisateur.getPassword());
            ps.setString(6, utilisateur.getBio());
            ps.setString(7, utilisateur.getPhotoProfil());
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

    @Override
    public boolean update(Utilisateur utilisateur) {
       boolean retour = false;
        int nbLigne = 0;
        PreparedStatement ps;

        try {

            ps = ConnexionBD.getConnection().prepareStatement(SQL_UPDATE);
            ps.setString(1, utilisateur.getNom());
            ps.setString(2, utilisateur.getPrenom());
            ps.setString(3, utilisateur.getEmail());
            ps.setString(4, utilisateur.getTelephone());
            ps.setString(5, utilisateur.getPassword());
            ps.setInt(6, utilisateur.getIdUser());
            
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
