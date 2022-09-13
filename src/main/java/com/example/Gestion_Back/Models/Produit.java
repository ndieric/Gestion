package com.example.Gestion_Back.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produit {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idPro;
    private String codePro;
    private String nomPro;
    private double prix;

    // @OneToMany(targetEntity = Commande.class, cascade = CascadeType.ALL)
    // @JoinColumn(name = "idPro", referencedColumnName = "idPro")
    // private Commande commande;
    
    public Produit() {
    }
    public Produit(String codePro, String nomPro, double prix) {
        this.codePro = codePro;
        this.nomPro = nomPro;
        this.prix = prix;
    }
    public Long getIdPro() {
        return idPro;
    }
    public void setIdPro(Long idPro) {
        this.idPro = idPro;
    }
    public String getCodePro() {
        return codePro;
    }
    public void setCodePro(String codePro) {
        this.codePro = codePro;
    }
    public String getNomPro() {
        return nomPro;
    }
    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    // public Commande getCommande() {
    //     return commande;
    // }
    // public void setCommande(Commande commande) {
    //     this.commande = commande;
    // }

    
    
}
