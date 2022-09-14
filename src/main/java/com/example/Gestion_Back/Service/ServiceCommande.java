package com.example.Gestion_Back.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Gestion_Back.Dto.ProduitDto;
import com.example.Gestion_Back.Models.Commande;
import com.example.Gestion_Back.Models.Produit;
import com.example.Gestion_Back.Repository.CommandeRepository;
import com.example.Gestion_Back.Repository.ProduitRepository;

@Service
public class ServiceCommande {
    
    @Autowired
    CommandeRepository commandeRepository;

    @Autowired
    ProduitRepository produitRepository;


    public Commande ajouter(Commande commande, Long quantity,Long price,Long montant_total){
     
        Commande qt = commandeRepository.getById(quantity);
        Produit pr = produitRepository.getById(price);
        Commande total = commandeRepository.getById(montant_total);
        total.setMontant(qt.getQuantite()*pr.getPrix());
        return commandeRepository.save(total);
        
        
    }
}
