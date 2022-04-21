package test;
import java.util.*;

public class SwapNumbers {

	public static void main(String[] args) {
		
		
		int a,b,temp;
		System.out.println("Enter the a and b values");
		Scanner sc = new Scanner(System.in);
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("before swapping \na= "+a+" "+"\nb= "+b);
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("after swapping \na= "+a+" "+"\nb= "+b);
	}

}
