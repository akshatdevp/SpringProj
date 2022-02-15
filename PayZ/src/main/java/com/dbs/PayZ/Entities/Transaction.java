package com.dbs.PayZ.Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
//TODO add ENUMS here?
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
    
    @Column(name="transfer_type")
    @JsonProperty("transferType")
    String transferType;

    @Column(name="message_code")
    @JsonProperty("messageCode")
    String messageCode;

    @Column(name="amount")
    @JsonProperty("amount")
    Long amount;

    public Long getTxnId() {
        return TxnId;
    }

    public void setTxnId(Long txnId) {
        TxnId = txnId;
    }

    public String getTxnStatus() {
        return txnStatus;
    }

    public void setTxnStatus(String txnStatus) {
        this.txnStatus = txnStatus;
    }

    public Double getTransfer_fee() {
        return transfer_fee;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    
}
