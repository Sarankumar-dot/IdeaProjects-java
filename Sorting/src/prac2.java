import java.util.ArrayList;

public class prac2 {
    public static void main(String[] args) {
        int[] arr  = {4, 3, 2, 7, 8, 3, 1};
        System.out.println(missingnumber(arr));

    }

    static ArrayList<Integer> missingnumber(int[] arr){
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
