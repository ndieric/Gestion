package com.example.Gestion_Back.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Gestion_Back.Models.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    
}
