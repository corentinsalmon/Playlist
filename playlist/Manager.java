/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;

/**
 *
 * @author cosalmon
 */
public class Manager {
    
    public void creerArtiste(String nom, String prenom, int annee, int mois, int jour){
        Artiste a = new Artiste(nom, prenom, annee, mois, jour);
    }
    public void creerArtiste(String nom, String prenom){
        Artiste a = new Artiste(nom, prenom);
    }
    
    
    public void creerMusique(String titre, int duree, Genre genre){
        Musique m = new Musique(titre, duree, genre);
    }
    
    
    public void creerGenre(String nom){
        Genre g = new Genre(nom);  
    }
    
    
    public void creerAlbum(String nom, int annee, int mois, int jour){
        Album al = new Album(nom, annee, mois, jour);
    }
    
    
    public void creerListeDeMusiques(String nom){
        ListeDeMusiques l = new ListeDeMusiques(nom);                
    }
    public void creerListeDeMusiques(){
        ListeDeMusiques l = new ListeDeMusiques();                
    }
    
    
    public void creerGroupe(String nom, int annee, int mois, int jour){
        Groupe gr = new Groupe(nom, annee, mois, jour);        
    }
    
}
