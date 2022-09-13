package com.example.Gestion_Back.Models;

import java.util.Date;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Commande {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCom;
    private Date date_creation;
    private int quantite;
    private double montant;

    @OneToMany(targetEntity = Produit.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "idCom")
    private List<Produit> produits;
    

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


    public List<Produit> getProduits() {
        return produits;
    }


    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }


  

    
}
