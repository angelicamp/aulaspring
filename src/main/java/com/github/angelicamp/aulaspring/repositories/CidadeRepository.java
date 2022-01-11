package com.github.angelicamp.aulaspring.repositories;

import com.github.angelicamp.aulaspring.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
