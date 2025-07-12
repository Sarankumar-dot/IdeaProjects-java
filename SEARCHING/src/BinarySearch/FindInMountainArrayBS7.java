package BinarySearch;

public class FindInMountainArrayBS7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;
        int ans = ans(arr,target);
        System.out.println(ans);

    }

    static int ans(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr,target,0,peak);

        if(firstTry!=-1){
            return firstTry;
        }
        return OrderAgnosticBS(arr,target,peak,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
                // here we are checking if the mid element is greater than the mid +1 if greater we need to change end as mid because it will check if there is an element in the previous or before array
            }else{
                start = mid+1;
            }
            // in this both the start and end points the largest element in the array so we can return any one of them
        }return start;
    }
    static int OrderAgnosticBS(int[] arr , int target,int start,int end){

        boolean ascending = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(ascending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }return -1;
    }
}
