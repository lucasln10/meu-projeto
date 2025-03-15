package com.example.meu_primeiro_springboot.exeptions;

public class RecursoNaoEncontrado extends RuntimeException{
    public RecursoNaoEncontrado (String mensage){
        super(mensage);
    }
}
