import java.util.Arrays;

public class prac {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,3,3};
        int[] ans = search(arr,3);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[] arr,int target){
        int[] ans = {-1,-1};

        int start = binary(arr,target,true );
        int end  = binary(arr,target,false);

        ans[0] = start;
        ans[1]= end;

        return ans;
    }

    static int binary(int[] arr,int target,boolean Findstart){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(Findstart){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

