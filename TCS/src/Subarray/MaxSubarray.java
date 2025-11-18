package Subarray;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = {5,2,-1,0,6,9};

        int k = 3;
        int sum = 0;
        int max = 0;
        for (int i = 0; i <=arr.length-k; i++) {
            sum = 0;
            for (int j = i; j <i+k ; j++) {
                sum = sum + arr[j];
            }

            if(sum > max){
                max = sum;
            }
        }

        System.out.println(max);
    }
}
