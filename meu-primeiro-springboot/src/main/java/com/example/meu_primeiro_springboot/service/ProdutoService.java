package com.example.meu_primeiro_springboot.service;

import com.example.meu_primeiro_springboot.exeptions.RecursoNaoEncontrado;
import com.example.meu_primeiro_springboot.model.Produto;
import com.example.meu_primeiro_springboot.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;


    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto buscarPorId (Long id){
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontrado("Produto com ID "+id+" não encontrado"));
    }

    public Produto salvarProduto (Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProdutoId (Long id){
        if (!produtoRepository.existsById(id)){
            throw new RecursoNaoEncontrado("Produto com ID "+id+" não encontrado");
        }
        produtoRepository.deleteById(id);
    }


}
