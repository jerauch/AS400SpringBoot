package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {


}