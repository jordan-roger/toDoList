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

public class LoginController {

    @FXML private TextField emailField;
    @FXML private Label labelErreur;
    @FXML private PasswordField passwordField;

    private UtilisateurRepository utilisateurRepository = new UtilisateurRepository();

    @FXML
    void Connexion(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.isEmpty() || password.isEmpty()) {
            labelErreur.setText("Veuillez remplir tous les champs");
            return;
        }

        Utilisateur utilisateur = utilisateurRepository.getUtilisateurParEmail(email);

        if (utilisateur == null) {
            labelErreur.setText("Email ou mot de passe incorrect");
            return;
        }

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (encoder.matches(password, utilisateur.getMdp())) {
            try {
                StartApplication.changeScene("accueil/accueil");
            } catch (Exception e) {
                labelErreur.setText("Erreur lors de la redirection");
            }
        } else {
            labelErreur.setText("Email ou mot de passe incorrect");
        }
    }

    @FXML
    void Inscription(ActionEvent event) throws Exception {
        StartApplication.changeScene("accueil/Inscription");
    }
}