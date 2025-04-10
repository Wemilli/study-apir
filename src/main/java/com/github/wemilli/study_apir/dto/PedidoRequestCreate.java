package com.github.wemilli.study_apir.dto;

import java.math.BigDecimal;

import com.github.wemilli.study_apir.model.Pedido;
import com.github.wemilli.study_apir.model.Produto;

public class PedidoRequestCreate {
    private String status;

    public Pedido toModel() {
        Pedido pedido = new Pedido();
        pedido.setStatus(this.status);
        return pedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
