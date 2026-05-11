module appli {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires spring.security.crypto;
    requires org.slf4j;
    requires commons.logging;

    opens appli to javafx.fxml;
    opens appli.accueil to javafx.fxml;

    exports appli;
    exports appli.accueil;
    exports appli.model;
    exports appli.repository;
    exports appli.database;
    exports appli.session;
}