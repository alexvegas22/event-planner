/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model.entites;

import java.io.Serializable;

/**
 *
 * @author Aimen
 */
public class Administrateur extends Utilisateur implements Serializable{
    
    

    public Administrateur() {
    }

    public Administrateur(String nom, String prenom, String email, String password) {
        super(nom, prenom, email, password);
    }

    public Administrateur(String nom, String prenom, String password, String email, String telephone, String bio,String photoProfil) {
        super(nom, prenom, password, email, telephone, bio, photoProfil);
    }

    public Administrateur(int idUser, String nom, String prenom, String password, String email, String photoProfil) {
        super(idUser, nom, prenom, password, email, photoProfil);
    }
    
    
    
    
}
