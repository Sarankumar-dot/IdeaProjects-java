public class BinaryNumber {
    public static void main(String[] args) {
        int n = 8;

        String s  =Integer.toBinaryString(n);
        System.out.println(s);

        String ans = "";
        while(n > 0){
            ans = (n%2) + ans;
            n/=2;
        }

        System.out.println(Integer.parseInt(ans));
        //System.out.println(Integer.getInteger());
    }
}
