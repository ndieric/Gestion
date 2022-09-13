package com.example.Gestion_Back.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCli;
    private String nomCli;
    private String prenomCli;
    private int contact;

    @OneToMany(targetEntity = Commande.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cc_fk", referencedColumnName = "idCli")
    private List<Commande> commandes;

    public Client() {
    }
    public Client(String nomCli, String prenomCli, int contact) {
        this.nomCli = nomCli;
        this.prenomCli = prenomCli;
        this.contact = contact;
    }
    public Long getIdCli() {
        return idCli;
    }
    public void setIdCli(Long idCli) {
        this.idCli = idCli;
    }
    public String getNomCli() {
        return nomCli;
    }
    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }
    public String getPrenomCli() {
        return prenomCli;
    }
    public void setPrenomCli(String prenomCli) {
        this.prenomCli = prenomCli;
    }
    public int getContact() {
        return contact;
    }
    public void setContact(int contact) {
        this.contact = contact;
    }
    public List<Commande> getCommandes() {
        return commandes;
    }
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    

    
    
}
