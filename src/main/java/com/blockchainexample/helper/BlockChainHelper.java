package com.blockchainexample.helper;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class BlockChainHelper {

    private BlockChainHelper(){}

    public static String calculateBlockHash(String message) {

        MessageDigest digest = null;
        byte[] bytes = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            bytes = digest.digest(message.getBytes(UTF_8));
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("");
        }
        StringBuilder buffer = new StringBuilder();
        for (byte b : bytes) {
            buffer.append(String.format("%02x", b));
        }
        return buffer.toString();
    }
}
