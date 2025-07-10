package CycleSort;

public class MissingNumber {
    public static void main(String[] args) {
        //leetcode 268

        int[] arr = {0,1,2,4};


        System.out.println(Cycle(arr));
    }

    static int  Cycle(int[] nums){
        int i = 0;

        while(i<nums.length){
            int correctIndex  = nums[i]; // -1 is ignored because we are the array contains the elments starting from 0

            if(nums[i] <nums.length && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }

    // missing number in an array
    // 1 to n
    static int  missingNumber(int[] nums){
        int i = 0;

        while(i<nums.length){
            int correctIndex  = nums[i] -1 ; // -1 is used because we have the array contains the elments starting from 1

            if(nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return index +1 ;
            }
        }
        return nums.length+1;
    }




    static void swap(int[] arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
