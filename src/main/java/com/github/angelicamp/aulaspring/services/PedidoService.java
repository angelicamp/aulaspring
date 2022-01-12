package com.github.angelicamp.aulaspring.services;

import com.github.angelicamp.aulaspring.domain.Categoria;
import com.github.angelicamp.aulaspring.domain.Pedido;
import com.github.angelicamp.aulaspring.repositories.CategoriaRepository;
import com.github.angelicamp.aulaspring.repositories.PedidoRepository;
import com.github.angelicamp.aulaspring.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public Pedido find (Integer id) {
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Pedido não encontrado com o Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}
