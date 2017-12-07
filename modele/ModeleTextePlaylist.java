package modele;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.SimpleListProperty;
import metier.TextePlaylist;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ModeleTextePlaylist {

    private ObservableList<TextePlaylist> lesTextesObs = FXCollections.observableArrayList();

    private final ListProperty<TextePlaylist> lesTextes = new SimpleListProperty<>(lesTextesObs);
        public ObservableList<TextePlaylist> getLesTextes() {return lesTextes.get();}
        public ReadOnlyListProperty<TextePlaylist> lesTextesProperty() {return lesTextes;}

    public ModeleTextePlaylist() {
        lesTextesObs.add(new TextePlaylist("Playlist Rock","Bonjour"));
        lesTextesObs.add(new TextePlaylist("Playlist Loïs","Voici une liste"));
    }

}
