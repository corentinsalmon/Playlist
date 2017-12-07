/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;

/**
 *
 * @author ASUS
 */
public class Genre {
    private String nom;
    
    public Genre(String nom){
        this.nom=nom;        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
