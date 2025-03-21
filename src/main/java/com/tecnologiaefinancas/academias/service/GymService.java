package com.tecnologiaefinancas.academias.service;

import com.tecnologiaefinancas.academias.entity.Gym;
import com.tecnologiaefinancas.academias.repository.GymRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymService {
    @Autowired
    private GymRepository gymRepository;

    @Autowired
    private MongoTemplate mongoTemplate;


    public List<Gym> getAllGyms() {
        return gymRepository.findAll();
    }

    public Page<Gym> getAllGyms(Pageable gymsPage) {
        return gymRepository.findAll(gymsPage);
    }

    public List<Gym> getGymsWithFilters(String searchTerm) {
        Query query = new Query();

        if (searchTerm != null && !searchTerm.trim().isEmpty()) {
            // Busca global em todos os campos relevantes
            query.addCriteria(new Criteria().orOperator(
                    Criteria.where("name").regex(".*" + searchTerm + ".*", "i"),          // Nome
                    Criteria.where("address").regex(".*" + searchTerm + ".*", "i"),       // Endereço
                    Criteria.where("city").regex(".*" + searchTerm + ".*", "i"),          // Cidade
                    Criteria.where("neighborhood").regex(".*" + searchTerm + ".*", "i")   // Bairro
            ));
        }

        System.out.println(query);

        return mongoTemplate.find(query, Gym.class);
    }




    public Gym createGym(Gym gym) {
        return gymRepository.save(gym);
    }


        public void saveAllGyms(List<Gym> gyms) {
        gymRepository.saveAll(gyms);
    }

    public Gym updateGym(String id, Gym updatedGym) {

        Gym existingGym = gymRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Academia não encontrada com o ID: " + id));

        BeanUtils.copyProperties(updatedGym, existingGym, getNullPropertyNames(updatedGym));

        return gymRepository.save(existingGym);
    }

    private String[] getNullPropertyNames(Object source) {
        return java.util.stream.Stream.of(source.getClass().getDeclaredFields())
                .filter(field -> {
                    field.setAccessible(true);
                    try {
                        return field.get(source) == null;
                    } catch (IllegalAccessException e) {
                        return false;
                    }
                })
                .map(java.lang.reflect.Field::getName)
                .toArray(String[]::new);
    }
}
