package com.financeproject.personalfinance.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_description")
    private String categoryDescription;

    @Column(name = "category_budget")
    private Double budgedLimit;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Column(name = "category_is_parent")
    private Boolean isParent;

    @ManyToOne
    @JoinColumn(name = "category_parent", referencedColumnName = "id")
    private Category category;

    @Column(name = "priority_level")
    private String priorityLevel;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

}
