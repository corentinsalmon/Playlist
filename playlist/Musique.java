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
public class Musique {
    private String titre;
    private int duree;
    private Genre genre;
    
    public Musique(String titre, int duree, Genre genre){
        this.titre=titre;
        this.duree=duree;
        this.genre=genre;
    }

    public String getTitre() {
        return titre;
    }

    public int getDuree() {
        return duree;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    
    
}

