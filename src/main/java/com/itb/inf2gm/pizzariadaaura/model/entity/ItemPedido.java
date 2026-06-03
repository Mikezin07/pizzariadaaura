package com.itb.inf2gm.pizzariadaaura.model.entity;

import java.math.BigDecimal;

public class ItemPedido {
    private Long id;
    private int quantidadeitem;
    private boolean codstatus;
    private BigDecimal valorunitario;
    private Long produtoid;
    private Long pedidoid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidadeitem() {
        return quantidadeitem;
    }

    public void setQuantidadeitem(int quantidadeitem) {
        this.quantidadeitem = quantidadeitem;
    }

    public boolean isCodstatus() {
        return codstatus;
    }

    public void setCodstatus(boolean codstatus) {
        this.codstatus = codstatus;
    }

    public BigDecimal getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(BigDecimal valorunitario) {
        this.valorunitario = valorunitario;
    }

    public Long getProdutoid() {
        return produtoid;
    }

    public void setProdutoid(Long produtoid) {
        this.produtoid = produtoid;
    }

    public Long getPedidoid() {
        return pedidoid;
    }

    public void setPedidoid(Long pedidoid) {
        this.pedidoid = pedidoid;
    }
}
