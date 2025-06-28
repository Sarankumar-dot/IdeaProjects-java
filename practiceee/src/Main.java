public class Main{
    public static void main(String[] args) {

        pattern(5);

        int[] arr ={1,2,3,4,5};
        int ans = binarySearch(arr,5,0,arr.length-1);
        System.out.println(ans);


        int ans2 = linearSearch(arr,5,0);
        System.out.println(ans);
    }

    static void pattern(int n){


        for (int i = 0; i <n; i++) {


        for (int j= 0; j <n-i ; j++) {
            System.out.print(" ");
        }


            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        for (int i = 0; i <= n-1; i++) {


            for (int j = 0; j <=i; j++) {
                System.out.print(" ");

            }


            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }

    static int binarySearch(int[] arr , int target , int start , int end){

        int mid = start + (end-start) /2;

        if(arr[mid] == target){
            return mid;
        }

        if(start>end){
            return -1;
        }

        if (arr[mid] > target) {
            binarySearch(arr,target,start,mid-1);
        }

        return binarySearch(arr,target,mid+1,end);
    }

    static int linearSearch(int[] arr, int target,int index){

        if(arr[index]==target){
            return index;
        }

        return linearSearch(arr,target,index+1);

    }

    static void String(String p,String up){

        if(up.isEmpty()){
            return;
        }

        char ch =up.charAt(0);

        String(p + ch ,up.substring(1));

    }



}