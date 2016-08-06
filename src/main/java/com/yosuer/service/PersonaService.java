package com.yosuer.service;

import com.yosuer.domain.Persona;
import java.util.List;

public interface PersonaService {
    
    Persona guardar(Persona persona);

    List<Persona> obtenerTodos();
}
