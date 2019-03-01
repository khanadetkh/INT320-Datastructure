/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.Stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author INT303
 */
public class BalanceSymbolChecker {

    public static String checkBalance(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, "{}()<>[]", true);
            while (stk.hasMoreElements()) {
                String token = (stk.nextToken());
                if (isSymbol(token)) {
                    if (isOpenSymbol(token)) {
                        System.out.println("push("+token+")");
                    }else{
                        
                        System.out.println("pop() and check");
                    }
                }

            }
        }
        return "balanceed";
    }

    private static boolean isSymbol(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
            case "{":
            case "}":
            case "(":
            case ")":
            case "<":
            case ">":
                return true;
        }
        return false;
    }

    private static int getValue(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
                return 1;

            case "{":
            case "}":
                return 2;

            case "(":
            case ")":
                return 4;

            case "<":
            case ">":
                return 8;
        }
        return -1;
    }

    private static boolean isOpenSymbol(String symbol) {
        switch (symbol) {
            case "[":
            case "{":
            case "(":
            case "<":
                return true;
        }
        return false;

    }

    public static void main(String[] args) throws FileNotFoundException {
        checkBalance("C:\\Users\\INT303\\Documents\\NetBeansProjects\\test01\\src\\A.txt");
    }
}
