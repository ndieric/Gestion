package com.example.Gestion_Back.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Gestion_Back.Dto.ProduitDto;
import com.example.Gestion_Back.Models.Commande;
import com.example.Gestion_Back.Models.Produit;
import com.example.Gestion_Back.Repository.CommandeRepository;

@Service
public class ServiceCommande {
    
    @Autowired
    CommandeRepository commandeRepository;




   private Produit pro = new Produit();
   private Commande com = new Commande();


    
   

    public Commande ajouter(Commande commande){
        double pri = pro.getPrix();
        double qua = com.getQuantite();
        double tot = pri * qua;
        commande.setMontant(tot);
        return commandeRepository.save(commande);
    }
}
