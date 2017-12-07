/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Artiste {
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    public List<Album> listeAlbums;
    
    public Artiste(String nom, String prenom, int annee, int mois, int jour){
        this.nom=nom;
        this.prenom=prenom;
        this.dateDeNaissance= LocalDate.of(annee, mois, jour);
        listeAlbums = new ArrayList<>();
    } 
    
    public Artiste(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
        this.dateDeNaissance=null;
        listeAlbums = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public List<Album> getListeAlbums() {
        return listeAlbums;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setListeAlbums(List<Album> listeAlbums) {
        this.listeAlbums = listeAlbums;
    }
    
   
}
