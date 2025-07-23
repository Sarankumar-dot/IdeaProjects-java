import java.util.Arrays;

public class Perfect {
    public static void main(String[] args) {
        int[] arr = {7,11,2,15};
        int target = 9;

        int[] ans = target(arr,target);
        System.out.println(Arrays.toString(ans));

        String s = "saran";
        s.startsWith("saran",0);


    }

    // two sum
    static int[] target(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(j!=i && arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
