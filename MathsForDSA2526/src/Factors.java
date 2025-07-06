import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
        System.out.println((factor(20)));


    }

    static ArrayList factor(int n){
        ArrayList <Integer> factors = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
                if (n % i == 0) {
                    factors.add(i);
                }
        }
        return factors;
    }
}
