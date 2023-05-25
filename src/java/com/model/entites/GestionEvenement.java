
package com.model.entites;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aimen
 */

public class GestionEvenement {
    
    private List<Evenement> listeEvenements;

    public GestionEvenement() {
        
        listeEvenements= new ArrayList();
        
    }

    public List<Evenement> getListeEvenements() {
        return listeEvenements;
    }

    public void setListeUtilisateurs(List<Evenement> listeevenements) {
        this.listeEvenements = listeevenements;
    }

   public void afficherLesEvenements() {
        int evenements = listeEvenements.size(); // lenght

        if (evenements> 0) {
            for (Evenement event : listeEvenements) {
                System.out.println(evenements);
            }

        } else {
            System.out.println(" Aucun utilisateur trouvé ");
        }
    }
   
    public void ajouterUnEvenement(Evenement event) {

        listeEvenements.add(event);
    }

    
    public void supprimerUnEvenement(int indice) {
        
        Evenement evenement = null;
        if (indice < listeEvenements.size()) {
            evenement = (Evenement) listeEvenements.get(indice);
        }
        if (evenement != null) {
            listeEvenements.remove(indice);
            System.out.println(" L'évènement " + evenement.getNomEvent()+ " " + " a été supprimé ");

        } else {
            System.out.println(" L'utilisateur d'indice " + indice + " n'existe pas");
        }

    }
    public void modifierUnEvenement( int indice){
       Scanner lectureClavier = new Scanner(System.in);
       Evenement event = null;
        if (indice < listeEvenements.size()) {
            event = (Evenement) listeEvenements.get(indice);
        }
        if (event != null) {
              System.out.println("Entrez Le nom de l'évenement ");
              String nom = lectureClavier.next();
              System.out.println("Entrez le lieux de l'évènement");
              String lieux = lectureClavier.next();
              
              System.out.println("Entrez l'heure du début ");
              String heureD = lectureClavier.next();
              Date heureDebut = Date.valueOf(heureD);
              
              System.out.println("Entrez l'heure de fin");
              String heureF = lectureClavier.next();
              Date heureFin = Date.valueOf(heureF);
              
              System.out.println("Entrez la description");
              String description = lectureClavier.next();
              
              event.setNomEvent(nom);
              event.setLieux(lieux);
              event.setHeureDebut(heureDebut);
              event.setHeureFin(heureFin);
              event.setDescription(description);
                    
              
                   
            System.out.println(event.getNomEvent()+ " " + " a été modifié ");

        } else {
            System.out.println(" L'utilisateur d'indice " + indice + " n'existe pas");
        }
  
  }


    public Evenement chercherEvenementParId(int id) {

        Evenement eventTrouve = null;
        for (Evenement event : listeEvenements) {
            if (event.getIdEvent() == id) {
                eventTrouve = event;

                break;

            } else {
                System.out.println("L'Utilisateur n'existe pas");
            }
        }
        return eventTrouve;
    }

    public List<Evenement> chercherEvenementParNom(String nom) {

        List<Evenement> eventTrouve = null;
        for (Evenement event : listeEvenements) {
            if (event.getNomEvent().toLowerCase().equals(nom.toLowerCase())) {
                eventTrouve.add(event);

            }
        }
        return eventTrouve;
    }

    public List<Evenement> chercherEvenementParDateDebut(String heureD) {
        
        Date heureDebut = Date.valueOf(heureD);
        List<Evenement> eventTrouve = null;
        for (Evenement event : listeEvenements) {
            if (event.getHeureDebut().equals(heureDebut)) {
                eventTrouve.add(event) ;
            }
        }
        return eventTrouve;
    }
    
    public List<Evenement> chercherEvenementParDateFin(String heureF) {
        
        Date heureFin = Date.valueOf(heureF);
        List<Evenement> eventTrouve = null;
        for (Evenement event : listeEvenements) {
            if (event.getHeureDebut().equals(heureFin)) {
                eventTrouve.add(event);

            }
        }
        return eventTrouve;
    }
    
    
    public List<Evenement> chercherEvenementParLieux(String lieux){
        List<Evenement> eventTrouve = null;
        for (Evenement event : listeEvenements) {
            if (event.getLieux().toLowerCase().equals(lieux.toLowerCase())) {
                eventTrouve.add(event) ;

            }
        }
        return eventTrouve;
    }

   

    
}
