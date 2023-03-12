package com.blockchainexample.interactors;

import com.blockchainexample.enums.Step;

public interface ExitStep extends ApplicationSteps {

    @Override
    default Step step(){
        return Step.EXIT;
    }
}
