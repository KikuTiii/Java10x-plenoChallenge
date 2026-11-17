package com.example.java10xplenochallenge.exception;

import java.time.Instant;
import java.util.List;

public record ErroApi(
        Instant timestamp,
        int status,
        String erro,
        String mensagem,
        String caminho,
        List<ErroCampo> errosCampos
) {

    public record ErroCampo(String campo, String mensagem){}
}
