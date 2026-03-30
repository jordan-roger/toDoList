package appli.accueil;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
        }
        else if(email.isEmpty() && password.isEmpty()) {
            labelErreur.setText("Vous êtes connecté !");
        }
        else {
            labelErreur.setText("Connexion impossible! Les informations de connexion est sont incorrects");
        }

    }

    @FXML
    void Inscription(ActionEvent event) {
        StartApplication.chagescene("acceuil/Login")

    }

}