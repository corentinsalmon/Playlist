/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import metier.TextePlaylist;
import modele.ModeleTextePlaylist;

/**
 *
 * @author lourbaniak
 */

public class MasterDetail {
    
    @FXML
    private ListView<TextePlaylist> listeDesTextes;

    @FXML
    private TextArea detailTexte;
    
    @FXML
    private TextField titreNote;
    
    private final ObjectProperty<ModeleTextePlaylist> leModele = new SimpleObjectProperty<>(new ModeleTextePlaylist());
        public ModeleTextePlaylist getLeModele() {return leModele.get();};
        public void setLeModele(ModeleTextePlaylist param) {leModele.set(param);}
        public ObjectProperty<ModeleTextePlaylist> leModeleProperty() {return leModele;}
        
    @FXML
    public void initialize() {
        
        listeDesTextes.setCellFactory((param) -> {
            return new ListCell<TextePlaylist>(){
               @Override
                protected void updateItem(TextePlaylist item, boolean empty) {
                    super.updateItem(item, empty);
                    if (! empty) {
                        textProperty().bind(item.leTitreProperty());
                    } else {
                        textProperty().unbind();
                        setText("");
                    }
                }  
            };
        });
        
        listeDesTextes.getSelectionModel().selectedItemProperty().addListener((o,old,newV)->{
            if (old != null) {
                detailTexte.textProperty().unbindBidirectional(old.leTexteProperty());
                titreNote.textProperty().unbindBidirectional(old.leTitreProperty());
            }
            if (newV != null) {
                detailTexte.textProperty().bindBidirectional(newV.leTexteProperty());
                titreNote.textProperty().bindBidirectional(newV.leTitreProperty());
            }
        });
        
    }
}