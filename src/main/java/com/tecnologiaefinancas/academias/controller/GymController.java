package com.tecnologiaefinancas.academias.controller;


import com.tecnologiaefinancas.academias.entity.Gym;
import com.tecnologiaefinancas.academias.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gyms")
public class GymController {

    @Autowired
    private GymService gymService;

    @GetMapping
    public List<Gym> getAllGyms(@RequestParam(required = false) String searchTerm) {
        return gymService.getGymsWithFilters(searchTerm);
    }


    @PostMapping
    public ResponseEntity<Gym> addGym(@RequestBody Gym gym) {
        Gym createdGym = gymService.createGym(gym);
        return ResponseEntity.ok(createdGym);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Gym> updateGym(@PathVariable String id, @RequestBody Gym updatedGym) {
        Gym gym = gymService.updateGym(id, updatedGym);
        return ResponseEntity.ok(gym);
    }


}
    /*
    @PostConstruct
    public void init() {
        List<Gym> gyms = Arrays.asList(
                new Gym("Academia Vitality Fitness", "R. Vinte e Um de Junho, 28921-018", "Cabo Frio", "Jardim Esperança", "+5522999540745", "https://linktr.ee/academia.vitality", "academiavitalitycf", "https://example.com/img1.jpg", "pb=!1m14!1m8!1m3!1d14707.203765079832!2d-42.031633!3d-22.846853!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9705f4d153cf75%3A0xfb114d88f7cf024!2sAcademia%20Vitality%20Fitness!5e0!3m2!1spt-BR!2sus!4v1741377878028!5m2!1spt-BR!2sus", "https://www.google.com/search?q=Academia+Vitality+Fitness,+Cabo+Frio,+RJ"),
                new Gym("Mega Planet Academia São Cristóvão", "Av. América Central, 200, 28909-582", "Cabo Frio", "São Cristovão", "+552233434354", "https://megaplanetacademia.com.br/", "megaplanetcf", "https://example.com/img2.jpg", "pb=!1m14!1m8!1m3!1d29403.903697898826!2d-42.0423599!3d-22.895366!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x971bde6d213367%3A0x17da9f14ac3954c8!2sMega%20Planet%20Academia%20S%C3%A3o%20Crist%C3%B3v%C3%A3o!5e0!3m2!1spt-BR!2sbr!4v1741451434510!5m2!1spt-BR!2sbr", "http://google.com"),
                new Gym("Academia Império Fit", "R. dos Crisântemos, 02 - QD 03, 28921-260", "Cabo Frio", "Caminho de Buzios", "+55022974045056", "https://instabio.cc/imperiofitcabofrio", "imperiofitcabofrio", "https://example.com/img3.jpg", "pb=!1m18!1m12!1m3!1d3677.322469069311!2d-42.00596489999999!3d-22.827556100000002!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x97053b352f625f%3A0xb8352074b6b247e9!2sAcademia%20Imp%C3%A9rio%20Fit!5e0!3m2!1spt-BR!2sbr!4v1741462103986!5m2!1spt-BR!2sbr", "http://google.com")
        );

        for (Gym gym : gyms) {
            System.out.println(gym);
        }

        gymService.saveAllGyms(gyms);

    }*/

