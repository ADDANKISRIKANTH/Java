package org.example;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here:");
        int n = sc.nextInt();
        int i = 2;
        boolean isPrime = true;
        while (i<=n-1){
            if(n % i == 0){
                System.out.println("i: "+i+" n: "+n);
                isPrime = false;
            }
            i +=1;
        }
        if(isPrime == true){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
