package com.yosuer.controller.rest;

import com.yosuer.domain.Persona;
import com.yosuer.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona/")
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Persona agregar(@RequestBody Persona persona) {
        return personaService.guardar(persona);
    }
}
