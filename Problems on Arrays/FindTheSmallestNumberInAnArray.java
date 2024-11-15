// Problem Statement: Given an array, we have to find the smallest element in the array.

// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 0
// Explanation: 0 is the smallest element in the array. 


public class FindTheSmallestNumberInAnArray {
    public static void main(String[]args) {
        int[] arr = {2,5,1,3,0};
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i <= arr.length-1 ; i++){
           if (min > arr[i]){
              min = arr[i] ;                         
           }else{

           }
        }
        System.out.println("The smallest element in array is: " + min);
    }
}