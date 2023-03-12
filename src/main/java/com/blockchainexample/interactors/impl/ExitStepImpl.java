package com.blockchainexample.interactors.impl;


import com.blockchainexample.enums.Step;
import com.blockchainexample.helper.ConsoleHelper;
import com.blockchainexample.interactors.ExitStep;

public class ExitStepImpl implements ExitStep {

    @Override
    public Step execute(BlockChain blockChain){

        ConsoleHelper.exitApplication();

        return null;
    }
}
