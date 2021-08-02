package com.dio.sistema.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor //Construtor com argumentos
@NoArgsConstructor //Construtor vazio
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    //Implementando a Chave composta
    @AllArgsConstructor //Construtor com argumentos
    @NoArgsConstructor //Construtor vazio
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasID implements Serializable{
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private long BancoHorasID;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHorasTrabalhadas;
    private BigDecimal saldoHorasTrabalhadas;

}
