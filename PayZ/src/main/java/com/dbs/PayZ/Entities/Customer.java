package com.dbs.PayZ.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor

@Data
@Entity
@Table(name ="customer")
public class Customer {
    @Id
    @Column(name="customer_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JsonProperty("customerId")
    Long customerId;

    @JsonProperty("accHolderName")
    @Column(name = "acc_holder_name")
    String accHolderName;

    @JsonProperty("clearBalance")
    @Column(name = "clear_balance")
    Long clearBalance;
    
    @JsonProperty("overDraft")
    @Column(name = "over_draft")
    Boolean overDraft;

    public Customer() {}
    public String toString()
    {
    	return this.customerId + this.accHolderName;
    }
}
