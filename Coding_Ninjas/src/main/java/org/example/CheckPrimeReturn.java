package org.example;

import java.util.Scanner;

public class CheckPrimeReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int div = 2;
        boolean isPrime = true;

        while(div <= n/2 ){
            if(div % n == 0){
                isPrime = false;
                System.out.println("Composite");
                return;
            }
            div += 1;
        }
        System.out.println("Prime");
    }
}
