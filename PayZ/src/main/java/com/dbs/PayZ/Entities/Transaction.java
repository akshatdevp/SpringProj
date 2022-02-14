package com.dbs.PayZ.Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
@Entity
@Table
public class Transaction {
    @Id
    @Column(name="txn_id")
    @JsonProperty("TxnId")
    Long TxnId;

    @Column(name="txn_status")
    @JsonProperty("txnStatus")
    String txnStatus;

    final Double transfer_fee = 0.0025;
    
    @Column(name="transfer_code")
    @JsonProperty("transferCode")
    String transferCode;

    @Column(name="message_code")
    @JsonProperty("messageCode")
    String messageCode;

    @Column(name="amount")
    @JsonProperty("amount")
    Long amount;
    
}
