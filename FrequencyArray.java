/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class FrequencyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,2,3,4,5,5,8,9,9};

		int[] givenArr = new int[arr.length];

		int visit = 1;

		for(int i=0;i<arr.length;i++)
		{
			int count  = 1;

			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])  
				{
					count++;
				}

			}

			if(givenArr[i]!=visit) {

				givenArr[i]=count;
			}
		}
		System.out.println("Element \t Frequency:");

		for (int i=0; i<givenArr.length;i++) {

			if(givenArr[i]!=visit) {
				System.out.println("Element " + arr[i] + "\t" + "repeated " + givenArr[i]);
			}

		}
	}
}





