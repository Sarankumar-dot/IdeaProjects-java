public class sumOFnNUMBERS {
    public static void main(String[] args) {
        int ans = sumofn(6);
        System.out.println(ans);

    }

    static int sumofn(int n){
        if(n<=1){
            return 1;
        }

        return n + sumofn(n-1);
    }
}
