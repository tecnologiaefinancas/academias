package com.tecnologiaefinancas.academias.specification;

import com.tecnologiaefinancas.academias.entity.Gym;
import org.springframework.data.jpa.domain.Specification;

public class GymSpecification {

    public static Specification<Gym> hasCity(String city) {
        return (root, query, criteriaBuilder) ->
                city == null ? null : criteriaBuilder.equal(root.get("address"), city);
    }

    public static Specification<Gym> hasNeighborhood(String neighborhood) {
        return (root, query, criteriaBuilder) ->
                neighborhood == null ? null : criteriaBuilder.like(root.get("address"), "%" + neighborhood + "%");
    }
}
