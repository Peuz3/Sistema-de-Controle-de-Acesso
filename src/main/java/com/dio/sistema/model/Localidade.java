package com.dio.sistema.model;

import lombok.*;

import javax.persistence.ManyToOne;


@Getter
@Setter
@AllArgsConstructor //Construtor com argumentos
@NoArgsConstructor //Construtor vazio
@EqualsAndHashCode
@Builder
public class Localidade {
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
