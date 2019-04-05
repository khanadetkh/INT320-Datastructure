/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.recurion;

/**
 *
 * @author Pakbung Knz
 */
public class BinarySearchRecursion {
    public static void main(String[] args) {
        int arr[] = {2, 7, 8, 12, 14, 15, 16, 39, 47, 53, 55};
        int n = arr.length; 
        int x = 47; 
        int result = binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    }
    private static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) 
                return mid; 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    }
}
