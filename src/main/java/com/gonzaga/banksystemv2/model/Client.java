package com.gonzaga.banksystemv2.model;

import com.gonzaga.banksystemv2.enums.PersonType;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/*
    personType utilizará ENUM,
    devido o fato de existirem somente 2 valores
    Pessoa Física PF e Pessoa Jurica PJ.
 */

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

    @Column(name = "address_id")
    private Long addressId;

    private Integer document;
    private LocalDate birthdate;

    @Column(name = "tp_person")
    private PersonType personType;

}
