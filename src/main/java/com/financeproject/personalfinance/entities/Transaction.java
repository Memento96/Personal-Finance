package com.financeproject.personalfinance.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate date;

    private Double amount;

    private Category category;

    private String transactionPriority;


}
