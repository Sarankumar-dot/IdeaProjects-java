package Introduction1;

public class Practice {
    public static void main(String[] args) {
//        fibonacci(10);

//        print1(5);

//        System.out.println();
//        int ans = fact(5);
//        System.out.println(ans);

       int ans =  fibo(6);
        System.out.println(ans);

    }
    /*static int palindrome(){
        for (int num = 200; num <= 1000; num++) {
            int originalnum = num;
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digits = temp % 10;
                sum = sum * 10 + digits;
                temp = temp / 10;

            }
            if (sum == originalnum) {
                System.out.println(sum);
            }

        }
    }*/

    static void print1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print1(n-1);

    }

    static int fact(int n){
        if(n==0){
            return 1;
        }

        return n * fact(n-1);
    }

    static void fibonacci(int n){
        int num1 = 0;
        int num2 = 1;

        for(int i =1;i<=n;i++) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

    }

    static int  fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }


}
