import java.util.*;
public class Stringmethods {
    public static void main(String[] args) {
        String name = "saran kumar";
        // converting a string into a char array
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // white spaces will be removed
        System.out.println("     saran     ".strip());
    }
}
