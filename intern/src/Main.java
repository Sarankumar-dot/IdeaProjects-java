import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects : " );
        int n = sc.nextInt(); // number of subjects
        int marksum=0;

        for (int i = 1; i <=n ; i++) {
            System.out.print(" enter mark" + i + ": ");
            marksum += sc.nextInt();
        }

        double average = (double) marksum / n;

        System.out.println(average);

        if(average <= 40){
            System.out.println("Fail");
        } else if (average>40 && average <=60) {
            System.out.println("C-grade");
        } else if (average >60 && average <=80) {
            System.out.println("B-grade");
        } else if (average>80) {
            System.out.println("A-grade");
        }


    }
}
