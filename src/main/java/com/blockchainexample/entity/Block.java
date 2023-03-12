package com.blockchainexample.entity;

import com.google.gson.GsonBuilder;
import com.blockchainexample.helper.BlockChainHelper;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Block <T>{

    private String hash;
    private String previousHash;
    private T data;
    private long timeStamp;
    private int nonce;

    public Block(T data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        generateHash();
    }

    public void generateHash(){
        String joinedAttributes = new StringBuilder()
                .append(this.previousHash)
                .append(this.timeStamp)
                .append(this.nonce)
                .append(this.data)
                .toString();

        this.hash = BlockChainHelper.calculateBlockHash(joinedAttributes);

    }

    public void incrementNounce(){
        this.nonce++;
    }

    @Override
    public String toString(){
        return new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .toJson(this);
    }

}
