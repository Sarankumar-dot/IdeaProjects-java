package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 1;
        int ans = OrderAgnosticBS(arr,target);
        System.out.println(ans);

    }

    static int OrderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
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