package com.dbs.PayZ.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BooleanUtil {
    @JsonProperty("accHolderName")
    String accHolderName;

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
}
