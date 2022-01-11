package com.github.angelicamp.aulaspring.resources;

import com.github.angelicamp.aulaspring.domain.Categoria;
import com.github.angelicamp.aulaspring.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResources {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> find (@PathVariable Integer id){
        Categoria obj = categoriaService.find(id);
        return ResponseEntity.ok().body(obj);
    }

}
