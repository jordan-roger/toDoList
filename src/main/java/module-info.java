module appli {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;

    opens appli to javafx.fxml;
    opens appli.accueil to javafx.fxml;

    exports appli;
    exports appli.accueil;
}