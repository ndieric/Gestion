package com.example.Gestion_Back.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Gestion_Back.Models.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
    
}
