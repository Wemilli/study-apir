package com.github.wemilli.study_apir.dto;

import java.math.BigDecimal;

import com.github.wemilli.study_apir.model.Produto;

public class ProdutoRequestCreate {
    private String nome;

    public Produto toModel() {
        BigDecimal VALOR_PADRAO = new BigDecimal(2000);
        Produto product = new Produto();
        product.setValor(VALOR_PADRAO);
        product.setNome(this.nome);
        return product;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}