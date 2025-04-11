package com.github.wemilli.study_apir.dto;

import java.util.List;

import com.github.wemilli.study_apir.model.Pedido;

public class PedidoResponse {
    private Long id;
    private String status;
    private List<ItemResponse> items;

    public PedidoResponse toDto (Pedido pedido) {
        this.id = pedido.getId();
        return this;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
 
    public List<ItemResponse> getItems() {
        return items;
    }
 
    public void setItems(List<ItemResponse> items) {
        this.items = items;
    }
}
