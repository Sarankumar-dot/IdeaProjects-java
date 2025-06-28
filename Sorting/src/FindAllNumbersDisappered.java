import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// leetcode 448
public class FindAllNumbersDisappered {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8};
        System.out.println(missingnumber1(arr));


    }
    // code for  1 to n
    static ArrayList<Integer> missingnumber1(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                list.add(index + 1);
            }
        }

        return list;
    }

    //another  correct code for 0to n
    static ArrayList<Integer> missingnumber2(int[] arr){
        int i=0;

        while(i<arr.length){
            int correctIndex = arr[i];

            if(arr[i] <arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                list.add(index);
            }

        }return list;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
