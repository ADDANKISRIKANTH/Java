package test;
import java.util.*;
import java.math.BigInteger;

public class AdditionalLargeNumber {

	public static void main(String[] args) {
		String num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1:");
		num1 = sc.nextLine();
		
		
		System.out.println("Enter the num2:");
		num2 = sc.nextLine();
		BigInteger first = new BigInteger(num1);
		BigInteger second = new BigInteger(num2);
		BigInteger sum;
		sum = first.add(second);
		System.out.println(sum);
		
		

	}

}
