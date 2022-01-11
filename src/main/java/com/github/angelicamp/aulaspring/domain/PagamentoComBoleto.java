package com.github.angelicamp.aulaspring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoComBoleto extends Pagamento{
    private static final long serialVersionUID =1L;

    private Date dataVencimento;
    private Date dataPagamento;


}
