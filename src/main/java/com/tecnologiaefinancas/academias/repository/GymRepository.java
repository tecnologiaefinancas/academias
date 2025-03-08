package com.tecnologiaefinancas.academias.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.tecnologiaefinancas.academias.entity.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<Gym, Long> {
}

