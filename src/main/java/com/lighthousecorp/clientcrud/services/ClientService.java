package com.lighthousecorp.clientcrud.services;

import com.lighthousecorp.clientcrud.dto.ClientDTO;
import com.lighthousecorp.clientcrud.entities.Client;
import com.lighthousecorp.clientcrud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client  = repository.findById(id).get();
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result  = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }
}