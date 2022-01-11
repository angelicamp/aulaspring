package com.github.angelicamp.aulaspring.repositories;


import com.github.angelicamp.aulaspring.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndereçoRepository extends JpaRepository<Endereco, Integer> {
}
