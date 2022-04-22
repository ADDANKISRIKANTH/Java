package test;

public class Star {
	int coderStar;
	public static void main(String[] args) {
		for(int row = 1; row <= 10; row++) {
			for(int coderStar = 1; coderStar <= row; coderStar++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
