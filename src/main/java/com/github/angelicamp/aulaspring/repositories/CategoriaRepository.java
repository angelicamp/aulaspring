package com.github.angelicamp.aulaspring.repositories;

import com.github.angelicamp.aulaspring.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
