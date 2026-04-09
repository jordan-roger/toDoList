package appli.accueil;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
public class LoginController {
    @FXML
    private Label labelCoucou;


    @FXML
    void direBonjour(ActionEvent event) {
        labelCoucou.setText("Coucou !");

    }
    @FXML
    void JeVaisBien(ActionEvent event) {
        labelCoucou.setText("Mal !");

    }

}