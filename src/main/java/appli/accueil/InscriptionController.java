package appli.accueil;

import appli.StartApplication;
import appli.model.Utilisateur;
import appli.repository.UtilisateurRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class InscriptionController {

    @FXML private TextField nomField;
    @FXML private TextField prenomField;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private PasswordField confirmField;
    @FXML private Label labelErreur;

    private UtilisateurRepository utilisateurRepository = new UtilisateurRepository();

    @FXML
    void sInscrire(ActionEvent event) {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirm = confirmField.getText();

        if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
            labelErreur.setText("Veuillez remplir tous les champs");
            return;
        }

        if (!password.equals(confirm)) {
            labelErreur.setText("Les mots de passe ne correspondent pas");
            return;
        }

        if (utilisateurRepository.getUtilisateurParEmail(email) != null) {
            labelErreur.setText("Un compte existe déjà avec cet email");
            return;
        }

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String mdpHache = encoder.encode(password);

        Utilisateur nouvelUtilisateur = new Utilisateur(nom, prenom, email, mdpHache, "user");
        utilisateurRepository.ajouterUtilisateur(nouvelUtilisateur);

        labelErreur.setText("Compte créé avec succès !");
        try {
            StartApplication.changeScene("accueil/login");
        } catch (Exception e) {
            labelErreur.setText("Erreur lors de la redirection");
        }
    }

    @FXML
    void retourLogin(ActionEvent event) throws Exception {
        StartApplication.changeScene("accueil/login");
    }
}