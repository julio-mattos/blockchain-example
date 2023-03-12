package com.blockchainexample.interactors.impl;


import com.blockchainexample.enums.Step;
import com.blockchainexample.helper.ConsoleHelper;
import com.blockchainexample.interactors.ErrorStep;

public class ErrorStepImpl implements ErrorStep {

    @Override
    public Step execute(BlockChain blockChain){

        ConsoleHelper.separator();

        System.out.println("Something went wrong during the application running!!!");

        return Step.EXIT;
    }
}
