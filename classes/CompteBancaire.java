/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kinae
 */
import java.util.ArrayList;
import java.util.List;
public class CompteBancaire {
    private String numeroCompte;
    private Client titulaire;
    private String dateOuverture;
    private double solde;
    private List<Operation> operations; // Liste des opérations associées à ce compte


    public CompteBancaire(String numeroCompte, Client titulaire, String dateOuverture, double solde) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.dateOuverture = dateOuverture;
        this.solde = solde;
        this.operations = new ArrayList<>();

    }

    // Getters and setters for numeroCompte
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    // Getters and setters for titulaire
    public Client getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    // Getters and setters for dateOuverture
    public String getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    // Getters and setters for solde
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
     // Ajouter une opération à la liste des opérations
    public void ajouterOperation(Operation operation) {
        operations.add(operation);
    }

    // Obtenir la liste des opérations
    public List<Operation> getOperations() {
        return operations;
    }
}
