package appli.accueil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class InscriptionController {


    @FXML
    void retour(ActionEvent event) {
        StartApplication.chageScene("acceuil/Login");

    }
}
