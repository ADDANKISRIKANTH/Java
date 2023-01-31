package org.example;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even=0;
        int odd=0;
        boolean k = n % 2 == 0;

        if (k) {
            even += n;
        } else {
            odd += n;
        }

        System.out.println(even+" \t"+odd);
    }
}
