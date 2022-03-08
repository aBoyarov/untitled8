package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printHello();
    }

    private static void printHello() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". Привет");
        }
    }
}