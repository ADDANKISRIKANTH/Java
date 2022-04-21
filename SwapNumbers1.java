package test;
import java.util.*;
public class SwapNumbers1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter a and b values");
		 
		a = sc.nextInt();
		b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a and b values:"+a+" "+b);
	}

}
