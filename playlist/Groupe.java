/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author cosalmon
 */

public class Groupe {
    private String nom;
    private List<Artiste> listArtistes;
    private LocalDate dateDeCreation;
    
    public Groupe(String nom, int annee, int mois, int jour){
        this.nom=nom;
        this.dateDeCreation = LocalDate.of(annee, mois, jour);
        this.listArtistes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public List<Artiste> getListArtistes() {
        return listArtistes;
    }

    public LocalDate getDateDeCreation() {
        return dateDeCreation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListArtistes(List<Artiste> listArtistes) {
        this.listArtistes = listArtistes;
    }

    public void setDateDeCreation(LocalDate dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }
    

   
}
