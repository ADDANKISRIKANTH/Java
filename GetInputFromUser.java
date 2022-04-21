package test;
import java.util.*;
public class GetInputFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("Enter the Intger:");
		int in = sc.nextInt();
		System.out.println(in);
		
		System.out.println("Enter the float");
		float fla = sc.nextFloat();
		System.out.println(fla);
	}

}
