/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kinae
 */
public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;
    private double montantCritique;

    public CompteCourant(String numeroCompte, Client titulaire, String dateOuverture, double solde,
                         double decouvertAutorise, double montantCritique) {
        super(numeroCompte, titulaire, dateOuverture, solde);
        this.decouvertAutorise = decouvertAutorise;
        this.montantCritique = montantCritique;
    }

    // Getters and setters for decouvertAutorise
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    // Getters and setters for montantCritique
    public double getMontantCritique() {
        return montantCritique;
    }

    public void setMontantCritique(double montantCritique) {
        this.montantCritique = montantCritique;
    }
}
