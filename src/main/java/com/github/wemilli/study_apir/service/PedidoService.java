package com.github.wemilli.study_apir.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.wemilli.study_apir.dto.PedidoRequestCreate;
import com.github.wemilli.study_apir.model.Item;
import com.github.wemilli.study_apir.model.Pedido;
import com.github.wemilli.study_apir.model.Produto;
import com.github.wemilli.study_apir.repository.ItemRepository;
import com.github.wemilli.study_apir.repository.PedidoRepository;
import com.github.wemilli.study_apir.repository.ProdutoRepository;

@Service
public class PedidoService {

    @Autowired
    private ItemRepository itemRepository;
    private PedidoRepository pedidoRepository;
    private ProdutoRepository produtoRepository;

    public Pedido create(PedidoRequestCreate dto) {
        Pedido pedido = new Pedido();

        pedido.setStatus("ABERTO");

        List<Item> items = dto.getItems()
                    .stream()
                    .map(i -> {
                        Item item = new Item();
                        Produto produto = produtoRepository
                            .findById(i.getProduto_id())
                            .orElseThrow(() ->
                            new RuntimeException(
                                "Produto inexistente: " + i.getProduto_id()));
                           
                        
                        item.setProduto(produto);
                        item.setValor(i.getValor());
                        item.setQuantidade(i.getQuantidade());
                        item.setPedido(pedido);
                        return item;
                    })
                    .collect(Collectors.toList());

        pedido.setItems(items);
        
        return pedidoRepository.save(pedido);
    }
    // private PedidoRepository pedidoRepository;

    // public Pedido createPedido(PedidoRequestCreate dto) {
    // return pedidoRepository.save(dto.toModel());
    // }

    // public Optional<Pedido> getPedidoById(Long id) {
    // return pedidoRepository.findById(id);
    // }

    // public List<Pedido> getAll() {
    // return pedidoRepository.findAll();
    // }

    // public Optional<Pedido> updatePedido(Long id, PedidoRequestUpdate dto) {

    // return pedidoRepository.findById(id)
    // .map(p -> pedidoRepository.save((p)));
    // }

    // public boolean deletepedido(Long id) {
    // if (pedidoRepository.existsById(id)) {
    // pedidoRepository.deleteById(id);
    // return true;
    // }
    // return false;
    // }

}
