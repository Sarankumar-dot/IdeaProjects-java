import java.util.Arrays;
import java.util.Scanner;
public class LinearIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a target number:");
        int target = sc.nextInt();
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));


    }

    static int[] search(int[][] arr , int target){
        if(arr.length == 0){
            return new int[] {0};

        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target){
                    // return new int[] is added because it does not know if the array is exists or not
                    return new int[] {row,col};
                }

            }

        }return new int[] {-1};


    }
}
