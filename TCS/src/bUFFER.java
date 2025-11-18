import java.io.*;
public class bUFFER {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int num = Integer.parseInt(bf.readLine());
        System.out.println(s +" "+num);
    }
}
