package appli.model;

public class Utilisateur {

    // --- Attributs ---
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private String role;

    // --- Constructeur complet (avec id) — pour récupérer un utilisateur existant ---
    public Utilisateur(int id, String nom, String prenom, String email, String mdp, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.role = role;
    }

    // --- Constructeur sans id — pour l'inscription ---
    public Utilisateur(String nom, String prenom, String email, String mdp, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.role = role;
    }

    // --- Constructeur email + mdp — pour la connexion ---
    public Utilisateur(String email, String mdp) {
        this.email = email;
        this.mdp = mdp;
    }

    // --- Getters ---
    public int getId()         { return id; }
    public String getNom()     { return nom; }
    public String getPrenom()  { return prenom; }
    public String getEmail()   { return email; }
    public String getMdp()     { return mdp; }
    public String getRole()    { return role; }

    // --- Setters ---
    public void setId(int id)          { this.id = id; }
    public void setNom(String nom)     { this.nom = nom; }
    public void setPrenom(String p)    { this.prenom = p; }
    public void setEmail(String e)     { this.email = e; }
    public void setMdp(String mdp)     { this.mdp = mdp; }
    public void setRole(String role)   { this.role = role; }

    // --- toString ---
    @Override
    public String toString() {
        return "Utilisateur{id=" + id + ", nom='" + nom + "', prenom='" + prenom +
                "', email='" + email + "', role='" + role + "'}";
    }
}