import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr){

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 1; j < arr.length-i; j++) {  //here we are putting -i in length because it avoid the largest last elemwnt in the array
                if(arr[j] <arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }
        }
    }

}