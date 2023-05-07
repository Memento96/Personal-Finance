package com.financeproject.personalfinance.services;

import com.financeproject.personalfinance.entities.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionService {

    Transaction createTransaction (Transaction transaction);

    Optional<Transaction> getTransaction (String transactionName);

    List<Transaction> getAllTransactions ();

    List<Transaction> getTransactionsByCategoryName(String categoryName);

    Transaction modifyTransaction(Transaction transaction);

    Boolean deleteTransaction(String transactionName);


}
