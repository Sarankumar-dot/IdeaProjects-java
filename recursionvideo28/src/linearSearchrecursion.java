import java.util.ArrayList;

public class linearSearchrecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,5};
        ArrayList<Integer> ans = linear2(arr,0,5,list);
        System.out.println(ans);

    }

    // normal method
    static int linear1(int[] arr,int i,int target){
        if(i>arr.length-1){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }

        return linear1(arr,i+1,target);

    }

    // finding all the indexes of target
    static ArrayList<Integer> list  = new ArrayList<>();
    static ArrayList<Integer> linear2(int[] arr,int i,int target ,ArrayList<Integer> list){
        if(i>arr.length-1){
            return list;
        }

        if(arr[i]==target){
            list.add(i);
        }

        return linear2(arr,i+1,target,list);
    }
}
