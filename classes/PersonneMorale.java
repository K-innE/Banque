/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kinae
 */
public class PersonneMorale extends Client {
    private String raisonSociale;
    private String activite;
    private String numRegistreCommerce;
    private String numImmatriculationFiscale;
    private String responsable;

    public PersonneMorale(String nom, String adresse, String raisonSociale, String activite,
                          String numRegistreCommerce, String numImmatriculationFiscale, String responsable) {
        super(nom, adresse);
        this.raisonSociale = raisonSociale;
        this.activite = activite;
        this.numRegistreCommerce = numRegistreCommerce;
        this.numImmatriculationFiscale = numImmatriculationFiscale;
        this.responsable = responsable;
    }

    // Getters and setters for raisonSociale
    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    // Getters and setters for activite
    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    // Getters and setters for numRegistreCommerce
    public String getNumRegistreCommerce() {
        return numRegistreCommerce;
    }

    public void setNumRegistreCommerce(String numRegistreCommerce) {
        this.numRegistreCommerce = numRegistreCommerce;
    }

    // Getters and setters for numImmatriculationFiscale
    public String getNumImmatriculationFiscale() {
        return numImmatriculationFiscale;
    }

    public void setNumImmatriculationFiscale(String numImmatriculationFiscale) {
        this.numImmatriculationFiscale = numImmatriculationFiscale;
    }

    // Getters and setters for responsable
    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    
    // Additional methods for specific functionality
    // ...

}
