

public class LinearSearchInRANGE {
    public static void main(String[] args) {
        int[] arr = {1,2,34,6,5};
        int target = 5;
        System.out.println(Linearsearch(arr,target,1,5));

    }

    static int Linearsearch(int[] arr,int target,int start,int end) {
        if(arr.length == 0) {
            return -1;
        }

        // for loop for checking the array elements

        for(int index = start;index<end;index++) {
            int arrElement = arr[index];
            if(arrElement == target) {
                return index;
            }
        }
        return -1;

    }

}
