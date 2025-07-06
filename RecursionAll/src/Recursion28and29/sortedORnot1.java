package Recursion28and29;

public class sortedORnot1 {
    public static void main(String[] args){
        int[] arr ={1,2,3,8,5};
        boolean ans = sorted(arr,0);
        System.out.println(ans);


    }

    static boolean sorted(int[] arr ,int i){
        if(i ==arr.length -1 ){
            return true;
        }

        return arr[i] < arr[i+1] && sorted(arr,i+1);
    }
}