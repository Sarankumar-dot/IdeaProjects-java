public class linearSearch1 {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,5};
        int target = 5;
        linearsearch(nums,target);


    }

    static void linearsearch(int[] arr,int target){
        if(arr.length==0){
            System.out.println("Array is empty");

        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("the element found at" +" "+i);
            }
            }
        }
    }



