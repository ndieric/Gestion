package com.example.Gestion_Back.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Gestion_Back.Models.Produit;
import com.example.Gestion_Back.Repository.ProduitRepository;

@Service
public class ServiceProduit {

    @Autowired
    ProduitRepository produitRepository;

    public Produit ajouterProduit(Produit produit){
        return produitRepository.save(produit);
    }

    public List<Produit> affiche_produits(){
        return produitRepository.findAll();
        
    }

    public Optional<Produit> trouver_nom(Produit produit ,@PathVariable String nomPro){
       return produitRepository.findByNomPro(nomPro);
    }
    
}
