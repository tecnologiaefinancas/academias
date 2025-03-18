package com.tecnologiaefinancas.academias.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tecnologiaefinancas.academias.entity.Gym;

public interface GymRepository extends MongoRepository<Gym, String> {
}

