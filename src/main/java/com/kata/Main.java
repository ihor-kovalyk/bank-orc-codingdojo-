package com.kata;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input  = sc.nextLine();
        Map<Digits1, Integer> nestDigits;

            nestDigits = new EnumMap<Digits1, Integer>(Digits1.class);
            nestDigits.put(Digits1.ZERO, 0);
            nestDigits.put(Digits1.ONE, 1);
            nestDigits.put(Digits1.TWO, 2);
            nestDigits.put(Digits1.THREE, 3);
            nestDigits.put(Digits1.FOUR, 4);
            nestDigits.put(Digits1.FIVE, 5);
            nestDigits.put(Digits1.SIX, 6);
            nestDigits.put(Digits1.SEVEN, 7);
            nestDigits.put(Digits1.EIGHT, 8);
            nestDigits.put(Digits1.NINE, 9);
//            nestDigits.forEach((key, value) -> {
//                if(getNum(input) == value)
//                    System.out.println(key.getValue());});
//            getNum(input);
//        }
//    public static int getNum(int num){
//        Scanner sc = new Scanner(System.in);
//         num = sc.nextInt();
//         int a = 0;
//        String number = String.valueOf(num);
//        for(int i = 0; i < number.length(); i++) {
//            int j = Character.digit(number.charAt(i), 10);
////            System.out.print("  " + j);
//            return a = j;
//        }
//        return a;
//    }
    }

    }
