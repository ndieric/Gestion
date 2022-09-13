package com.example.Gestion_Back.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Gestion_Back.Models.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long>{

    Optional<Produit> findByNomPro(String nomPro);
    
}
