import java.util.Scanner;

public class diSTANCEbetweentwopoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =1;
        while (n > 0) {
            int distance;
            System.out.println("enter speed in km/hr");
            int speed = sc.nextInt();

            System.out.println("enter time in hr");
            int time = sc.nextInt();
            distance = speed * time;
            System.out.println("the distance is" + distance+" km");

        }
    }
}