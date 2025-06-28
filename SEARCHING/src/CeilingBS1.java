public class CeilingBS1 {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,15,17,18};
        int target =16;
        int ans = Ceiling(arr , target);
        System.out.println(ans);
    }

    static int Ceiling(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;

        if(target > nums[nums.length-1]){  // the use of this is if the target element greater then the array  length it will return -1;
            return -1;
        }
        while(start<=end){
            int mid = start + (end - start)/2;

            if(target<nums[mid]){
                end = mid -1;
            }else if(target>nums[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }return start;

    }
}
