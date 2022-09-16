/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class SmallestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = new int [] {5, 11, 97, 75, 756};  
        
        int min = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element is: " + min);  
    }  
	

}
