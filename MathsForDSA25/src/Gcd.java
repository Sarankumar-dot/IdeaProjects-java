public class Gcd {
    public static void main(String[] args) {
        System.out.println(lcm(16,200));
        System.out.println(gcd(3,14));
    }

    static int gcd(int a , int b){

        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    static int lcm(int a,int b){
        return a*b / gcd(a,b);
    }
}
