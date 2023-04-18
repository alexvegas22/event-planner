/**
 *
 * @author Melyse
 */

package com.model.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Utilisateur implements Serializable {
    
    // Déclaration des attributs
    private int idUser;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String password;
    private String bio;
    private String photoProfil;
    List<Evenement> listeEvenements;
    
    
    // Constructeur 

    public Utilisateur() {
       listeEvenements = new ArrayList();
    }
    
    public Utilisateur(String nom, String prenom, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        listeEvenements = new ArrayList();
    }

    public Utilisateur(String nom, String prenom, String password, String email, String telephone , String photoProfil) {
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.telephone = telephone;
        this.email = email;
        this.photoProfil = photoProfil;
        listeEvenements = new ArrayList();
    }

    public Utilisateur(int idUser, String nom, String prenom, String password, String email, String photoProfil) {
        this.idUser = idUser;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.email = email;
        this.photoProfil = photoProfil;
        listeEvenements = new ArrayList();
    } 
    
    // Getters
    
    public int getIdUser() {
        return idUser;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhotoProfil() {
        return photoProfil;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getBio() {
        return bio;
    }
    

    

    // Setters
    
    public void setId(int idUser) {
   

        this.idUser = idUser;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhotoProfil(String photoProfil) {
        this.photoProfil = photoProfil;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    
    
    
    public String afficherTitreDesColonnes() {
        String message = "";
        message = String.format(" %-10s  %30s %15s %15s %15s %25s", "Id", "Nom", "Prenom", "Email", "Password", "Photo");
        message+="\n -----------------------------------------------------------------------------------------------------------";
        return message;
    }
  
    @Override
       public String toString() {
       String message = "";
       message = String.format(" %-10d  %30s %15b %15s %15s %15s %25s ",this.idUser,this.nom ,this.prenom, this.email, this.password, this.photoProfil); 
       return message;
    }
    
    
    
    
}
