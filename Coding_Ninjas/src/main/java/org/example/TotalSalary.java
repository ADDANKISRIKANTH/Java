package org.example;

import java.util.Scanner;

public class TotalSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary: ");
        int basicSalary = sc.nextInt();

        System.out.println("Enter character: ");
        char g = sc.next().charAt(0);

        int hra,da,pf;
        double sum = basicSalary+(0.2*basicSalary)+(0.5*basicSalary);

        if(g == 'A'){
            sum +=1700;
        }else if(g == 'B'){
            sum += 1500;
        }else{
            sum +=1300;
        }

        sum = sum - (0.11*basicSalary);
        if(sum - (sum) >= 0.5){
            System.out.println((int)Math.ceil(sum));
        }else{
            System.out.println((int)Math.floor(sum));
        }

    }
}
