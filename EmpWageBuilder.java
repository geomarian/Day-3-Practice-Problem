/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author ASUS
 *
 */
public class EmpWageBuilder {

	/**
	 * @param args
	 */
	
	public static void empAttendance() {
	//	int i = 0;
	//	int j = 1;
		Random rand = new Random();
		System.out.println("Employee attendance is: ");
		int k = rand.nextInt(2);
		System.out.println(k);
		if(k==0) {
			System.out.println("Employee is Absent: " + k);
		}
			else if(k==1){
				System.out.println("Employee is Present: " + k );
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empAttendance();
		
	}

}
