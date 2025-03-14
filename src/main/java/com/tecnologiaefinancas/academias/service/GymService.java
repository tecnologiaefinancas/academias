package com.tecnologiaefinancas.academias.service;

import com.tecnologiaefinancas.academias.entity.Gym;
import com.tecnologiaefinancas.academias.repository.GymRepository;
import com.tecnologiaefinancas.academias.specification.GymSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
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

    public Page<Gym> getAllGyms(String city, String neighborhood, Pageable pageable) {
        Specification<Gym> spec = Specification
                .where(GymSpecification.hasCity(city))
                .and(GymSpecification.hasNeighborhood(neighborhood));

        return gymRepository.findAll(spec, pageable);
    }


    public void saveAllGyms(List<Gym> gyms) {
        gymRepository.saveAll(gyms);
    }
}
