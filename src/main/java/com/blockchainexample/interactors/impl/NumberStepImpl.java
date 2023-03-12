package com.blockchainexample.interactors.impl;

import com.blockchainexample.entity.Block;
import com.blockchainexample.enums.Step;
import com.blockchainexample.helper.ConsoleHelper;
import com.blockchainexample.interactors.NumberStep;

import java.util.Scanner;

public class NumberStepImpl implements NumberStep {

    @Override
    public Step execute(BlockChain blockChain) {

        ConsoleHelper.separator();

        try{
            System.out.println("Write the Number that you want to input in your block...");
            Scanner scanner = new Scanner(System.in);

            Integer number = scanner.nextInt();

            blockChain.addBlock(new Block<>(number, blockChain.getPreviusHash()));

            return Step.CONTINUE;

        } catch (Exception e){
            return Step.ERROR;
        }
    }
}
