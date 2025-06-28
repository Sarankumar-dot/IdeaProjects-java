public class sumofdigits {
    public static void main(String[] args) {
        int num = 5555;
        int sum = 0;
        while(num>0){
            int lastdigit = num%10;
            sum+=lastdigit;
            num = num/10;
        }

        System.out.println(sum);
    }


}
