package Subarray;

public class BalancedinArr {
    public static void main(String[] args) {
        int[] arr = {9,0,0,-1,5,2,2};

        int left = 0;
        int right = 0;
        boolean isOk= false;
        for (int i = 0; i < arr.length ; i++) {
            left+=arr[i];
            right = 0;
            for (int j = i+2; j <arr.length ; j++) {
                right+=arr[j];
            }

            if(left == right){
                System.out.print(i+1);
                isOk = true;
                break;
            }
        }

        if(isOk ==false){
            System.out.println("Not found");
        }


    }
}

