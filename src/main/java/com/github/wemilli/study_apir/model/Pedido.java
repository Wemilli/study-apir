package com.github.wemilli.study_apir.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pedido {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Item> Items;

    public List<Item> getItems() {
        return Items;
    }
    public void setItems(List<Item> items) {
        Items = items;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}