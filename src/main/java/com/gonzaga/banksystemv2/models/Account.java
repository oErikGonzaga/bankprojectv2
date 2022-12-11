package com.gonzaga.banksystemv2.models;

import com.gonzaga.banksystemv2.enums.AccountType;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
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

    @OneToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @Column(nullable = false, precision = 6) // precision garante que atenda a especificação (antes de chegar no banco)
    private Integer password;
    private BigDecimal balance; // BigDecimal, usado para valores financeiros.

    @Column(name = "tp_account")
    private AccountType accountType;

    @Column(name = "registration_dt", nullable = false) // Não pode ser null
    private LocalDateTime dateActivation;

    @Column(name = "deactivation_dt")
    private LocalDateTime dateDeactivation;

}
