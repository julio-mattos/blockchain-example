package com.blockchainexample.interactors;


import com.blockchainexample.enums.Step;

public interface ContinueStep extends ApplicationSteps {

    @Override
    default Step step(){
        return Step.CONTINUE;
    }
}
