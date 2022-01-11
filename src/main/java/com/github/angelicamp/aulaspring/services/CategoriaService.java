package com.github.angelicamp.aulaspring.services;

import com.github.angelicamp.aulaspring.domain.Categoria;
import com.github.angelicamp.aulaspring.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElse(null);
    }

}
