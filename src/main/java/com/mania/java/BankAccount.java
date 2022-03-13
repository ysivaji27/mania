package com.mania.java;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BankAccount {
    private long accountNumber; //This is important, so we'll pass it to the constructor.
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

}
