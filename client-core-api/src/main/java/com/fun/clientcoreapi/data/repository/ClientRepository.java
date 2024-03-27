package com.fun.clientcoreapi.data.repository;

import com.fun.clientcoreapi.data.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {

}