package classes;

public class ResponsableBancaire {
    private String identifiant;
    private String motDePasse;

    public ResponsableBancaire(String identifiant, String motDePasse) {
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    // Getters and setters for identifiant
    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    // Getters and setters for motDePasse
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}

