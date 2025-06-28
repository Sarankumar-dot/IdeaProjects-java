import java.util.Arrays;

public class MergeSortvideo29 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,5};
        int[] ans = mergerSor(arr);
        System.out.println(Arrays.toString(ans));

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

    static int[] merge(int[] first , int[] second){

        int[] mix =new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){

            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }

            k++;
        }
        // it may be possible that one array may be incomplete to merge
        //so we find that array and ,merge all the elements in the last of the m,ix array
        while(i< first.length){
            mix[k] = first[i];
            k++;
            i++;
        }

        while(j< second.length){
            mix[k] = second[j];
            k++;
            j++;
        }

    return mix;
    }
}




 