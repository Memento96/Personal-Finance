package com.financeproject.personalfinance.services.impl;

import com.financeproject.personalfinance.entities.Income;
import com.financeproject.personalfinance.repositories.IncomeRespository;
import com.financeproject.personalfinance.services.IncomeService;

import java.util.List;
import java.util.Optional;

public class IncomeServiceImplementation implements IncomeService {

    private final IncomeRespository incomeRespository;

    public IncomeServiceImplementation(IncomeRespository incomeRespository) {
        this.incomeRespository = incomeRespository;
    }


    @Override
    public Income createIncome(Income income) {
        return null;
    }

    @Override
    public Optional<Income> getIncome(String incomeName) {
        return Optional.empty();
    }

    @Override
    public List<Income> getAllIncome() {
        return null;
    }

    @Override
    public List<Income> getIncomeByCategoryName(String categoryName) {
        return null;
    }

    @Override
    public Income modifyIncome(Income income) {
        return null;
    }

    @Override
    public Boolean deleteIncome(String incomeName) {
        return null;
    }
}
