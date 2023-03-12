package com.blockchainexample.interactors.impl;

import com.blockchainexample.entity.Block;
import com.blockchainexample.entity.Wallet;
import com.blockchainexample.enums.Step;
import com.blockchainexample.helper.ConsoleHelper;
import com.blockchainexample.interactors.ObjectStep;

import java.math.BigDecimal;
import java.util.Scanner;

public class ObjectStepImpl implements ObjectStep {

    @Override
    public Step execute(BlockChain blockChain) {

        ConsoleHelper.separator();
        try {
            System.out.println("We're now just accept wallet type...");
            System.out.println("Write the amount of value that you have in your digital wallet...");

            Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();

            blockChain.addBlock(new Block<>(new Wallet(new BigDecimal(number)), blockChain.getPreviusHash()));

            return Step.CONTINUE;

        } catch (Exception e){
            return Step.ERROR;
        }
    }
}
