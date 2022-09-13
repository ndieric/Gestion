package com.example.Gestion_Back.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Gestion_Back.Models.Produit;
import com.example.Gestion_Back.Service.ServiceProduit;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/produit")
public class Controllers {
 
    @Autowired
    ServiceProduit serviceProduit;

    @PostMapping
    public Produit ajoutProduit(@RequestBody Produit produit){
        return serviceProduit.ajouterProduit(produit);
    }

    @GetMapping("/get")
    public List<Produit> affProduits(){
        return serviceProduit.affiche_produits();
    }


    @GetMapping("/{nomPro}")
    public Optional<Produit> trouver(Produit produit, String nomPro){
       return serviceProduit.trouver_nom(produit, nomPro);
    }

}
