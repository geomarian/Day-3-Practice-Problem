/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class AscendingOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {3,7,4,8,11,6,86,9,100};
		 int tmp = 0;          
		 
		  for (int i = 0; i < arr.length; i++) 
		    {     
		        for (int j = i + 1; j < arr.length; j++) 
		        {  
		           
		            if (arr[i] > arr[j]) 
		            {          
		                tmp = arr[i];              
		                arr[i] = arr[j];            
		                arr[j] = tmp;
		            }
		        }
		    }

		          for (int i = 0; i < arr.length; i++) 
		           {     
		              System.out.println("Ascending Orders are: " + arr[i]);  
		           }
		}
		}
