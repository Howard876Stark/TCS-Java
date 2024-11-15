// Example 1:
// Input:
//  arr[] = {2,5,1,3,0};
// Output:
//  5
// Explanation:
//  5 is the largest element in the array.

// example2:
// Input: arr[] = {8,10,5,7,9};
// Output: 
// 10
// Explanation: 
// 10 is the largest element in the array.


public class FindTheLargestNumberInAnArray {
    public static void main(String[]args) {
        //Example 1
        System.out.println();
        System.out.println("Example 1 ");
        int[] arr1 = {2,5,1,3,0};
        int max1 = Integer.MIN_VALUE;
        for (int i = 0 ; i <= arr1.length-1 ; i++){
           if (max1 < arr1[i]){
              max1 = arr1[i] ;                         
           }else{

           }
        }
        System.out.println("The largest element in array is: " + max1);
        System.out.println();
        System.out.println("Example 2 ");

        //Example 2
        int[] arr2 = {8,10,5,7,9};
        int max2 = Integer.MIN_VALUE;
        for (int i = 0 ; i <= arr2.length-1 ; i++){
           if (max2 < arr2[i]){
              max2 = arr2[i] ;                         
           }else{

           }
        }
        System.out.println("The largest element in array is: " + max2);
    }
}