/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Album {
    
    private String nom;
    private LocalDate dateDeSortie;
    private List<Musique> listeDeMusiques;
    
    public Album(String nom, int annee, int mois, int jour){
        this.nom=nom;
        this.dateDeSortie = LocalDate.of(annee, mois, jour);
        this.listeDeMusiques = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public List<Musique> getListeDeMusiques() {
        return listeDeMusiques;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateDeSortie(LocalDate dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public void setListeDeMusiques(List<Musique> listeDeMusiques) {
        this.listeDeMusiques = listeDeMusiques;
    }
    
    
}
