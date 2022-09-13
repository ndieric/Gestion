package com.example.Gestion_Back.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Gestion_Back.Models.Commande;
import com.example.Gestion_Back.Repository.CommandeRepository;

@Service
public class ServiceCommande {
    
    @Autowired
    CommandeRepository commandeRepository;

    public Commande ajouter(Commande commande){
        return commandeRepository.save(commande);
    }
}
