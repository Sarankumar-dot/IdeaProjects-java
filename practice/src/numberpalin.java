public class numberpalin {
    public static void main(String[] args) {
        int number = 1511;
        int rev = 0;
        int original = number;
        while(number>0){
            int last = number%10;
            rev = rev *10 +last;
            number = number/10;

        }
        if(original == rev){
            System.out.println("it is palin");
        }else{
            System.out.println("not palin");
        }
    }
}
