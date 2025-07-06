public class oddeven{
    public static void main(String[] args) {
        System.out.println(oddeven(29991));
    }


    static String oddeven(int n) {
        if ((n & 1) == 1) {
            return "odd";
        }
        return "even";
    }
}



