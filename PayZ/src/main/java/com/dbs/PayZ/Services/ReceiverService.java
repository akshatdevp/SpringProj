package com.dbs.PayZ.Services;

import java.io.File;
import java.util.Optional;

import com.dbs.PayZ.Entities.Receiver;
import com.dbs.PayZ.Repositories.ReceiverRepository;
import com.dbs.PayZ.util.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiverService {
    private ReceiverRepository receiverRepo;
    
    @Autowired
    public ReceiverService(ReceiverRepository cr)
    {
    	this.receiverRepo = cr;
    }
    public Optional<Receiver> geReceiverById(String id) {
        return receiverRepo.findById(id);
    }
    public boolean isAllowed(String name){
        return Utility.searchInFile(name,new File("PayZ/src/main/resources/static/sdn.txt") );
    }
    
}
