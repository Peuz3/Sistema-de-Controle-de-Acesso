package com.dio.sistema.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor //Construtor com argumentos
@NoArgsConstructor //Construtor vazio
@EqualsAndHashCode
@Builder
public class JornadaTrabalho {
    private long id;
    private String descricao;



}
