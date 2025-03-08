package com.tecnologiaefinancas.academias.service;

import com.tecnologiaefinancas.academias.entity.Gym;
import com.tecnologiaefinancas.academias.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymService {
    @Autowired
    private GymRepository gymRepository;

    public List<Gym> getAllGyms() {
        return gymRepository.findAll();
    }

    public Page<Gym> getAllGyms(Pageable gymsPage) {
        return gymRepository.findAll(gymsPage);
    }

    public List<Gym> saveAllGyms(List<Gym> gyms) {
        return gymRepository.saveAll(gyms);
    }
}
