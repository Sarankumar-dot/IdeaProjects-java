package TwoPointers;

/*Two pointers is an extremely common technique used to solve array and string problems. It involves having two integer variables that both move along an iterable. In this article, we are focusing on arrays and strings. This means we will have two integers, usually named something like i and j, or left and right which each represent an index of the array or string.
There are several ways to implement two pointers. To start, let's look at the following method:
Start the pointers at the edges of the input. Move them towards each other until they meet.

Converting this idea into instructions:

Start one pointer at the first index 0 and the other pointer at the last index input.length - 1.
Use a while loop until the pointers are equal to each other.
At each iteration of the loop, move the pointers towards each other. This means either increment the pointer that started at the first index, decrement the pointer that started at the last index, or both. Deciding which pointers to move will depend on the problem we are trying to solve.
Here's some pseudocode illustrating the concept:

function fn(arr):
    left = 0
    right = arr.length - 1

    while left < right:
        Do some logic here depending on the problem
        Do some more logic here to decide on one of the following:
            1. left++
            2. right--
            3. Both left++ and right--
The strength of this technique is that we will never have more than O(n)
O(n) iterations for the while loop because the pointers start n
n away from each other and move at least one step closer in every iteration. Therefore, if we can keep the work inside each iteration at O(1)
O(1), this technique will result in a linear runtime, which is usually the best possible runtime. Let's look at some examples.
*/
public class StringPalin1 {

    public static void main(String[] args) {
        String car = "raceca";

        boolean ans = isPalin(car);
        if(ans){
            System.out.println("palin");
        }else{
            System.out.println("not palin");
        }

    }

    static boolean isPalin(String car){
        int start = 0;
        int end = car.length() - 1;

        while (start < end) {
            if(car.charAt(start) != car.charAt(end)){
                return false;
            }
            start+=1;
            end-=1;
        }
        return true;
    }

}
