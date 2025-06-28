import java.util.Arrays;

public class Howmanynumbersaresmaller {

    //leetcode 1365
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int ans[] = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        int j =1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[i+j]){
                count++;
                j++;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = count;

        }
            return ans;
        }


    }
