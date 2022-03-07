package test;
import java.util.*;
public class Demo_Leap_Year {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			try {
				System.out.println("Enter the Year here");
				int year = sc.nextInt();
				if(year%4 == 0) {
					if(year%100 == 0) {
						if(year%400 == 0) {
							System.out.println(year+" This is a leap year..");
						}else {
							System.out.println(year+" Not a leap year, it has 365 days");
						}
					} else {
						System.out.println(year+" This is a leap year it has 366 days");
					}
				} else {
					System.out.println(year+" Not a leap year, it has 365 days");
				}
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}

	}

}
