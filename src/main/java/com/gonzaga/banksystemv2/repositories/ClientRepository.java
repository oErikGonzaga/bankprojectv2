package com.gonzaga.banksystemv2.repositories;

import com.gonzaga.banksystemv2.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
