import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        fibonacci(10);


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


}
