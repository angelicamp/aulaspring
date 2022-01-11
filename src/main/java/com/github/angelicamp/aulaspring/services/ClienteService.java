package com.github.angelicamp.aulaspring.services;

import com.github.angelicamp.aulaspring.domain.Cliente;
import com.github.angelicamp.aulaspring.repositories.ClienteRepository;
import com.github.angelicamp.aulaspring.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente find (Integer id) {
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Cliente não encontrado com o Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

}
