package TwoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Example 2: Given a sorted array of unique integers and a target integer, return true if there exists a pair of numbers that sum to target, false otherwise. This problem is similar to Two Sum. (In Two Sum, the input is not sorted).

For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.

Note: a similar version of this problem can be found on LeetCode: 167. Two Sum II - Input Array Is Sorted

The brute force solution would be to iterate over all pairs of integers. Each number in the array can be paired with another number, so this would result in a time complexity of O(n2)O(n2), where nn is the length of the array. Because the array is sorted, we can use two pointers to improve to an O(n)O(n) time complexity.

Let's use the example input. With two pointers, we start by looking at the first and last numbers. Their sum is 1 + 15 = 16. Because 16 > target, we need to make our current sum smaller. Therefore, we should move the right pointer. Now, we have 1 + 14 = 15. Again, move the right pointer because the sum is too large. Now, 1 + 9 = 10. Since the sum is too small, we need to make it bigger, which can be done by moving the left pointer. 2 + 9 = 11 < target, so move it again. Finally, 4 + 9 = 13 = target.

The reason this algorithm works: because the numbers are sorted, moving the left pointer permanently increases the value the left pointer points to (nums[left] = x). Similarly, moving the right pointer permanently decreases the value the right pointer points to (nums[right] = y). If we have x + y > target, then we can never have a solution with y because x can only increase. So if a solution exists, we can only find it by decreasing y. The same logic can be applied to x if x + y < target.

Click here for a more detailed explanation if needed

*/

// leetcode two sum2 167
public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9, 14, 15};
        int target = 13;

        int[] ans = bs(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] bs(int[] arr,int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int cursum = arr[left] + arr[right];

            if (cursum == target) {
                return new int[]{left, right};
            }

            if (cursum > target) {
                right = right - 1;
            } else {
                left = left + 1;
            }
        }

        return new int[] {-1,-1};
    }

}


