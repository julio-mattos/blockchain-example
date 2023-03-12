package com.blockchainexample.interactors.impl;
import com.blockchainexample.entity.Block;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.blockchainexample.constants.Constants;
import com.blockchainexample.exception.BlockChainException;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class BlockChain {

    private final List<Block<?>> blockChain;

    public BlockChain(){
        this.blockChain = new ArrayList<>();
    }

    public void addBlock(Block<?> block){

        System.out.println("Add new block to the blockChain with value: ");
        System.out.println(block);

        isBlockValid(block);
        this.blockChain.add(block);
    }
    public String getPreviusHash(){
        return this.blockChain.isEmpty() ? Constants.FIRST_HASH :
                getBlockChain()
                .get(getBlockChain()
                        .size() - 1)
                .getHash();
    }

    private void isBlockValid(Block<?> block){

        if (!Objects.equals(block.getPreviousHash(), Constants.FIRST_HASH) &&
                !Objects.equals(block.getPreviousHash(), getPreviusHash())){
                        throw new BlockChainException("Invalid previous hash!");
        }
    }

    @Override
    public String toString(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(getBlockChain());
    }

}
