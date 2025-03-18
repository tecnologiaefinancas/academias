package com.tecnologiaefinancas.academias.specification;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class GymSpecificationMongo {

    public Query buildGymQuery(String city, String neighborhood) {
        Query query = new Query();

        // Filtro por cidade
        if (city != null) {
            query.addCriteria(Criteria.where("city").is(city));
        }

        // Filtro por bairro (neighborhood) com "like" equivalente
        if (neighborhood != null) {
            query.addCriteria(Criteria.where("neighborhood").regex(".*" + neighborhood + ".*", "i")); // "i" torna case insensitive
        }

        return query;
    }
}

