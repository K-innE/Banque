/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kinae
 */
import java.util.Date;

public class Operation {
    private String type; // "Retrait" ou "Versement"
    private double montant;
    private Date date;

    public Operation(String type, double montant, Date date) {
        this.type = type;
        this.montant = montant;
        this.date = date;
    }
      public void afficherDetails() {
        System.out.println("Type d'opération: " + type);
        System.out.println("Montant: " + montant);
        System.out.println("Date: " + date);
    }

    // Getters and setters for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getters and setters for montant
    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    // Getters and setters for date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

