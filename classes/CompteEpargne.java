/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import classes.Client;
import classes.CompteBancaire;

/**
 *
 * @author kinae
 */
public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numeroCompte, Client titulaire, String dateOuverture, double solde, double tauxInteret) {
        super(numeroCompte, titulaire, dateOuverture, solde);
        this.tauxInteret = tauxInteret;
    }

    // Getters and setters for tauxInteret
    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
