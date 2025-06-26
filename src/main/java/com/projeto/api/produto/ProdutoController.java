package com.projeto.api.produto;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @GetMapping
    public String listaProdutos() {
        return "Lista de produtos";
    }

    @PostMapping
    public String criaProduto(@RequestBody String nome, String preco, String categoria) {
        return "Produto criado com sucesso";
    }

    @DeleteMapping("/{id}")
    public String deletaProduto(@PathVariable("id") String id) {
        return "Produto deletado com sucesso";
    }

    @PutMapping("/{id}")
    public String atualizaProduto(@PathVariable("id") String id,
                                  String nome,
                                  String preco,
                                  String categoria) {
        return "Produto atualizado com sucesso";
    }
}
