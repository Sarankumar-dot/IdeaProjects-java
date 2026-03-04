package TwoPointers;

public class CountInversions {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {2, 3, 4, 5, 6};

        for(int i = 0;i<arr.length-1;i++){
            for (int j = i+1; j < arr.length ; j++) {
                if(i<j){
                    if(arr[i] > arr[j]){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
