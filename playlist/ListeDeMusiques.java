/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ListeDeMusiques {
    private String nom;
    private LocalDate dateDeCreation;
    private List<Musique> liste;
    
    public ListeDeMusiques(String nom){
        this.nom=nom;
        this.dateDeCreation = LocalDate.now();
        this.liste = new ArrayList<>();        
    }
    
    public ListeDeMusiques(){
        this("newPlaylist");
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDateDeCreation() {
        return dateDeCreation;
    }

    public List<Musique> getListe() {
        return liste;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateDeCreation(LocalDate dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public void setListe(List<Musique> liste) {
        this.liste = liste;
    }
    
    public void ajouterMusique(Musique m){
        if(liste.contains(m)){
            System.out.println("Cette musique est déjà dans cette playlist");
            return;
        }
        liste.add(m);
        return;
    }
    
    public void retirerMusique(Musique m){
        if(!(liste.contains(m))){
            System.out.println("Impossible de retirer cette musique de la playlist car elle n'est pas dedans");
            return;
        }
        liste.remove(m);
        return;
    }
    
    public void viderPlaylist(){
        liste.clear();
        return;
    }
    
    
    
    
    
    
    
}
