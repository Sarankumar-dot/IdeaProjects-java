package Recursion28and29;

public class BinarySearchUsingRecursion {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,66,67,77};
        int target = 67;
        System.out.println(search(arr,target,0,arr.length-1));

    }

    static int search(int[] arr,int target,int start,int end){

        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(start>end){
            return -1;
        }
        // recursive steps

        if(target < arr[mid]){
            return search(arr,target,start,mid-1);
        }

        return search(arr,target,mid+1,end);
    }
}
