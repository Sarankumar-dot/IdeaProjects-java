import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println(random.nextFloat());
        System.out.println(random.nextInt());
        // constructor 1
        StringBuffer sb = new StringBuffer();

        // constructor 2
        StringBuffer sb2 = new StringBuffer("saran");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        sb.append("saran");
        sb.append(" "+5);
        System.out.println(sb.capacity()); // return the capacity of a string which is default by 16
        sb.insert(0,"K ");

        sb.replace(2,7,"kumar"); // end is not inclusive

        sb.reverse();
        System.out.println(sb2.indexOf("saran"));
        System.out.println(sb2.lastIndexOf("sar"));

        System.out.println(sb2.codePointAt(0)); //returns ascii value of a character

        System.out.println(sb2.codePointCount(0,sb2.length()));



        System.out.println(sb);

        // removing whitespaces

        String sentence = "   sara  n";

        System.out.println(sentence.replaceAll("\\s+",""));

        // split

        String arr = "saran malik   ali   jimmy";
        String[] ans = arr.split("\\s+");
        System.out.println(Arrays.toString(ans));

        // rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));






    }
}
