package Saran.StriverRecursion;

import java.sql.SQLOutput;
import java.util.*;

public class StriverRecursion {
    public static void main(String[] args) {
//        name(5);
//        num(5);
//        System.out.println();
//        sum(3,0);
//
//        System.out.println();
//        System.out.println(sum(5));
//
//
//        System.out.println();
//        fact(5,1);
//
//        int ans = fact(5);
//        System.out.println(ans);

//        int[] arr = {1, 2, 3, 4, 5};
//        ArrRecursion(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//
//
//        int[] arr2 = {6, 7, 8, 9, 10};
//        arrRec2(arr2, 0);
//        System.out.println(Arrays.toString(arr2));
//
//        String s = "saras";
//        System.out.println(StringPalin(s, 0));
//
//        fibonacci(6);
//        System.out.println(fibo(6));
//
//        System.out.println(fiboFormula(6));

        int[] aa = {3,1,2};
        IntSubs(aa,0,list);


    }

    static ArrayList<String> ans(int[] arr) {
        ArrayList<String> ans = new ArrayList<>();
        int start = arr[0];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i + 1] == arr[i] + 1) {
                count++;
            } else {
                ans.add(start - 1 + "+" + count);
                start = arr[i];
                count = 1;
            }
        }

        ans.add(start - 1 + "+" + count);
        return ans;
    }

    static void name(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("saran");
        name(n - 1);
    }

    static void num(int n) {
        if (n < 0) {
            return;
        }

        System.out.print(n + " ");
        num(n - 1);
        System.out.print(n + " ");
    }

    // sum of n nums
    static void sum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }

        sum(n - 1, sum + n);
    }

    // another way

    static int sum(int n) {
        if (n < 1) {
            return 0;
        }

        return n + sum(n - 1);
    }

    // factorial
    static void fact(int n, int fact) {
        if (n == 0) {
            System.out.println(fact);
            return;
        }


        fact(n - 1, fact * n);
    }

    // another way
    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }


        return n * fact(n - 1);
    }

    // reversing an array using recursion
    static void ArrRecursion(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        swap(arr, l, r);
        ArrRecursion(arr, l + 1, r - 1);
    }

    // another method without using two pointers and by using 1 pointer
    static void arrRec2(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return;
        }

        swap(arr, i, arr.length - i - 1);
        arrRec2(arr, i + 1);

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static boolean StringPalin(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return StringPalin(s, i + 1);
    }

    // fibonacci non recursive
    static void fibonacci(int n) {
        int i = 0;
        int j = 1;
        int num3 = 0;
        for (int k = 3; k <= n; k++) {
            num3 = i + j;
            i = j;
            j = num3;
        }
        System.out.println(num3);
    }

    // recursive code
    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        // recursive fibo time comp is nearly o(2^n) exponential time complexity

        return fibo(n - 1) + fibo(n - 2);
    }

    static int fiboFormula(int n) {
        return (int) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
    }

    ///  video 6
    // subsequences -- a contigious or non contigious sequence which follows the order of the array
    // eg 1,2,3 -- the subs are 1 2 3 12  13 23 123

    // we are using a method called take and ignore
    static ArrayList<Integer> list = new ArrayList<>();
    static void IntSubs(int[] arr,int index,ArrayList<Integer> list){
        if(index==arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        IntSubs(arr,index+1,list);
        list.removeLast();
        IntSubs(arr,index+1,list);
    }


}
