package com.blockchainexample.interactors;


import com.blockchainexample.enums.Step;

public interface Miner extends ApplicationSteps {

    @Override
    default Step step(){
        return Step.MINER;
    }
}
