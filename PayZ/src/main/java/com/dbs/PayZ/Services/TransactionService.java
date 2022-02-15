package com.dbs.PayZ.Services;

import java.util.List;

import com.dbs.PayZ.Entities.Transaction;
import com.dbs.PayZ.Repositories.TransactionRepository;
import com.dbs.PayZ.util.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class TransactionService {
    private TransactionRepository txnRepo;
    
    @Autowired
    public TransactionService(TransactionRepository tr)
    {
    	this.txnRepo = tr;
    }
    Long getTotalAmount(Long amount, double transferFee){ // adds the transfer fee to the total amount.
        return (long) (amount*(100.0+transferFee));
    } 
    
    public List<Transaction> getTransactions(){
        return txnRepo.findAll();
    }

    public ResponseEntity<Transaction> getTxnById(Long TxnId){
        return Utility.fromOpt(txnRepo.findById(TxnId));
    }

    public Transaction initiateTxn(Transaction txn){
        return txnRepo.save(txn);
    }

}
