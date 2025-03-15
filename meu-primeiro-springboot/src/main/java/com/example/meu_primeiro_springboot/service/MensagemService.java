package com.example.meu_primeiro_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.meu_primeiro_springboot.repository.MensagemRepository;

@Service
public class MensagemService {
    @Autowired
    private MensagemRepository mensagemRepository;

    public String obterMensagem() {
        return mensagemRepository.obterMensagem();
    }

}
