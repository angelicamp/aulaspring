package com.github.angelicamp.aulaspring.domain;

import com.github.angelicamp.aulaspring.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    private Integer id;
    private String ligadouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Cliente cliente;
    private Cidade cidade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco)) return false;
        Endereco endereco = (Endereco) o;
        return getId().equals(endereco.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
