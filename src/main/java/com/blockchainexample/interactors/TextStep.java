package com.blockchainexample.interactors;
import com.blockchainexample.enums.Step;

public interface TextStep extends ApplicationSteps {

    @Override
    default Step step(){
        return Step.TEXT;
    }
}
