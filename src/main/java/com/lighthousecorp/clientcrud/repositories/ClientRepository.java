package com.lighthousecorp.clientcrud.repositories;

import com.lighthousecorp.clientcrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
