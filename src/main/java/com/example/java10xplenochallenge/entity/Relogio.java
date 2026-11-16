package com.example.java10xplenochallenge.entity;

import com.example.java10xplenochallenge.entity.enums.MaterialCaixa;
import com.example.java10xplenochallenge.entity.enums.TipoMovimento;
import com.example.java10xplenochallenge.entity.enums.TipoVidro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "relogio", indexes = {
        @Index(name = "IDX_RELOGIO_MARCA", columnList = "marca"),
        @Index(name = "IDX_RELOGIO_CRIADO_EM", columnList = "criadoEm"),
        @Index(name = "IDX_RELOGIO_PRECO", columnList = "precoEmCentavos")
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Relogio {

    @Id
    @Column(nullable = false, updatable = false)
    private UUID id;

    @Column(nullable = false, length = 80)
    private String marca;

    @Column(nullable = false, length = 125)
    private String modelo;

    @Column(nullable = false, length = 80)
    private String referencia;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TipoMovimento tipoMovimento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private MaterialCaixa materialCaixa;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TipoVidro tipoVidro;

    @Column(nullable = false)
    private int resistenciaAguaM;

    @Column(nullable = false)
    private int diametroMm;

    @Column(nullable = false)
    private int lugToLugMm;

    @Column(nullable = false)
    private int espessuraMm;

    @Column(nullable = false)
    private int larguraLugMm;

    @Column(nullable = false)
    private long precoEmCentavos;

    @Column(nullable = false, length = 600)
    private String urlImagem;

    @Column(nullable = false)
    private Instant criadoEm;

    @PrePersist
    void prePersist() {
        if (id == null) id = UUID.randomUUID();
        if (criadoEm == null) criadoEm = Instant.now();
        normalizar();
    }

    @PreUpdate
    void PreUpdate() {
        normalizar();
    }

    private void normalizar(){
        if (marca != null) marca = marca.trim();
        if (modelo != null) modelo = modelo.trim();
        if (referencia != null) referencia = referencia.trim();
        if (urlImagem != null) urlImagem = urlImagem.trim();
    }
}
