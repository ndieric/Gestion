package com.example.Gestion_Back.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Gestion_Back.Models.Client;
import com.example.Gestion_Back.Repository.ClientRepository;

@Service
public class ServiceClient {

    @Autowired
    ClientRepository clientRepository;


    public Client ajouterClient(Client client){
        return clientRepository.save(client);
    }

    public List<Client> affiche_Client(Client client){
        return clientRepository.findAll();
        
    }
    
}
