package com.blockchainexample.interactors;


import com.blockchainexample.enums.Step;

public interface ChooseDataTypeStep extends ApplicationSteps {

    @Override
    default Step step(){
        return Step.CHOOSEDATATYPE;
    }
}
