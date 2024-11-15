// import.java.util.Arrays;
/*
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	    5   2
        15  1
Explanation: 10 occurs 3 times in the array
	         5  occurs 2 times in the array
             15 occurs 1 time in the array
 */
import java.util.Arrays;
public class Find_Repeting_Element {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int count = 1;
             for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                } else {
                    break;
                }
            }
        System.out.println(arr[i] + " " + count);
        }
        

    }
}