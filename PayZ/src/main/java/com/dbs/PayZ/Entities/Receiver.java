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
public class Receiver {
    @Id
    @Column(name="bic")
    @JsonProperty("BIC")
    String BIC;

    @Column(name="inst_name")
    @JsonProperty("InstName")
    String InstName;

    @Column(name="acc_holder_name")
    @JsonProperty("AccHolderName")
    String AccHolderName;

    @Column(name="acc_number")
    @JsonProperty("AccNumber")
    String AccNumber;
    public Receiver(){}
}
