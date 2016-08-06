package com.yosuer.service.impl;

import com.yosuer.domain.Persona;
import com.yosuer.repository.PersonaRepository;
import com.yosuer.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona guardar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> obtenerTodos() {
        return personaRepository.findAll();
    }

}
