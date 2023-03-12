package com.blockchainexample.interactors.impl;

import com.blockchainexample.constants.Constants;
import com.blockchainexample.entity.Block;
import com.blockchainexample.enums.Step;
import com.blockchainexample.helper.ConsoleHelper;
import com.blockchainexample.interactors.Miner;
import com.blockchainexample.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
public class MinerImpl implements Miner {

    @Override
    public Step execute(BlockChain blockChain){

        ConsoleHelper.mining();

        try{
            var executorService = Executors
                    .newFixedThreadPool(blockChain.getBlockChain().size());

            blockChain.getBlockChain().forEach(block ->
                    executorService.execute(() -> miningBlock(block)));

            executorService.shutdown();

                while (!executorService.awaitTermination(Constants.WAITINGTIME, TimeUnit.SECONDS)) {
                    System.out.println("Mining...");
                }

            System.out.println("BlockChain was mined and created successfully with data: ");
            System.out.println(blockChain);

            return Step.EXIT;

        } catch (Exception e){
            return Step.ERROR;
        }
    }

    private void miningBlock(Block<?> block){

        System.out.println("Starting mine the block with hash: " + block.getHash());

        while (!block.getHash().substring(0, Constants.DIFFICULT)
                .equals(StringUtils.findDifficultNumber())){
            block.generateHash();
            block.incrementNounce();
        }

        System.out.println("Block mined with success!");
    }
}
