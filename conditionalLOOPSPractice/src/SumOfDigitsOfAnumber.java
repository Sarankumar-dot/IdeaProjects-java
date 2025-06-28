public class SumOfDigitsOfAnumber {
    public static void main(String[] args) {
        System.out.println(sum(5550));

    }

    static int sum(int num){
        int sum = 0;

        while(num>=1){
            int digits = num %10;
            sum+=digits;
            num = num/10;
        }
        return sum;
    }
}
