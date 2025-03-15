package com.example.meu_primeiro_springboot.repository;

import com.example.meu_primeiro_springboot.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
