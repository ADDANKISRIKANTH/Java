package test;

import java.util.Scanner;

public class FindCharecters {

    public static void main(String[] args) {

        char c;
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);
        if(c >= 'A' && c <= 'Z'){
            System.out.println(1);
        } else if (c >= 'a' && c  <= 'z') {
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
    }
}
