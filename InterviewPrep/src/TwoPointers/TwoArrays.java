package TwoPointers;

/*Converting this idea into instructions:

Create two pointers, one for each iterable. Each pointer should start at the first index.
Use a while loop until one of the pointers reaches the end of its iterable.
At each iteration of the loop, move the pointers forward. This means incrementing either one of the pointers or both of the pointers. Deciding which pointers to move will depend on the problem we are trying to solve.
Because our while loop will stop when one of the pointers reaches the end, the other pointer will not be at the end of its respective iterable when the loop finishes. Sometimes, we need to iterate through all elements - if this is the case, you will need to write extra code here to make sure both iterables are exhausted.

 */

import java.util.ArrayList;
import java.util.Arrays;

/*Example 3: Given two sorted integer arrays arr1 and arr2, return a new array that combines both of them and is also sorted.

The trivial approach would be to first combine both input arrays and then perform a sort. If we have n = arr1.length + arr2.length, then this gives a time complexity of O(n⋅log⁡n)O(n⋅logn) (the cost of sorting). This would be a good approach if the input arrays were not sorted, but because they are sorted, we can take advantage of the two pointers technique to improve to O(n)O(n).

In the previous example, we declared n = arr1.length and m = arr2.length. Here, we are saying n = arr1.length + arr2.length. Why have we changed the definition? Remember that when it comes to big O, we are allowed to define the variables as we see fit. We could certainly stick to using n, m. In that case, the time complexity of the sorting approach would be O((n+m)⋅log⁡(m+n))O((n+m)⋅log(m+n)) and the time complexity of the approach we are about to cover would be O(n+m)O(n+m). It makes no difference either way, but one justification we could give here is that since we are combining the arrays, the total length is a significant number, so it makes sense to represent it as n.Keeping the definition as n = arr1.length and m = arr2.length is fine as well.

We can build the answer array ans one element at a time. Start two pointers at the first index of each array, and compare their elements. At each iteration, we have 2 values. Whichever value is lower needs to come first in the answer, so add it to the answer and move the respective pointer.

 */
public class TwoArrays {
    public static void main(String[] args) {
        int[] arr = {1,5,7};
        int[] arr2 = {2,4,6,8};

        int[] ans = Merge(arr,arr2);
        System.out.println(Arrays.toString(ans));

        ArrayList<Integer> anss = Merge2(arr,arr2);
        System.out.println(anss);



    }

    // adding two sorted arrays
    static int[] Merge(int[] arr1 , int[] arr2){
        int[] Merge = new int[arr1.length + arr2.length];

        int i = 0,j = 0;
        int size = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                Merge[size] = arr1[i];
                size++;
                i++;
            }else{
                Merge[size] = arr2[j];
                size++;
                j++;
            }
        }

        while(i!=arr1.length){
            Merge[size] = arr1[i];
            size++;
            i++;
        }

        while(j!=arr2.length){
            Merge[size] = arr2[j];
            size++;
            j++;
        }

        return Merge;
    }

    // adding two arrays in a sorted list

    static ArrayList<Integer> Merge2(int[] arr1 , int[] arr2){
        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                list.add(arr1[i]);
                i++;
            }else{
                list.add(arr2[j]);
                j++;
            }
        }

        while(i!=arr1.length){
            list.add(arr1[i]);
            i++;
        }

        while(j!=arr2.length){
            list.add(arr2[j]);
            j++;
        }

        return list;
    }
    // check leetcode two pointers sums
}
