package com.github.angelicamp.aulaspring.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResources {

   @GetMapping
    public String oklkj(){
        return "Bem vindo";
    }

}
