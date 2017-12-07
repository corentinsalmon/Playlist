package vue;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import launcher.Main;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lourbaniak
 */

public class Accueil {

    @FXML
    private void NewPlaylist() {
        try {
            Scene nouvelleScene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/NewPlaylist.fxml")));
            Stage nouvelleFenetre = new Stage();
            nouvelleFenetre.setScene(nouvelleScene);
            nouvelleFenetre.initOwner(Main.getPrimaryStage());
            nouvelleFenetre.show();
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        @FXML
    private void Add() {
        try {
            Scene nouvelleScene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/Add.fxml")));
            Stage nouvelleFenetre = new Stage();
            nouvelleFenetre.setScene(nouvelleScene);
            nouvelleFenetre.initOwner(Main.getPrimaryStage());
            nouvelleFenetre.show();
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        @FXML
    private void Delete() {
        try {
            Scene nouvelleScene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/Delete.fxml")));
            Stage nouvelleFenetre = new Stage();
            nouvelleFenetre.setScene(nouvelleScene);
            nouvelleFenetre.initOwner(Main.getPrimaryStage());
            nouvelleFenetre.show();
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        @FXML
    private void Edit() {
        try {
            Scene nouvelleScene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/Edit.fxml")));
            Stage nouvelleFenetre = new Stage();
            nouvelleFenetre.setScene(nouvelleScene);
            nouvelleFenetre.initOwner(Main.getPrimaryStage());
            nouvelleFenetre.show();
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
        @FXML
    private void Save() {
        try {
            Scene nouvelleScene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/Save.fxml")));
            Stage nouvelleFenetre = new Stage();
            nouvelleFenetre.setScene(nouvelleScene);
            nouvelleFenetre.initOwner(Main.getPrimaryStage());
            nouvelleFenetre.show();
        } catch (IOException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/

}
