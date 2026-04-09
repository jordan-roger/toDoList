package appli.accueil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class InscriptionController {

    @FXML private TextField nomField;
    @FXML private TextField prenomField;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private PasswordField confirmField;
    @FXML private Label labelErreur;

    @FXML
    void sInscrire(ActionEvent event) {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirm = confirmField.getText();

        if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
            labelErreur.setText("Veuillez remplir tous les champs");
        } else if (!password.equals(confirm)) {
            labelErreur.setText("Les mots de passe ne correspondent pas");
        } else {
            System.out.println("Inscription réussie : " + nom + " " + prenom + " - " + email);
            labelErreur.setStyle("-fx-text-fill: green;");
            labelErreur.setText("Inscription réussie !");
        }
    }

    @FXML
    void retour(ActionEvent event) throws Exception {
        StartApplication.changeScene("accueil/Login");
    }
}