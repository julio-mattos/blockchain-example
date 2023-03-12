package com.blockchainexample.interactors;


import com.blockchainexample.enums.Step;

public interface NumberStep extends ApplicationSteps {

    @Override
    default Step step(){
        return Step.NUMBER;
    }
}
