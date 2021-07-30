package com.dio.sistema.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor //Construtor com argumentos
@NoArgsConstructor //Construtor vazio
@EqualsAndHashCode
@Builder
public class CategoriaUsuario {
    private long id;
    private String descricao;
}
