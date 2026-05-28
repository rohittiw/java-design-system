package com.tiwari.ro.pattern;

import java.util.Scanner;

public class PyramidPattern_1 {

    public static void main(String[] args) {

        System.out.println("******** Display Pattern *************\n");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Define Length To Display Pyramid : ");
        int num = scnr.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }

    }

}