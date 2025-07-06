public class problem10 {
    public static void main(String[] args) {
        int number = 20;
        // we are writing the prog to find how many digits in the number
        int base = 2;

        int ans = (int) (Math.log(number) / Math.log(base) +1);

        System.out.print(ans);  // time comp is log(n)
    }
}

