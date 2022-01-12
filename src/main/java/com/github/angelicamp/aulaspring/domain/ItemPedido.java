package com.github.angelicamp.aulaspring.domain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Entity
public class ItemPedido implements Serializable {
    private static final long serialVersionUID =1L;

    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private Double desconto;
    private Integer quantidade;
    private Double preco;

    public ItemPedido() {
    }
    public ItemPedido(Pedido pedido, Produto produto, Double desconto, Integer
            quantidade, Double preco) {
        super();

        id.setPedido(pedido);
        id.setProduto(produto);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public Pedido getPedido(){
        return id.getPedido();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemPedido)) return false;
        ItemPedido that = (ItemPedido) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Produto getProduto(){
        return  id.getProduto();
    }
}
