package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfAnArrayBS4 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,7,7,7,7};
        int target =1;
        int[] ans = search(arr,target);

        System.out.println(Arrays.toString(ans));



    }


    static int[] search(int[] nums, int target){
        int[] ans = {-1,-1};

        int start = position(nums,target,true);
        int end = position(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;


    }
    static int position(int[] nums, int target ,boolean FindStartIndex ){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(FindStartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
