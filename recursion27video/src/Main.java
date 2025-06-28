public class Main {
    public static void main(String[] args) {
         int ans =  makezero(5055000);
        System.out.println(ans);

    }

    static void zeroo(int n){
        if(n==0){
            return;
        }
       // System.out.println(n);
        zeroo(n-1);
        System.out.println(n);
    }

    static int prod(int n){
        if(n<=1){
            return 1;
        }

        return n * prod(n-1);

    }

    static int sumofdig(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + sumofdig(n/10);
    }

    static int  count(int n){
        return helper(n,0);
    }

    static int helper(int n,int c){
        if(n==0){
            return c;
        }

        int rem = n%10;
        if(rem ==0){
            return helper(n/10,c+1);
        }

        return helper(n/10,c);
    }

    static int makezero(int n){
        return helperr(n,0);
    }
    static int helperr(int n,int steps){
        if(n==0){
            return steps;
        }

        if(n%2 ==0){
            return helper(n/10,steps+1);
        }

        return helper(n-1,steps+1);
    }
}
