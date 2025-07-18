package LinkedListTutorial.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        int[] index ={0,1,2,3,0};
        int[] nums = {1,2,3,4,0};

        List<Integer> ans = new ArrayList<>();
        int[] target = new int[nums.length];

        for(int i = 0 ; i< nums.length ;i++ ){
            ans.add(index[i] , nums[i]);
        }

        for(int i=0;i<nums.length ;i++){
            target[i] = ans.get(i);
        }

        System.out.println(Arrays.toString(target));

        char ch = (char)'a' + 1;
        System.out.println(ch);
    }
}
