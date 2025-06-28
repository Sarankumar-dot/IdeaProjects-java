import java.util.Arrays;

public class ConcatenationofArray1929 {
    //leetcode 1929

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length*2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+length] = nums[i];
        }


    return ans;
    }
}
