package com.dbs.PayZ.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//TODO should remove acc_h_n/acc_no.
@Entity
@Table
public class Receiver {
    @Id
    @Column(name="bic")
    //@JsonProperty("BIC")
    String BIC;

    @Column(name="inst_name")
    //@JsonProperty("InstName")
    String InstName;

    @Column(name="acc_holder_name")
    //@JsonProperty("AccHolderName")
    String AccHolderName;

    @Column(name="acc_number")
    //@JsonProperty("AccNumber")
    String AccNumber;
    public Receiver(){}
    public String getBIC() {
        return BIC;
    }
    public void setBIC(String bIC) {
        BIC = bIC;
    }
    public String getInstName() {
        return InstName;
    }
    public void setInstName(String instName) {
        InstName = instName;
    }
    public String getAccHolderName() {
        return AccHolderName;
    }
    public void setAccHolderName(String accHolderName) {
        AccHolderName = accHolderName;
    }
    public String getAccNumber() {
        return AccNumber;
    }
    public void setAccNumber(String accNumber) {
        AccNumber = accNumber;
    }
}
