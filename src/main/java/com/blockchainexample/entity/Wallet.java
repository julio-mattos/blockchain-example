package com.blockchainexample.entity;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Wallet {

    private final String accountId = UUID.randomUUID().toString();

    private final BigDecimal value;

    private final String createdDate = LocalDateTime.now().toString();

    public Wallet(BigDecimal value){
        this.value = value;
    }

}
