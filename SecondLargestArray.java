/**
 * 
 */
package com.bridgelabz;

import java.util.Arrays;
/**
 * @author ASUS
 *
 */
public class SecondLargestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {3000,10,47,589,41,444,999,2001};
		int size = arr.length;
			
		
	Arrays.sort(arr);
	System.out.println("Sorted array is : " + Arrays.toString(arr));
		 int res = arr[size-2];
	      System.out.println("2nd largest element is = "+res);
	}

}