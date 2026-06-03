package com.itb.inf2gm.pizzariadaaura.model.entity;

import java.math.BigDecimal;

public class Produto {

    private Long id;
    private String nome;
    private String tipo;
    private String descricao;
    private BigDecimal valorcompra;
    private BigDecimal valorvenda;
    private int quantidadeestoque;
    private boolean codstatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(BigDecimal valorcompra) {
        this.valorcompra = valorcompra;
    }

    public BigDecimal getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(BigDecimal valorvenda) {
        this.valorvenda = valorvenda;
    }

    public int getQuantidadeestoque() {
        return quantidadeestoque;
    }

    public void setQuantidadeestoque(int quantidadeestoque) {
        this.quantidadeestoque = quantidadeestoque;
    }

    public boolean isCodstatus() {
        return codstatus;
    }

    public void setCodstatus(boolean codstatus) {
        this.codstatus = codstatus;
    }
}