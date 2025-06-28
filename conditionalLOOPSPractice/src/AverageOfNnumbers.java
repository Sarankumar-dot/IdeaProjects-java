import java.util.Scanner;

public class AverageOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total numbers :" );
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }

        double average = sum /n;

        System.out.println(average);
    }
}