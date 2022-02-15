package com.dbs.PayZ.Services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;

import com.dbs.PayZ.Entities.Receiver;
import com.dbs.PayZ.Repositories.ReceiverRepository;
import com.dbs.PayZ.util.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

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
    public boolean isOnSDN(String name){
        try {
            File file = ResourceUtils.getFile("classpath:sdn.txt");
            return Utility.searchInFile(name,file);
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            return true;
        }

    }
    
}
