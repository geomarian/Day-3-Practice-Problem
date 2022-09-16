package com.bridgelabz;
/**
 * 
 */

/**
 * @author ASUS
 *
 */
public class ProgramPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 22;
		int b = 45;
		
		float  c = 12.23f;
		float d = 45.22f;
		
		float sum = a+b+c+d;
		System.out.println("The total value  is: " + sum);
		
		if( sum > 100 ) {
			System.out.println("Given digit is greater than 100");
		}
		else {
			System.out.println("Digit Less than 100");
		}
	}

}
