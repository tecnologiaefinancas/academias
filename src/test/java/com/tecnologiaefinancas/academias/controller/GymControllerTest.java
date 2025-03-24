package com.tecnologiaefinancas.academias.controller;

import com.tecnologiaefinancas.academias.entity.Gym;
import com.tecnologiaefinancas.academias.service.GymService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;
import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
public class GymControllerTest {

    @InjectMocks
    private GymController gymController;

    @Mock
    private GymService gymService;

    @Test
    void testGetAllGyms() {

        Gym gym1 = new Gym();
        gym1.setName("Academia 1");


        Gym gym2 = new Gym();
        gym2.setName("Academia 2");

        List<Gym> gyms = Arrays.asList(gym1, gym2);


        Mockito.when(gymService.getGymsWithFilters(null)).thenReturn(gyms);

        List<Gym> result = gymController.getAllGyms(null);


        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("Academia 1", result.get(0).getName());
        Assertions.assertEquals("Academia 2", result.get(1).getName());
    }

}

