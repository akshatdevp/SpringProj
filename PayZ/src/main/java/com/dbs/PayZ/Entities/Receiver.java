package com.dbs.PayZ.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Receiver {
    @Id
    String BIC;
    String InstName;
    String AccHolderName;
    String AccNumber;
}
