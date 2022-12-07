package com.gonzaga.banksystemv2.model;

import com.gonzaga.banksystemv2.enums.AccountType;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "account")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long number;

    @Column(name = "client_id")
    private Long clientId;
    private Double balance;
    private Integer password;

    @Column(name = "tp_account")
    private AccountType accountType;

    @Column(name = "registration_dt")
    private LocalDateTime dateActivation;

    @Column(name = "deactivation_dt")
    private LocalDateTime dateDeactivation;

}
