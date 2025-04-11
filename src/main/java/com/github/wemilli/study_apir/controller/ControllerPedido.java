package com.github.wemilli.study_apir.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.wemilli.study_apir.dto.PedidoRequestCreate;
import com.github.wemilli.study_apir.dto.PedidoRequestUpdate;
import com.github.wemilli.study_apir.dto.PedidoResponse;
import com.github.wemilli.study_apir.service.PedidoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("pedidos")
public class ControllerPedido {
    
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<PedidoResponse> create(
            @RequestBody PedidoRequestCreate dto) {
                return ResponseEntity.noContent().build();
        // return ResponseEntity.status(201).body(
        //     new PedidoResponse().toDto(
        //         pedidoService.createPedido(dto)
        //         )
        // );

    }

    @GetMapping("{id}")
    public ResponseEntity<PedidoResponse> findById(
            @PathVariable Long id){
                 return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity <List<PedidoResponse>> findAll(){
        return ResponseEntity.noContent().build();
    }
}