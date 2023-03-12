package com.blockchainexample.interactors.impl;

import com.blockchainexample.entity.Block;
import com.blockchainexample.enums.Step;
import com.blockchainexample.helper.ConsoleHelper;
import com.blockchainexample.interactors.TextStep;

import java.util.Scanner;

public class TextStepImpl implements TextStep {

    @Override
    public Step execute(BlockChain blockChain) {

        ConsoleHelper.separator();

        try {

            System.out.println("Write the text that you want to input in your block...");
            Scanner scanner = new Scanner(System.in);

            String text = scanner.nextLine();

            blockChain.addBlock(new Block<>(text, blockChain.getPreviusHash()));

            return Step.CONTINUE;

        } catch (Exception e){
            return Step.ERROR;
        }
    }
}
