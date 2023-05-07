package com.financeproject.personalfinance.services;

import com.financeproject.personalfinance.entities.Income;

import java.util.List;
import java.util.Optional;

public interface IncomeService {

    Income createIncome(Income income);

    Optional<Income> getIncome(String incomeName);

    List<Income> getAllIncome ();

    List<Income> getIncomeByCategoryName(String categoryName);

    Income modifyIncome (Income income);

    Boolean deleteIncome (String incomeName);

}
