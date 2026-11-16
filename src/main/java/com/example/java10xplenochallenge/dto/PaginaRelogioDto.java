package com.example.java10xplenochallenge.dto;

import java.util.List;

public record PaginaRelogioDto(
        List<RelogioDto> itens,
        long total
) {
}
