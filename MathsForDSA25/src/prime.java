public class prime {
    public static void main(String[] args) {
        int n =20;
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {// this step is used to print the prime num only
                System.out.println(i + " " + isPrime(i));

            }
        }

    }

    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        int c = 2;
        while(c*c <=n){
            if(n%c==0){
                return false;
            }else{
                c++;
            }
        }return true;

    }
}
