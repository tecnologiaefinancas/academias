package com.tecnologiaefinancas.academias.service;

import com.tecnologiaefinancas.academias.entity.Gym;
import com.tecnologiaefinancas.academias.repository.GymRepository;
import com.tecnologiaefinancas.academias.specification.GymSpecificationMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymService {
    @Autowired
    private GymRepository gymRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private GymSpecificationMongo gymSpecificationMongo;

    public List<Gym> getAllGyms() {
        return gymRepository.findAll();
    }

    public Page<Gym> getAllGyms(Pageable gymsPage) {
        return gymRepository.findAll(gymsPage);
    }

    public List<Gym> getGymsWithFilters(String city, String neighborhood) {
        Query query = gymSpecificationMongo.buildGymQuery(city, neighborhood);
        return mongoTemplate.find(query, Gym.class);
    }


    public Gym createGym(Gym gym) {
        return gymRepository.save(gym);
    }


        public void saveAllGyms(List<Gym> gyms) {
        gymRepository.saveAll(gyms);
    }
}
