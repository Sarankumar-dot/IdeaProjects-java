package Recursion27;

public class sumOFdigits {
    public static void main(String[] args) {
        boolean ans = palin(595);
        System.out.println(ans);

    }

    // normal method
    static void sumofdigit(int n) {
        int ans = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            ans = ans + lastdigit;
            n = n / 10;
        }

        System.out.println(ans);

    }

    //recursive method complexity is log(n)
    static int sumofdig(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumofdig(n / 10);
    }

    static int rev(int n) {
        int original = n;
        int rev = 0;
        while (n > 0) {

            int last = n % 10;
            rev = rev * 10 + last;
            n = n /10;
        }

        return rev;
    }

    static int rev = 0;
    static int recrev(int n){
        if(n==0){
            return rev;
        }
        int last = n %10;
        rev = rev *10 + last;

        return recrev(n/10);
    }

    static boolean palin(int n){
        int rev = recrev(n);

        if(n == rev){
            return true;
        }
        return false;
    }
}
