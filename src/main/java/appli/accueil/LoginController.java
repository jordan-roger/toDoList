package appli.accueil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import appli.StartApplication;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private Label labelErreur;

    @FXML
    private PasswordField passwordField;

    @FXML
    void Connexio(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();

        System.out.println("email: " + email);
        System.out.println("password: " + password);

        if (email.isEmpty() || password.isEmpty()) {
            labelErreur.setText("Veuillez remplir tous les champs");
        } else if (email.equals("ton@email.com") && password.equals("Azerty1234")) {
            labelErreur.setText("Vous êtes connecté !");
        } else {
            labelErreur.setText("Email ou mot de passe incorrect");
        }
    }  // ← une seule accolade ici

    @FXML
    void Inscription(ActionEvent event) throws Exception {
        StartApplication.changeScene("accueil/Inscription");
    }

}  // ← fermeture de la classe