package com.gonzaga.banksystemv2.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

/*  Primeira Classe, seguindo padrão MVC (Camada Modelo).
    Implementando Serializable
    * Responsável pela conversão de um objeto em “bytes”,
    útil para trafegar dados pela rede. */

//Lombok
@Builder                // cria objetos sem precisarmos de construtores e sem métodos "setter"
@ToString               // retorna uma representação "string" de um objeto
@Getter @Setter         // Modificadores de Acesso (Implementam Get e Setter)
@NoArgsConstructor      // Gera um construtor sem parâmetros
@AllArgsConstructor     // Gera um construtor com 1 parâmetro para cada campo da classe

// Hibernate
@Entity                 // Informa que a classe também é uma entidade.
@Table(name= "address") // Referencia o nome da classe ao nome da entidade.
public class Address implements Serializable {

    /*  @Column para indicar uma coluna especifica na entidade / tabelas
        caso o nome da variável seja igual ao da coluna,
        não haverá necessidade de utilizar. */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String city;
    private String state;
    private String address;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "second_address")
    private String secondAddress;

}
