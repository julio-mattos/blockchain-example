package com.blockchainexample.interactors;
import com.blockchainexample.enums.Step;

public interface ObjectStep extends ApplicationSteps {

    @Override
    default Step step(){
        return Step.OBJECT;
    }
}
