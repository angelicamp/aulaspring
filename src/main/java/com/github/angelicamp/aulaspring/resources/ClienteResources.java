package com.github.angelicamp.aulaspring.resources;

import com.github.angelicamp.aulaspring.domain.Categoria;
import com.github.angelicamp.aulaspring.domain.Cliente;
import com.github.angelicamp.aulaspring.services.CategoriaService;
import com.github.angelicamp.aulaspring.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteResources {

    @Autowired
    ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> find (@PathVariable Integer id){
        Cliente obj = clienteService.find(id);
        return ResponseEntity.ok().body(obj);
    }

}
