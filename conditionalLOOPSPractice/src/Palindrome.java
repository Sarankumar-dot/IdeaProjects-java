public class Palindrome {
    public static void main(String[] args) {

        for (int num = 100; num <=999; num++) {
            if(isPalindrome(num)){
                System.out.println(num);
            }

        }






    }

    static boolean isPalindrome(int num){
        int original = num;
        int reverseNum = 0;

        while(num>0){
            int lastdigit = num %10;
            reverseNum = reverseNum *10 +lastdigit;
            num = num/10;
        }
        return original == reverseNum;
    }
}
