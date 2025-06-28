import java.util.Scanner;


public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        swap(num1,num2);

    }

    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("swapped numbers:"+num1+" "+num2);
    }
}
