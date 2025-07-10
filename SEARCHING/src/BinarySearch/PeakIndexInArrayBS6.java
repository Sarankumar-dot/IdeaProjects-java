package BinarySearch;

public class PeakIndexInArrayBS6 {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

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
}
