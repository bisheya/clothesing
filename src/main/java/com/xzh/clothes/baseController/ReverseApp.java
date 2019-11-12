package com.xzh.clothes.baseController;

import java.util.Scanner;

class ReverseApp{
    public static String doRev(){

        Scanner scanner = new Scanner(System.in);
        String out = new StringBuffer(scanner.next()).reverse().toString();
        return out;
    }
}