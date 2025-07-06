package Recursion27;

public class recOP {

    public static void main(String[] args) {

        int ans = count(555400);
        System.out.println(ans);
    }

    static void one(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        one(n-1);
    }

    static int prod(int n){
        if(n==1){
            return 1;
        }

        return n * prod(n-1);
    }

    static int sum(int n){
        if(n==1){
            return n;
        }

        return n + sum(n-1);
    }

    static int sumdig(int n){

        if(n==0){
            return 1;
        }

        return n%10 * sumdig(n/10);
    }

    static int count(int n){
        return  helper(n , 0);
    }

    static int helper(int n, int count){
        if(n==0){
            return count;
        }

        int last = n%10;
        if(last == 0){
            return helper(n/10 , count+1);
        }

        return helper(n/10,count);
    }
}
