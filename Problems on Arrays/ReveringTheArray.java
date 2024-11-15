import java.util.Arrays;

/*
Example last
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
 */

public class ReveringTheArray {
    public static void main(String[]args){
    //  int[] arr = {5,4,3,2,1};
    //  int[] copy = arr.clone();
        
    //     int last = arr.length - 1;
        
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = copy[last];
    //         last--;
    //     }

    //     System.out.println();
    //     System.out.println("Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on."+Arrays.toString(arr));
        System.out.println();


        int[] arr2 = {10,20,30,40};

        // int tmp = 0;
       int length = arr2.length,start = 0, end = length - 1;
      while (start < end) {
         int tmp = arr2[start];
         arr2[start] = arr2[end];
         arr2[end] = tmp;
         start++;
         end--;
      }
        System.out.println(Arrays.toString(arr2));
        System.out.println();
    }
}