import java.util.Arrays;

public class InPlaceReversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int i = 0;
        int j = arr.length-1;

        while (i< j){
            swap(arr,i,j);
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int n,int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
}
