package com.example.Gestion_Back.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCom;
    private Date date_creation;
    private int quantite;
    private double montant;

    
    public Commande() {
    }


    public Commande(Date date_creation, int quantite, double montant) {
        this.date_creation = date_creation;
        this.quantite = quantite;
        this.montant = montant;
    }


    public Long getIdCom() {
        return idCom;
    }


    public void setIdCom(Long idCom) {
        this.idCom = idCom;
    }


    public Date getDate_creation() {
        return date_creation;
    }


    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }


    public int getQuantite() {
        return quantite;
    }


    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    public double getMontant() {
        return montant;
    }


    public void setMontant(double montant) {
        this.montant = montant;
    }


    @Override
    public String toString() {
        return "Commande [date_creation=" + date_creation + ", idCom=" + idCom + ", montant=" + montant + ", quantite="
                + quantite + "]";
    }
    

    


    
}
