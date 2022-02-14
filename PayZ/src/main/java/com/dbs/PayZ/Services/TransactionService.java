package com.dbs.PayZ.Services;

import java.util.List;

import com.dbs.PayZ.Entities.Transaction;
import com.dbs.PayZ.Repositories.TransactionRepository;
import com.dbs.PayZ.util.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/txns")
public class TransactionService {
    private TransactionRepository txnRepo;
    
    @Autowired
    public TransactionService(TransactionRepository tr)
    {
    	this.txnRepo = tr;
    }
    Long getTotalAmount(Long amount, double transferFee){
        return (long) (amount*(100.0+transferFee));
    }
    @GetMapping
    public List<Transaction> getTransactions(){
        return txnRepo.findAll();
    }
    @GetMapping
    public ResponseEntity<Transaction> getTxnById(Long TxnId){
        return Utility.fromOpt(txnRepo.findById(TxnId));
    }

}
