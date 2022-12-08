package com.gonzaga.banksystemv2.model;

import com.gonzaga.banksystemv2.enums.DocumentType;
import com.gonzaga.banksystemv2.enums.PersonType;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/*  personType utilizará ENUM,
    devido o fato de existirem somente 2 valores
    Pessoa Física PF e Pessoa Jurica PJ. */

@Builder
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Integer phone;

    /*  @OneToOne faz relação de Um para Um.
        No caso, a variável address faz referência à
        variável "id" da Classe Address
        @JoinColumn faz referência à:
        (FOREIGN KEY(address_id) REFERENCES address(id))  */

    @OneToOne
    @JoinColumn (name = "address_id", referencedColumnName = "id")
    private Address address;

    private Integer document;
    private LocalDate birthdate;

    @Column(name = "tp_person")
    private PersonType personType;

    @Column(name = "tp_document")
    private DocumentType documentType;
}
