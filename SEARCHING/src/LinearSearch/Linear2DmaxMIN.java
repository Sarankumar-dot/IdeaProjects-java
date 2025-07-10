package LinearSearch;

public class Linear2DmaxMIN {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{4,6,5},{6,7,833}
        };
        int ans = max(arr);
        System.out.println(ans);


    }
//for max value
    static int max(int[][] arr){
        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]>max){
                    max = arr[row][col];

                }

            }

        }
        return max;

    }
//for min value
    static int min(int[][] arr){
        int min = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]< min){
                    min = arr[row][col];

                }

            }

        }
        return min;

    }
}
