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
public class CompteCheque extends CompteBancaire {
    public CompteCheque(String numeroCompte, Client titulaire, String dateOuverture, double solde) {
        super(numeroCompte, titulaire, dateOuverture, solde);
    }
}
