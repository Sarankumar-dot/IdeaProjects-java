public class fibonacci {
    public static void main(String[] args) {
        fibo(10);

    }

    static void fibo(int n){
        int num1 = 0;
        int num2 =1;


        for (int i = 0; i <=n; i++) {
            System.out.print(num1 +",");
            int num3 =num1+num2;

            num1 = num2;
            num2 = num3;
        }


    }
}