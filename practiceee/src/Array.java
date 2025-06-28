import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {


        int[] arr = {1,1,2,3,3};

        ArrayList <Integer> ans = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            if(!ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }

        System.out.println(ans);


    }
}
