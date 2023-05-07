package com.financeproject.personalfinance.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "income_amount")
    private Double incomeAmount;

    @Column(name = "income_description")
    private String incomeDescription;

    @Column(name = "creation_date")
    private LocalDate createdAt;

    @ManyToOne
    @JoinColumn(name = "income_category", referencedColumnName = "id")
    private Category category;

}
