package test;
import java.util.*;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		float temperature;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the tepreture in Fahrenheit");
		temperature = sc.nextInt();
		
		temperature = ((temperature-32)*5)/9;
		System.out.println(temperature);

	}

}
