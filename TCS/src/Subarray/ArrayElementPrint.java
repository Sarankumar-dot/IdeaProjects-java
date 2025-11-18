package Subarray;

public class ArrayElementPrint {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for(int i = 0;i<=arr.length-3;i++){
            for (int j = i; j <i+3 ; j++) {
                System.out.print(arr[j] +" ");
            }
            System.out.println();
        }
    }
}
