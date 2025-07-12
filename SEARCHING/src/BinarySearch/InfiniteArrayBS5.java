package BinarySearch;

public class InfiniteArrayBS5 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,9,10,11,12,15,20,33};
        int target = 33;

        int ans = search(arr,target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target){


        int start = 0;
        int end = 1;

        if(target > arr[arr.length-1]){
            return -1;
        }

        while(target>arr[end]){
            int newStart = end +1;
            end = end +(end - start +1 ) *2;

            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }

            start = newStart;


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
}
