package com.blockchainexample.interactors;

import com.blockchainexample.enums.Step;
import com.blockchainexample.interactors.impl.BlockChain;


public interface ApplicationSteps {

    Step execute(BlockChain blockChain);

    Step step();
}
