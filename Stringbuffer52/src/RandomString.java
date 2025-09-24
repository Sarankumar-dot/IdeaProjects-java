import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        int n = 20;
        StringBuffer sb = new StringBuffer();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int num = random.nextInt(10) %10;
            sb.append((char) (num + 65));
            System.out.println(num);
        }
        System.out.println(sb);
    }
}
