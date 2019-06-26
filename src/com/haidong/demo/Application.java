package com.haidong.demo;

import com.haidong.demo.Dumb.People;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        breakNestedWhile();
        objectEquals();
        stringOperation();
    }

    private static void breakNestedWhile() {
        int i = 0;

        // While语句的标记，用以退出多重循环
        rootWhile:
        while (i < 5) {
            System.out.printf("The i is: %d\n", i);
            while (i < 3) {
                System.out.printf("The i inside is: %d\n", i);
                break rootWhile;
            }
            i++;
        }
    }

    private static void objectEquals() {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);

        boolean isEqual = l1.equals(l2);
        System.out.printf("They are equals: %b\n", isEqual);


        People p1 = new People("Jeck");
        People p2 = new People("Jeck1");
        boolean isEqual2 = p2.equals(p1);
        System.out.printf("They are equals: %b\n", isEqual2);
    }

    private static void stringOperation() {
        String[] magazine = {"Hello", "World", "Hello", "Test"};
        String[] note = {"Hello", "Test"};
        String[] note2 = {"Hello", "No"};

        StringUtil.checkMagazine(magazine, note);
        StringUtil.checkMagazine(magazine, note2);
    }
}
