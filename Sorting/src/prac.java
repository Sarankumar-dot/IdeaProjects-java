import java.util.ArrayList;
import java.util.Arrays;


public class prac {
    public static void main(String[] args) {
        int[] arr = {0,2,3,6,7,8};
        ArrayList<Integer> ans = allDIS2(arr);
        System.out.println(ans);



    }


    // find all the numbers disappeared in an array

    // 1 to n
    static ArrayList<Integer> allDIS(int[] arr){
        int i = 0;

        while(i < arr.length) {
            int correctIndex = arr[i] -1;

            if(arr[i] > 0 && arr[i] <=arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j] != j+1){
                list.add(j+1);
            }
        }
        return list;
    }

    // find all the numbers disappeared in an array

    // 0 to n
    static ArrayList<Integer> allDIS2(int[] arr){
        int i = 0;

        while(i < arr.length) {
            int correctIndex = arr[i];

            if(arr[i] <arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j] != j){
                list.add(j);
            }
        }
        return list;
    }


    // swap for all
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
