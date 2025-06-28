import java.util.Scanner;

public class SumOfNnumbersd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter element" +i+" :");
            arr[i] = sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum +=arr[i];

        }
        System.out.println(sum);
    }


}
