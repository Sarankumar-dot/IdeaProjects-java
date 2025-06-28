import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,1,4,2};
        System.out.println(findDuplicates(arr));
    }
     static List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        while(i<nums.length){
            int correctIndex  = nums[i] -1 ; // -1 is used because we are the array contains the elments starting from 1

            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<Integer>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                if (! ans.contains(nums[index])) {
                    ans.add(nums[index]);
                }
            }

        }return ans;


    }
    static void swap(int[] arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
