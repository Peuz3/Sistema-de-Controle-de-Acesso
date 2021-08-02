package com.dio.sistema.model;

import lombok.*;

import javax.persistence.*;
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
public class Movimentacao {

    @AllArgsConstructor //Construtor com argumentos
    @NoArgsConstructor //Construtor vazio
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoID implements Serializable{
        private long idMovimentacao;
        private long idUsuario;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @EmbeddedId
    private MovimentacaoID id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;


}
