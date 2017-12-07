package modele;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.SimpleListProperty;
import metier.TexteMenu;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ModeleTexteMenu {

    private ObservableList<TexteMenu> lesTextesObs = FXCollections.observableArrayList();

    private final ListProperty<TexteMenu> lesTextes = new SimpleListProperty<>(lesTextesObs);
        public ObservableList<TexteMenu> getLesTextes() {return lesTextes.get();}
        public ReadOnlyListProperty<TexteMenu> lesTextesProperty() {return lesTextes;}

    public ModeleTexteMenu() {
        lesTextesObs.add(new TexteMenu("Artists","test"));
        lesTextesObs.add(new TexteMenu("Albums","test"));
        lesTextesObs.add(new TexteMenu("Songs","test"));
    }

}
