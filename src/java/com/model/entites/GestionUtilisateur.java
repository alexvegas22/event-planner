/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model.entites;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aimen
 */
public class GestionUtilisateur {

    private List<Utilisateur> listeUtilisateurs;

    public GestionUtilisateur() {
        
        listeUtilisateurs = new ArrayList();
        
    }

    public List<Utilisateur> getListeUtilisateurs() {
        return listeUtilisateurs;
    }

    public void setListeUtilisateurs(List<Utilisateur> listeUtilisateurs) {
        this.listeUtilisateurs = listeUtilisateurs;
    }

   public void afficherLesUtilisateurs() {
        int utilisateurs = listeUtilisateurs.size(); // lenght

        if (utilisateurs> 0) {
            for (Utilisateur utilisateur : listeUtilisateurs) {
                System.out.println(utilisateur);
            }

        } else {
            System.out.println(" Aucun utilisateur trouvé ");
        }
    }
   
    public void ajouterUnUtilisateur(Utilisateur utilisateur) {

        listeUtilisateurs.add(utilisateur);
    }

    
    public void supprimerUnUtilisateur(int indice) {
        
        Utilisateur utilisateur = null;
        if (indice < listeUtilisateurs.size()) {
            utilisateur = (Utilisateur) listeUtilisateurs.get(indice);
        }
        if (utilisateur != null) {
            listeUtilisateurs.remove(indice);
            System.out.println(utilisateur.getNom() + " " + utilisateur.getPrenom() + " a été supprimé ");

        } else {
            System.out.println(" L'utilisateur d'indice " + indice + " n'existe pas");
        }

    }
    public void modifierUnUtilisateur( int indice){
       Scanner lectureClavier = new Scanner(System.in);
       Utilisateur utilisateur = null;
        if (indice < listeUtilisateurs.size()) {
            utilisateur = (Utilisateur) listeUtilisateurs.get(indice);
        }
        if (utilisateur != null) {
              System.out.println("Entrez email ");
              String email = lectureClavier.next();
              
              System.out.println("Entrez le nom de l'utilisateur");
              String nom = lectureClavier.next();
              System.out.println("Entrez le prenom ");
              String prenom = lectureClavier.next();
              System.out.println("Entrez password de l'utilisateur");
              String password = lectureClavier.next();
              System.out.println("Entrez la photo de profil");
              String photo = lectureClavier.next();
              utilisateur.setEmail(email);
              utilisateur.setNom(nom);
              utilisateur.setPrenom(prenom);
              utilisateur.setPassword(password);
              utilisateur.setPhotoProfil(photo);
                    
              
                   
            System.out.println(utilisateur.getNom() + " " + utilisateur.getPrenom() + " a été modifié ");

        } else {
            System.out.println(" L'utilisateur d'indice " + indice + " n'existe pas");
        }
  
  }


    public Utilisateur chercherUtilisateurParId(int id) {

        Utilisateur utilisateurTrouve = null;
        for (Utilisateur utilisateur : listeUtilisateurs) {
            if (utilisateur.getIdUser()== id) {
                utilisateurTrouve = utilisateur;

                break;

            } else {
                System.out.println("L'Utilisateur n'existe pas");
            }
        }
        return utilisateurTrouve;
    }

    public Utilisateur chercherUtilisateurParNom(String nom) {

        Utilisateur utilisateurTrouve = null;
        for (Utilisateur utilisateur : listeUtilisateurs) {
            if (utilisateur.getNom().toLowerCase().equals(nom.toLowerCase())) {
                utilisateurTrouve = utilisateur;

            }
        }
        return utilisateurTrouve;
    }

    public Utilisateur chercherUtilisateurParEmail(String email) {

        Utilisateur utilisateurTrouve = null;
        for (Utilisateur utilisateur : listeUtilisateurs) {
            if (utilisateur.getEmail().toLowerCase().equals(email.toLowerCase())) {
                utilisateurTrouve = utilisateur;

            }
        }
        return utilisateurTrouve;
    }

    public boolean verifierEmailMotDePasse(String email, String motDePasse) {
        boolean valid = false;
        for (Utilisateur utilisateur : listeUtilisateurs) {
            if (utilisateur.getEmail().equalsIgnoreCase(email) && utilisateur.getPassword().equalsIgnoreCase(motDePasse)) {
                valid = true;

            }
        }
        return valid;
    }

   


   

}

