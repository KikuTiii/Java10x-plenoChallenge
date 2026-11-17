package com.example.java10xplenochallenge.config;

import com.example.java10xplenochallenge.entity.Relogio;
import com.example.java10xplenochallenge.entity.enums.TipoMovimento;
import com.example.java10xplenochallenge.entity.enums.TipoVidro;
import com.example.java10xplenochallenge.repository.RelogioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Configuration
@RequiredArgsConstructor
public class CarregadorDadosInicial {

    private final RelogioRepository relogioRepository;

    @Bean
    CommandLineRunner seedRelogios(){
      return args -> {
        if (relogioRepository.count() > 0) return;

        Instant agora = Instant.now();

        List<Relogio> relogio = List.of(
                Relogio.builder()
                        .id(UUID.randomUUID())
                        .marca("Casio")
                        .modelo("F-91WD")
                        .referencia("1234")
                        .tipoMovimento(TipoMovimento.QUARTZ)
                        .tipoVidro(TipoVidro.ACRILICO)
                        .resistenciaAguaM(30)
                        .diametroMm(35)
                        .lugToLugMm(38)
                        .espessuraMm(9)
                        .larguraLugMm(18)
                        .precoEmCentavos(19990)
                        .urlImagem("1234")
                        .criadoEm(agora.minusSeconds(5000))
                .build()
        );
            relogioRepository.saveAll(relogio);
      };
    }
}
