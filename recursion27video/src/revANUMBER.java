public class revANUMBER {
    // recursive solution
    static int sum = 0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10 + rem;
        rev1(n/10);

    }
    public static void main(String[] args){
        rev1(1234);
        System.out.println(sum);

    }



    // brute force combined with palindrome

    static void rev(int n){
        int original = n;
        int rev = 0;

        while(n>0){
            int last = n%10;
            rev = rev *10 + last;
            n = n/10;
        }
        System.out.println("reversed :" + rev + " original num :" +original );
        if(original == rev){
            System.out.println("it is palin");
        }else{
            System.out.println("it is not palin");
        }
    }
}
