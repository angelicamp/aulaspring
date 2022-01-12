package com.github.angelicamp.aulaspring.repositories;

import com.github.angelicamp.aulaspring.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {}
