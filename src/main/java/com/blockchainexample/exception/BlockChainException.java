package com.blockchainexample.exception;

public class BlockChainException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public BlockChainException(String message){
        super(message);
    }

}
