package com.blockchainexample.utils;

public class StringUtils {

    private StringUtils(){}

    public static String findDifficultNumber(){

        return new String(new char[5]).replace('\0', '0');
    }
}
