package com.dbs.PayZ.Repositories;

import com.dbs.PayZ.Entities.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    
}
