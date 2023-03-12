package com.blockchainexample.interactors;


import com.blockchainexample.enums.Step;

public interface ErrorStep extends ApplicationSteps {

    @Override
    default Step step(){
        return Step.ERROR;
    }
}
