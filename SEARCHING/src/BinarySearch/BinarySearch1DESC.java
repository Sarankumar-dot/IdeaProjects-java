package BinarySearch;

public class BinarySearch1DESC {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,5,4,3,2,2};
        int target = 5;

        int ans = binarysearchDESC(arr,target);
        System.out.println(ans);

    }

    static int binarysearchDESC(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target>arr[mid]){
                end = mid-1;
            }else if(target<arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }return -1;
    }
}
