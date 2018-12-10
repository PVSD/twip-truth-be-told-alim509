package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        boolean A;
        boolean B;
        boolean test = kbInput.nextBoolean();

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                A = true;
                B = true;
            } else if (i == 1) {
                A = true;
                B = false;
            } else if (i == 2) {
                A = false;
                B = true;
            } else {
                A = false;
                B = false;
            }

            test = A && B;
            System.out.println(test);

        }

    }
}
