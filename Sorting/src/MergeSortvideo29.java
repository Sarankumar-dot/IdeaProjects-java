import java.util.*;

public class MergeSortvideo29 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,5};
        int[] ans = mergerSor(arr);
        System.out.println(Arrays.toString(ans));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergerSor(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergerSor(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergerSor(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left , int[] right){

        int[] mix =new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<left.length && j<right.length){

            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }

            k++;
        }
        // it may be possible that one array may be incomplete to merge
        //so we find that array and ,merge all the elements in the last of the m,ix array
        while(i< left.length){
            mix[k] = left[i];
            k++;
            i++;
        }

        while(j< right.length){
            mix[k] = right[j];
            k++;
            j++;
        }

    return mix;
    }
}




 