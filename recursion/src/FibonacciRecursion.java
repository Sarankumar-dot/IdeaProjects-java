public class FibonacciRecursion {
    public static void main(String[] args){
        // code for fibo
      for (long i = 0;i<=50;i++){
           System.out.print(fibo((int) i) + " ");
      }

      int ans = Math.pow(2,5);
      

        // code for factorial
       int ans = fact(5);
       System.out.println(ans);
    }


    static long fiboformula(long n){
        // fibonacci formula
        return Math.pow
        return (long) (Math.pow(((1+ Math.sqrt(5))/2),n) / Math.sqrt(5));

    }

    static int fibo(int n){
        // base condition
        if(n<2){
            return n;
        }
        // recursive code
        return fibo(n-1)+fibo(n-2);
    }

    static int fact(int n){
        if(n==1){
            return n;
        }

        return n *fact(n-1);
    }
}
