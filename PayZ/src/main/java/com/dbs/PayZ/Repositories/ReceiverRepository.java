package com.dbs.PayZ.Repositories;

import com.dbs.PayZ.Entities.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiverRepository extends JpaRepository<Receiver,String> {
    
}
