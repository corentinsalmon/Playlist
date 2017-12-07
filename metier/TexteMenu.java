/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
/**
 *
 * @author lourbaniak
 */
public class TexteMenu {
    	private final StringProperty leTitre = new SimpleStringProperty();
            public void setLeTitre(String valeur){leTitre.set(valeur);}
            public String getLeTitre(){return leTitre.get();}
            public StringProperty leTitreProperty(){return leTitre;}
    
	private final StringProperty leTexte = new SimpleStringProperty();
            public void setLeTexte(String valeur){leTexte.set(valeur);}
            public String getLeTexte(){return leTexte.get();}
            public StringProperty leTexteProperty(){return leTexte;}
	
            // Au lieu de texte on affichera une liste d'artistes, d'albums ou de pistes. On doit aussi afficher une image. (possible en FXML ?)
	public TexteMenu(String titre,String texte) {
                leTitre.set(titre);
		leTexte.set(texte);
	}
}
