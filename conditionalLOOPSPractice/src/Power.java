import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter power n");
        int n = sc.nextInt();

        System.out.println("enter power");
        int power = sc.nextInt();

        int ans = power(n,power);
        System.out.println(ans);




    }

    static int power(int number,int power) {


        int powerr = 1;

            for (int i = 1; i <=power; i++) {
                powerr = powerr*number;

            }


        return powerr;
    }

}
