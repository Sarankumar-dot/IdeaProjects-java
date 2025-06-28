import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] nums = {112, 33, 44, 44, 55};
        System.out.println(findNumber(nums));

    }

    static int findNumber(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (even(i)){
                count++;
            }
        }return count;
    }

    static boolean even(int i){
        int numberofdigits = digits(i);

        if(digits(i)%2==0){
            return true;
        }return false;

    }

    static int digits(int num){
        int count = 0;

        while(num>0){
            count++;
            num = num/10;

        }return count;
    }

}