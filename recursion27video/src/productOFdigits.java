public class productOFdigits {
    public static void main(String[] args){
        int ans = prodofdig1(802);
        System.out.println(ans);

        //prodofdigit(55);

    }
    // normal method
    static void prodofdigit(int n){
        int ans = 1;
        while(n>0) {
            int lastdigit = n % 10;
            ans = ans * lastdigit;
            n = n /10;
        }

        System.out.println(ans);

    }

    //recursive method complexity is log(n)
    static int prodofdig1(int n){
        if(n%10==n){  // (or)if(n<=1) {
            return n;//    return 1;
        }            //  }

        return (n%10) * prodofdig1(n/10);
    }
}
