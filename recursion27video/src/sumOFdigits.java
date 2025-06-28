public class sumOFdigits {
    public static void main(String[] args){
        int ans = sumofdig(555);
        System.out.println(ans);

    }
    // normal method
    static void sumofdigit(int n){
        int ans = 0;
        while(n>0) {
            int lastdigit = n % 10;
            ans = ans + lastdigit;
            n = n /10;
        }

        System.out.println(ans);

    }

    //recursive method complexity is log(n)
    static int sumofdig(int n){
        if(n==0){
            return 0;
        }

        return (n%10)+sumofdig(n/10);
    }
}
