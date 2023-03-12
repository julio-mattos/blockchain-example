package com.blockchainexample.interactors.impl;


import com.blockchainexample.enums.Step;
import com.blockchainexample.helper.ConsoleHelper;
import com.blockchainexample.interactors.ChooseDataTypeStep;

import java.util.Scanner;

public class ChooseDataTypeStepImpl implements ChooseDataTypeStep {

    @Override
    public Step execute(BlockChain blockChain) {

        ConsoleHelper.separator();

        System.out.println("Choose the data type that do you want to input in your block...");
        System.out.println("0 - Text type.");
        System.out.println("1 - Number type.");
        System.out.println("2 - Object type.");

        try{
            Scanner scanner = new Scanner(System.in);

            int dataType = scanner.nextInt();

            switch (dataType){
                case 0 : return Step.TEXT;
                case 1 : return Step.NUMBER;
                case 2 : return Step.OBJECT;
                default: return Step.EXIT;
            }
        } catch (Exception e){
            return Step.ERROR;
        }
    }
}
