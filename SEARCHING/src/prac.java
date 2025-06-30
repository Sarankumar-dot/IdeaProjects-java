import java.util.Arrays;

public class prac {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
//        int[] ans = search(arr,3);
//        System.out.println(Arrays.toString(ans));

        int ans = dup(arr);
        System.out.println(ans);
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

    static int dup(int[] arr){
        int i = 0;

        while(i<arr.length){
            int correctIndex = arr[i] -1;

            if(arr[i] != arr[correctIndex]){
                swap(arr , i ,correctIndex);
            }else{
                i++;
            }
        }

        for (int j = 0; j <arr.length ; j++) {
            if(arr[j] != j+1){
                return arr[j];
            }
        }
        return -1;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}

