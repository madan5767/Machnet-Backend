package com.example.NepaliShareMarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NEPSE_TBL")
public class Nepse {
    @Id
    @GeneratedValue
    private int id;
    private String companyName;
    private int noOfTransactions;
    private int maxPrice;
    private int minPrice;
    private int closingPrice;
    private int tradedShares;
    private double amount;
    private double previousClosing;
    private float difference;
}
