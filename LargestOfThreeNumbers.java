package test;
import java.util.*;
public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter the three numbers:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("N1 is greater number");
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("N2 is greater number");
		}else if(n3 > n1 && n3 > n2) {
			System.out.println("N3 is greater number");
		}else {
			System.out.println("Invalid distinct");
		}
		

	}

}
