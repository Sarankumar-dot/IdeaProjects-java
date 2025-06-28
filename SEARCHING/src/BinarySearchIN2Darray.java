import java.util.Arrays;

public class BinarySearchIN2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int[] ans  =search(arr,28);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;

        while(row<matrix.length && col>=0){

            if(matrix[row][col] == target){
                return new int[] {row,col};
            }

            if(matrix[row][col] >target){
                col--;
            }else{
                row++;
            }
        }

        return new int[] {-1,-1};

    }
}
