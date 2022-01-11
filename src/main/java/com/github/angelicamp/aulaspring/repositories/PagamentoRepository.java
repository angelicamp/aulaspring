package com.github.angelicamp.aulaspring.repositories;

import com.github.angelicamp.aulaspring.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
