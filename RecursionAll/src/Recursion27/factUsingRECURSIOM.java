package Recursion27;

public class factUsingRECURSIOM {
    public static void main(String[] args) {
        int ans = factREC(5);
        System.out.println(ans);

    }
   // factorial brute force
    static void fact(int n){

        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;

        }
        System.out.println(fact);
    }

    // factorial using recursion
    static int factREC(int n){
        if(n<=1){
            return 1;
        }

        return n * factREC(n-1);
    }
}
