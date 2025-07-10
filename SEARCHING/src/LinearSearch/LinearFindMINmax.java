package LinearSearch;

public class LinearFindMINmax {
    public static void main(String[] args) {
        int[] nums = {34,645,343,77,22,11,65};
        System.out.println(min(nums));
        System.out.println(max(nums));

    }
    // method for finding ,minimum
    static int min(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int min = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return min;
    }
   //function for returning maximum number in an array
    static int max(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
}
