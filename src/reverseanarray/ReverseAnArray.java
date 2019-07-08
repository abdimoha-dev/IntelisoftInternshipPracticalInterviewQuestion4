/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseanarray;

import java.util.Arrays;

/**
 *
 * @author Abdi Mohammed
 */
public class ReverseAnArray {

    //Return true, if reversing the subarray will  
// sort the array, else return false.  
    static boolean checkReverse(int arr[], int n) { 
        // Copying the array.  
        int temp[] = new int[n]; 
        for (int i = 0; i < n; i++) { 
            temp[i] = arr[i]; 
        } 
  
        // Sort the copied array.  
        Arrays.sort(temp); 
  
        // Finding the first mismatch.  
        int front; 
        for (front = 0; front < n; front++) { 
            if (temp[front] != arr[front]) { 
                break; 
            } 
        } 
  
        // Finding the last mismatch.  
        int back; 
        for (back = n - 1; back >= 0; back--) { 
            if (temp[back] != arr[back]) { 
                break; 
            } 
        } 
  
        // If whole array is sorted  
        if (front >= back) { 
            return true; 
        } 
  
        // Checking subarray is decreasing or not.  
        do { 
            front++; 
            if (arr[front - 1] < arr[front]) { 
                return false; 
            } 
        } while (front != back); 
  
        return true; 
    } 
  
// Driven Program  
    public static void main(String[] args) { 
  
        int arr[] = {1, 2, 5, 4, 3}; 
        int n = arr.length; 
  
        if (checkReverse(arr, n)) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
    } 
    
}
