package kr.co.eddy.java.in.action.apple;

import java.util.List;

public class PrintAppleUtil {
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {

        for(Apple apple : inventory) {
            System.out.println(formatter.accept(apple));
        }
    }
}
