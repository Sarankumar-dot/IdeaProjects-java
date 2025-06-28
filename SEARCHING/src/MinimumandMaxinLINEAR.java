public class MinimumandMaxinLINEAR {
    public static void main(String[] args) {
        int[] arr = {323,33,44,4556,77755,222};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
// code for min
    static int min(int[] arr){
        if(arr.length==0){
            return 0;
        }

        int min = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }


        }return min;
    }
//code for max
    static int max(int[] arr){
        if(arr.length==0){
            return 0;
        }

        int max = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max =arr[i];
            }


        }return max;
    }


}
