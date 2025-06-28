import java.util.ArrayList;
import java.util.Arrays;

public class PRACTICE {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 7;

//        int ans = ceiling(arr,target);
//        System.out.println(ans);

//        int ans = infinite(arr,target);
//        System.out.println(ans);

//        int ans = peakIndex(arr);
//        System.out.println(ans);

//        selection(arr);
//        System.out.println(Arrays.toString(arr));

//        cycle(arr);
//        System.out.println(Arrays.toString(arr));

        int ans =missingNumber(arr);
        System.out.println(ans);



    }

    static int bs(int[] arr , int target , int start , int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int orderagnosticbs(int[] arr , int target , int start , int end) {
        boolean asc = false;
        if(arr[start] < arr[end]){
            asc = true;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if(asc==true){
            if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start=mid+1;
            }
            }else{
                if (arr[mid] < target) {
                    end = mid - 1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    // ceiling of a number

    static int ceiling(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    static int floor(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    static int[] firstandlast(int[] arr , int target){
        int[] ans = {-1,-1};

        int start = anss(arr,target,true);
        int end = anss(arr,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int anss(int[] arr , int target,boolean findsTART){
        int ans = -1;

        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] > target){
                end=mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                ans=mid;
                if(findsTART){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }

        return ans;
    }

    // infinite array bs

    static int infinite(int[] arr ,int target){

        int start = 0;
        int end = 1;

        if(target>arr[arr.length-1]){
            return -1;
        }

        while(target > arr[end]){
            int newstart = end+1;
            end = end + (end - start +1) * 2;
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
            start = newstart;
        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){


        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    // peak element in mountain array

    static int peakIndex(int[] arr){

        int start = 0;
        int end = arr.length-1;


        while(start < end){
            int mid = start + (end -start) /2;

            if(arr[mid] > arr[mid+1]){
                end=mid;
            }else{
                start = mid+1;
            }


        }
        return start;
    }


    // bubble sort

    static void bubble(int [] arr){

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 1; j <arr.length-i ; j++) {

                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j - 1);
                }
            }

        }
    }

    // selection sort

    static void selection(int[] arr){

        for (int i = 0; i <arr.length ; i++) {

            int last = arr.length-1 -i;
            int max = max(arr,0,last);

            swap(arr,max,last);

        }
    }

    static int max(int[] arr , int start , int last){
        int max =start;

        for (int i = 0; i <=last ; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    // cyclic sort

    static void cycle(int[] arr){

        int i=0;

        while(i<arr.length){
            int correctIndex = arr[i] -1;

            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }

    // missing number in an array
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


    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }

}
