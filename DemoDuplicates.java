package test;
import java.util.Arrays;

public class DemoDuplicates {
	
	public static void main(String[] args) {
		int [] a = {10,10,20,30,40,50,50};
		
//		int[] temp = new int[a.length];
		
		int j = 0;
		for(int i=0; i < a.length-1; i++) {
			if(a[i] != a[i+1]) {
				a[j] = a[i];
				j++;
			}
			
		}
		a[j] = a[a.length-1];
		for(int i=0;i < j+1;i++) {
			System.out.println(a[i]+" ");
		}
		
		
		
	}

	
}

