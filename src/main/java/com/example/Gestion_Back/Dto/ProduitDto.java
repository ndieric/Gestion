package com.example.Gestion_Back.Dto;

import com.example.Gestion_Back.Models.Produit;

public class ProduitDto {
    
    private Produit produit;

    public ProduitDto() {
    }

    public ProduitDto(Produit produit) {
        this.produit = produit;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    

    
}
