import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        int[] arr  = {1,2,5,3,5};
        ArrayList<Integer> ans = linear(arr , 5,0,new ArrayList<>());
        System.out.println(ans);

//        int ans = linear1(arr,0,5);
//        System.out.println(ans);

    }

    static boolean sorted(int[] arr , int index){
        if(index== arr.length-1){
            return true;
        }

        return arr[index] < arr[index +1]  && sorted(arr,index+1);
     }


     static ArrayList<Integer> linear(int[] arr , int target , int index,ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return linear(arr,target,index+1,list);
     }

     static int linear1(int[] arr,int i , int target) {
        if(i==arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }

        return linear1(arr,i+1,target);
     }
}
