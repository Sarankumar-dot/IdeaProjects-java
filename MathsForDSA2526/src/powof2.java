public class powof2 {
    public static void main(String[] args) {
        int n = 11;

        boolean ans = (n&(n-1))==0;
        System.out.println(ans);
    }
}
