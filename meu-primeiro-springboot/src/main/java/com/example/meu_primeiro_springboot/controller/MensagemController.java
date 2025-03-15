package com.example.meu_primeiro_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meu_primeiro_springboot.service.MensagemService;

@RestController
@RequestMapping("/api")
public class MensagemController {
    @Autowired
    private MensagemService mensagemService;

    @GetMapping("/mensagem")
    public String pegarMensagem() {
        return mensagemService.obterMensagem();
    }

}