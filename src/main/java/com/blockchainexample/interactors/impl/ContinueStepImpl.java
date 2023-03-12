package com.blockchainexample.interactors.impl;


import com.blockchainexample.enums.Step;
import com.blockchainexample.helper.ConsoleHelper;
import com.blockchainexample.interactors.ContinueStep;

import java.util.Scanner;

public class ContinueStepImpl implements ContinueStep {

    @Override
    public Step execute(BlockChain blockChain) {

        ConsoleHelper.separator();

        System.out.println("Do you want to add more blocks, mine those that are created or exit the application...");
        System.out.println("0 - Add more blocks.");
        System.out.println("1 - just go mine.");
        System.out.println("2 - Exit, please.");

        try{
            Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();

            switch (number){
                case 0 : return Step.CHOOSEDATATYPE;
                case 1 : return Step.MINER;
                default: return Step.EXIT;
            }
        } catch (Exception e){
            return Step.ERROR;
        }
    }
}
