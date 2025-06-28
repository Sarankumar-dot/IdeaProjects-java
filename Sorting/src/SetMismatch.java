import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));

    }


    //leetcode 645
    static int[] findErrorNums(int[] nums) {
        int i = 0;

        while(i<nums.length){
            int correctIndex  = nums[i] -1 ; // -1 is added because we are the array contains the elments starting from 1

            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return new int[] {index+1,nums[index]};
            }
        }
    return new int[] {-1,-1};
    }
    static void swap(int[] arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
