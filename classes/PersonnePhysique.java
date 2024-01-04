/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kinae
 */
public class PersonnePhysique extends Client {
    private String prenom;
    private String dateNaissance;
    private String profession;
    private String employeur;
    private String tuteur;

    public PersonnePhysique(String nom, String adresse, String prenom, String dateNaissance,
                            String profession, String employeur, String tuteur) {
        super(nom, adresse);
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.profession = profession;
        this.employeur = employeur;
        this.tuteur = tuteur;
    }

    // Getters and setters for prenom
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Getters and setters for dateNaissance
    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    // Getters and setters for profession
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    // Getters and setters for employeur
    public String getEmployeur() {
        return employeur;
    }

    public void setEmployeur(String employeur) {
        this.employeur = employeur;
    }

    // Getters and setters for tuteur
    public String getTuteur() {
        return tuteur;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
}
