package com.blockchainexample.helper;
public class ConsoleHelper {

    private ConsoleHelper(){}

    public static void separator(){

        System.out.println("*============================================================*");

    };

    public static void printApplicationHeader(){

        System.out.println("*============================================================*");
        System.out.println("                 Application BlockChain                       ");
        System.out.println("*============================================================*");

    }

    public static void exitApplication(){
        System.out.println("*============================================================*");
        System.out.println("           Application BlockChain is Finished                 ");
        System.out.println("*============================================================*");
    }

    public static void mining(){
        System.out.println("*============================================================*");
        System.out.println("                     Starting Mining                          ");
        System.out.println("*============================================================*");
    }



}
