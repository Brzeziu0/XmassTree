package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pożądaną wysokość choinki: ");
        int height = scanner.nextInt();
        System.out.println(new XmassTree(height));
        System.out.println("Wesołych świąt!");

    }
}
