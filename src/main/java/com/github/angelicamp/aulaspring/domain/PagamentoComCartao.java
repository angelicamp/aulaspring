package com.github.angelicamp.aulaspring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoComCartao extends Pagamento{
    private static final long serialVersionUID =1L;

    private Integer numeroDeParcelas;
}
