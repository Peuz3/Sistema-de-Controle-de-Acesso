# Sistema-Controle-SpringBoot
Sistema de Controle com SpringBoot Gradlle

![image](https://user-images.githubusercontent.com/42546037/127666427-846eeae3-35d2-4a0b-9173-651a60eecdef.png)


Sistema de controle com gradlle e utilizando a ide Intellij. Iremos utilizar o banco de dados H2 um banco de dados que faz a persistencia na memória e deve acrescentar que há 
também, de forma comentada, implementação para o Mysql caso seja preciso. Essa informações estão no arquivo application.properties.

___________________________________________________________________________________________________________________________________________________

![image](https://user-images.githubusercontent.com/42546037/127666296-3e6737ec-c213-4a30-9755-8f8406f00c4c.png)

Implementando o Lombok um grande facilitador e deixa a classe mais limpa e fácil de fazer uma possível manutenção. Com as notações, abaixo, não será preciso gerar construtores, getters e setters e hashcode, porque o próprio Lombok fará esse gerenciamento.

@Getter
@Setter
@AllArgsConstructor //Construtor com argumentos
@NoArgsConstructor //Construtor vazio
@EqualsAndHashCode
@Builder
