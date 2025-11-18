package Subarray;

public class ALLMaxInSub {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        int max = 0;
        for (int i = 0; i <=arr.length-k ; i++) {
            for (int j = i; j <i+k ; j++) {
                if(arr[j] > max){
                    max = arr[j];
                }

            }
            System.out.print(max +" ");
            max = 0;
        }
    }
}
