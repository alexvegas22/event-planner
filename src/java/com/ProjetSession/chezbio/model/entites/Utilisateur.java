package com.ProjetSession.chezbio.model.entites;

import java.io.Serializable;

public class Utilisateur implements Serializable {

/**
 *
 * @author Melyse
 */
    
    // Déclaration des attributs
    int idUser;
    String nom;
    String prenom;
    String password;
    String email;
    String photoProfil;

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

    
    public void setIdUser(int idUser) {
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
}
